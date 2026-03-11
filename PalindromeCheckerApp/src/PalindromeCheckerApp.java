import java.util.*;

public class PalindromeCheckerApp {

    // Stack based palindrome check
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque based palindrome check
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Two pointer method
    public static boolean twoPointerPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Stack timing
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque timing
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Two pointer timing
        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(input);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        System.out.println("\nResults:");

        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        sc.close();
    }
}