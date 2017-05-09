import org.junit.Test;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.equals(""))
            return (Integer) 0;
        else
            return Integer.parseInt(numbers);
    }
}


