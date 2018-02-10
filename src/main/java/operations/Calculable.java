package operations;

import exceptions.DivisionByZeroException;

/**
 * Вычисляемый
 *
 * @author Tatyana Boyko
 */
public interface Calculable {
    float calculate() throws DivisionByZeroException;
}
