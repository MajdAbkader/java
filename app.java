import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Map;




public static boolean isPalindrome(int number) {

    return number == IntStream.iterate(number, i -> i / 10)
        .map(n -> n % 10)
        .limit(String.valueOf(number).length())
        .reduce(0, (a, b) -> a = a * 10 + b);
}




public class FirstNonRepeatedCharFour {
    
    public static Character findFirstNonRepeatableChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
} 
    

    public static void main(String[] args)
    {
        String s = "hello";
        char ch = findFirstNonRepeatableChar(s);
        System.out.println( ch);
    }
}    