public abstract class Expression {
    public abstract Value evaluate();

    @Override
    public String toString() {
        String expression = evaluate().toString();
        if (expression == null) expression = "undefined";
        return expression;
    }

    @Override
    public boolean equals(Object obj) {
        boolean status;
        status = (obj instanceof Expression) && this.toString().equals(obj.toString());
        return status;
    }
}
