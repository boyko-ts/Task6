package operations;

/**
 * Умножение
 *
 * @author Tatyana Boyko
 */
public class Multiplication extends Operation implements Calculable {

    public Multiplication() {
        super();
    }

    /**
     * Вычисляет операцию умножения
     *
     * @return Результат вычисления операции умножения
     */
    public float calculate() {
        System.out.println("Выполняется операция умножения.");
        float result = super.getFirstOperand() * super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}
