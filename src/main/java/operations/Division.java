package operations;
import exceptions.DivisionByZeroException;

import java.util.Scanner;

/**
 * Деление
 *
 * @author Tatyana Boyko
 */
public class Division extends Operation implements Calculable {

    public Division() {
        super();
    }

    /**
     * Вычисляет операцию деления
     *
     * @return Результат вычисления операции деления
     */
    public float calculate() throws DivisionByZeroException {
        System.out.println("Выполняется операция деления.");
        float result = -1;

        if (super.getSecondOperand() == 0) {
            throw new DivisionByZeroException();
        }

        try {
            result = super.getFirstOperand() / super.getSecondOperand();
            System.out.printf("Результат: %.4f\n", result);
            // NOTE: Данный catch не выпадает для величин типа float (по-этому сделан выброс исключения выше)
        } catch (ArithmeticException e) {
            System.out.println((char) 27 + "[31mНельзя делить на 0. Операция не выполнена. " + (char) 27 + "[0m");
        }
        return result;
    }
}