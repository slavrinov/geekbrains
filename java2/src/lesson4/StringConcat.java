package lesson4;

/**
 *
 */
public class StringConcat {

    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }


    static String reverse(String s) {
        StringBuilder builder = new StringBuilder();
        // abcd
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    // O(n)
    static String reverse2(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char tmp = arr[i];
            arr[i]  = arr[s.length() - 1 - i];
            arr[s.length() - 1 - i] = tmp;
        }
        return new String(arr);
    }

}
