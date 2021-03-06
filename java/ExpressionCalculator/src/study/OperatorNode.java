package study;

public class OperatorNode extends ExpressionNode {

    private ExpressionNode left;
    private ExpressionNode right;
    private String opCode;
    
    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    public String getOpCode() {
        return opCode;
    }

    public OperatorNode(
            ExpressionNode left,
            ExpressionNode right,
            String opCode)
    {
        this.left = left;
        this.right = right;
        this.opCode = opCode;
    }

    public int calc() {
        int leftValue = left.calc();
        int rightValue = right.calc();
        // TODO: choose operation
        return leftValue + rightValue;
    }
    
}
