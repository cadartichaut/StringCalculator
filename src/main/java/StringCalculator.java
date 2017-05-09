import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String numbers){
        List<String> numList = Arrays.asList(numbers.split(","));

        if (numList.size() == 1) {
            if (numbers.equals(""))
                return 0;
            else
                return Integer.parseInt(numbers);
        } else {
            return numList.stream().map(Integer::parseInt).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
        }
    }
}


