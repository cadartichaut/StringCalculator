import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String numbers){
        List<String> numList = Arrays.asList(numbers.split("[^0-9-]+"));

        Collections.replaceAll(numList, "", "0");

        List<String> negatives = new ArrayList<>();

        numList.forEach((number) -> {
            if (Integer.parseInt(number) < 0) {
                negatives.add(number);
            }
        });

        if (negatives.size() > 0)
            throw new RuntimeException("Negatives not allowed : " + negatives.stream().collect(Collectors.joining(",")));


        return numList.stream().map(Integer::parseInt).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
    }
}


