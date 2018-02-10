import exceptions.DivisionByZeroException;
import java.util.Scanner;

/**
 * Калькулятор
 *
 * @author Tatyana Boyko
 */
public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        User user = new User();

        try {
            do {
                user.selectOperation(scan);
                user.getCurrentOperation().setFirstOperand(scan);
                user.getCurrentOperation().setSecondOperand(scan);

                try {
                    user.getCurrentOperation().calculate();
                } catch (DivisionByZeroException e) {
                    System.out.println((char) 27 + "[31mНельзя делить на 0. Операция не выполнена. " + (char) 27 + "[0m");
                } catch (ArithmeticException e) {
                    System.out.println((char) 27 + "[31mОшибка вычисления операции. " + (char) 27 + "[0m");
                    System.out.println("Выброшено исключение:");
                    System.out.println(e.toString());
                }

            } while(user.selectNextOperation(scan));
        } catch(Exception e) {
            System.out.println((char) 27 + "[31m\nИзвините, произошла ошибка при работе приложения. " + (char)27 + "[0m");
            e.printStackTrace();
        }
    }
}
