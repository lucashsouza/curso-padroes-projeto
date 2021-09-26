package br.com.cod3r.strategy.calc.after;

import br.com.cod3r.strategy.calc.after.strategies.AddictionOperation;
import br.com.cod3r.strategy.calc.after.strategies.DivisionOperation;
import br.com.cod3r.strategy.calc.after.strategies.MultiplyOperation;
import br.com.cod3r.strategy.calc.after.strategies.SubtractionOperation;

public class Client {

    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 2);
        System.out.println(calc.getResult(new AddictionOperation()));
        System.out.println(calc.getResult(new SubtractionOperation()));
        System.out.println(calc.getResult(new MultiplyOperation()));
        System.out.println(calc.getResult(new DivisionOperation()));

        // Functional Interface
        System.out.println(calc.getResult((n1, n2) -> {
            return (int) Math.pow(n1, n2);
        }));
    }
}
