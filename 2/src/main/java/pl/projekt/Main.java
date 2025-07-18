package pl.projekt;

import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5);

        int sum = reduce(list, (a,b) ->a+b,0);
        System.out.println("Sum: " + sum);  //

        int power = reduce(list, (a, b)-> a *b, 1);
        System.out.println("Square: " + power);
    }

    private static <T> T reduce(List<T> list, BiFunction<T, T, T> combiner, T initial){
        T result = initial;
        for (T item : list){
            result = combiner.apply(result, item);
        }
        return result;
    }
}