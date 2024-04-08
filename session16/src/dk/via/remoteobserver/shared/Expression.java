package dk.via.remoteobserver.shared;

import java.io.Serializable;

public class Expression implements Serializable {
    private final double operand1;
    private final double operand2;
    private final char operator;

    public Expression(char operator, double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public char getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return String.format("%f %c %f", operand1, operator, operand2);
    }
}
