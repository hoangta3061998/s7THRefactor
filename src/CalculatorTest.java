class CalculatorTest {
    public static void main(String[] args) {
        int firstOperand = 5;
        int secondOperand = 0;
        char operator = '/';
        int expected = 15;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);
        System.out.println(result);
    }
}