package assignment3.q2;

public class Context {

    MathOperation operation;

    public Context(MathOperation operation) {
        this.operation = operation;
    }

    public int execute(int num1, int num2){
        if(operation.getClass() == AddOperation.class){
            return num1 + num2;
        }else if(operation.getClass() == SubtractOperation.class){
            return num1 - num2;
        }else{
            return num1 * num2;
        }
    }
}
