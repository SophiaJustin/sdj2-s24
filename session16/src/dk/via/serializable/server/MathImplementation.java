package dk.via.serializable.server;

import dk.via.serializable.shared.Expression;
import dk.via.serializable.shared.Math;

import java.rmi.RemoteException;

public class MathImplementation implements Math {

    @Override
    public double compute(Expression e) throws RemoteException {
        return switch(e.getOperator()) {
            case '+' -> e.getOperand1() + e.getOperand2();
            case '-' -> e.getOperand1() - e.getOperand2();
            case '*' -> e.getOperand1() * e.getOperand2();
            case '/' -> e.getOperand1() / e.getOperand2();
            default -> throw new RemoteException("Unknown operator: " + e.getOperator());
        };
    }
}
