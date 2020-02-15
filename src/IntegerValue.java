public class IntegerValue extends ArithmeticExpression implements Value, IntEvaluable {

    // make this instance variable privates as it is only set through the constructor
    private int val;

    public IntegerValue(int b){
        val = b;
    }

    @Override
    public Value evaluate() {
        return this;
    }

    @Override
    public int intEvaluate() {
        return val;
    }

    @Override
    public String toString() {
        return Integer.toString(val) ;
    }
}
