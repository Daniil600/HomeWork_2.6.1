import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 3, 4, 4, 2, 5, 5, 6, 12, 10, 7));

        String text = "But good morning! Good morning to ye and thou! "
                + "I’d say to all my patients, because I was the worse of the hypocrites, "
                + "of all the hypocrites, the cruel and phony hypocrites, I was the very worst.";


        text = text.replaceAll("[!,.]", "");
        List<String> textList = new ArrayList<>(List.of(text.split(" ")));

        task1(nums);

        System.out.println();
        System.out.println();

        task2(nums);

        System.out.println();
        System.out.println();

        task3(textList);

        System.out.println();
        System.out.println();

        task4(textList);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (!isEven(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> numSet = new TreeSet<>(nums);
        for (Integer num : numSet) {
            if (isEven(num)) {
                System.out.print(num + " ");
                ;
            }
        }
    }

    public static void task3(List<String> strings) {
        System.out.println(new HashSet<>(strings));
    }

    public static void task4(List<String> strings) {
        Collections.sort(strings);
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String string : strings) {
            if (stringIntegerMap.get(string) == null) {
                stringIntegerMap.put(string, 1);
            } else {
                stringIntegerMap.put(string, stringIntegerMap.get(string) + 1);
            }
        }
        System.out.println(stringIntegerMap);

    }

    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

}