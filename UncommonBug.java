public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        try {
            x = x / 0; //This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Re-throwing the exception without additional context.
            throw e; //This line will re-throw the caught exception
        }
        System.out.println("This line should not be printed."); //This line will not execute due to the exception
    }
}