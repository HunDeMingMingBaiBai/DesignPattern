package u_InterpreterPattern21;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}