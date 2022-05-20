import java.util.function.*;

public class Calculator {
    static Supplier <Calculator> instance = Calculator::new;

    BinaryOperator <Integer> plus = (x, y) -> x + y;
    BinaryOperator <Integer> minus = (x, y) -> x - y;
    BinaryOperator <Integer> multiply = (x, y) -> x * y;
    //    BinaryOperator<Integer> devide = (x, y) -> x / y;
    //    Данное выражение вызовет ошибку и выброс исключения в тех случаях, когда y = 0
    //    Чтобы этого избежать, реализуем проверку на ненулевой знаменатель с помощью тернарного оператора,
    //    который сделает результатом выражения 0 в такой ситуации
    BinaryOperator <Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator <Integer> pow = x -> x * x;
    UnaryOperator <Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate <Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
