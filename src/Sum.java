public class Sum {
    public static void main(String args[]) {
        System.out.println(factorial(5));
    }

    public static int factorial (int num) {
        int result = 1;
        int last;

        for (int i = num; i >= 0; i--) {
            result *= i;
        }
    return result    ;    
    }
}
