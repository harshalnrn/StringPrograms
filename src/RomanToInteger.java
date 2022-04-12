import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        String romanString = "MMMDCCXCIV";
        char[] romanCharArr = romanString.toCharArray();
        int sum = 0;
        //iterating roman characters
        for (int i = 0; i < romanCharArr.length; i++) {

            //lookup integer value
            if (i == 0) {
                sum = romanMap.get(romanCharArr[i]);
            } else {
                if (romanMap.get(romanCharArr[i - 1]) >= romanMap.get(romanCharArr[i])) {
                    //incrementally add
                    sum = sum + romanMap.get(romanCharArr[i]);
                } else {
                    sum = Math.abs(romanMap.get(romanCharArr[i]) - sum);
                }
            }

        }
        System.out.println(sum);
    }
}
