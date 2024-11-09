import app.models.Calculator;

public class MainProgram {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(5,5));
    }
}
