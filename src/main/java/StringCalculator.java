import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String numbers){
        List<String> numList = Arrays.asList(numbers.split(","));

        Collections.replaceAll(numList, "", "0");

        return numList.stream().map(Integer::parseInt).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
    }
}


