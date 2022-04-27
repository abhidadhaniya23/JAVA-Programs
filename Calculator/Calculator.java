package Calculator;
// calculator using command line args.

class Calculator {
    public static void main(String[] args) {
        float result = 0;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        char operation = args[1].charAt(0);
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        System.out.println("\nResult : " + a + " " + operation + " " + b + " = " + result + "\n");
    }
}