package model;

/**
 * Created by saipkri on 09/02/16.
 */
public class Calculation {
    private String numbers;
    private CalculationType operation;


    public String getNumbers() {
        return numbers;
    }

    public CalculationType getOperation() {
        return operation;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public void setOperation(CalculationType operation) {
        this.operation = operation;
    }
}
