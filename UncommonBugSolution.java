public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        try {
            x = x / 0; 
        } catch (ArithmeticException e) {
            String message = "ArithmeticException caught: " + e.getMessage() + ". Error occurred while dividing by zero.";
            System.out.println(message);
            // Re-throwing the exception with additional context
            throw new ArithmeticException(message); //Improved by adding more detailed context
        }
    }
} 