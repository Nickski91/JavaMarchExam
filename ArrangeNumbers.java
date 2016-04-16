import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by HPpro on 16/04/2016 г..
 */
public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String elements = scan.nextLine();
        elements = elements.replace("0", "zero-");
        elements = elements.replace("1", "one-");
        elements = elements.replace("2", "two-");
        elements = elements.replace("3", "three-");
        elements = elements.replace("4", "four-");
        elements = elements.replace("5", "five-");
        elements = elements.replace("6", "six-");
        elements = elements.replace("7", "seven-");
        elements = elements.replace("8", "eight-");
        elements = elements.replace("9", "nine-");
        List<String > elementsArray = Arrays.asList(elements.split(", "));

        Collections.sort(elementsArray);

        String result = "";

        for (String element:elementsArray) {
            result += element + ", ";
        }

        result = result.replace("zero-" , "0");
        result = result.replace("one-" , "1");
        result = result.replace("two-" , "2");
        result = result.replace("three-" , "3");
        result = result.replace("four-" , "4");
        result = result.replace("five-" , "5");
        result = result.replace("six-" , "6");
        result = result.replace("seven-" , "7");
        result = result.replace("eight-", "8");
        result = result.replace("nine-" , "9");

        System.out.print(result.substring(0,result.length()-2));
    }
}
