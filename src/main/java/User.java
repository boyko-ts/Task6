import operations.*;

import java.util.Scanner;

/**
 * Пользователь
 *
 * @author Tatyana Boyko
 */
public class User {

    /**
     * Текущая операция, выбранная пользователем
     */
    private Operation currentOperation;

    public User() {
    }

    /**
     * Получает выбранную пользователем операцию
     *
     * @return Название операции
     */
    public Operation getCurrentOperation() {
        return currentOperation;
    }

    /**
     * Устанавливает текущуюю операцию пользователя
     *
     * @param currentOperation Текущая операция
     */
    private void setCurrentOperation(Operation currentOperation) {
        this.currentOperation = currentOperation;
    }

    /**
     * Выбирает операцию калькулятора
     *
     * @param scan общий сканнер для консоли
     */
    public void selectOperation(Scanner scan) {
        System.out.print("Выберите операцию: ");
        switch (scan.next().charAt(0)) {
            case '+':
                this.setCurrentOperation(new Addition());
                break;
            case '-':
                this.setCurrentOperation(new Subtraction());
                break;
            case '*':
                this.setCurrentOperation(new Multiplication());
                break;
            case '/':
                this.setCurrentOperation(new Division());
                break;
            default:
                System.out.println("Не знаю такой операции. Значение не установлено.");
                this.selectOperation(scan);
                break;
        }
    };

    /**
     * Выбирает будет ли следующая операция в калькуляторе
     *
     * @param scan общий сканнер для консоли
     * @return флаг следующей операции
     */
    public Boolean selectNextOperation(Scanner scan) {
        System.out.println("\nТребуется ли ещё одна операция? (y/n) ");
        return (scan.next().equals("y"));
    };


}
