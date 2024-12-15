public class MainApp {
    public static void main(String[] args) {
        System.out.println("Application started...");

        // Example 1: Fatorial
        Fatorial fatorial = new Fatorial();
        int number = 5;
        int factorialResult = fatorial.resultadoFatorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);


        // Example 2: BigBrother
        BigBrother bigBrother = new BigBrother();
        bigBrother.adicionaBrother("Alice");
        bigBrother.adicionaBrother("Bob");
        bigBrother.votarBrother("Alice");
        bigBrother.votarBrother("Alice");
        System.out.println("Eliminated brother: " + bigBrother.brotherEliminado());

        // Example 3: Absoluto
        Absoluto absoluto = new Absoluto();
        int value = -10;
        int absoluteValue = absoluto.retornaValorAbsoluto(value);
        System.out.println("Absolute value of " + value + " is: " + absoluteValue);

        System.out.println("Application finished.");
    }
}
