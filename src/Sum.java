public class Sum extends ArithmeticExpression{

    public Sum(ArithmeticExpression a, ArithmeticExpression b) {
        operand1 = a;
        operand2 = b;
    }

    @Override
    public Value evaluate() {
        int kev = ((IntegerValue)operand1).intEvaluate() + ((IntegerValue)operand2).intEvaluate();
        return (IntegerValue)operand1;
    }
}
