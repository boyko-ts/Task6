package operations;

/**
 * Вычитание
 *
 * @author Tatyana Boyko
 */
public class Subtraction extends Operation implements Calculable {

    public Subtraction() {
        super();
    }

    /**
     * Вычисляет операцию вычитания
     *
     * @return Результат вычисления операции вычитания
     */
    public float calculate() {
        System.out.println("Выполняется операция вычитания.");
        float result = super.getFirstOperand() - super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}
