import java.util.*;

public class ReversePolishNotation {

	private static String ops = "+*/-";

	StackRA operands = new StackRA();
	StackRA operators = new StackRA();

	public static void parse(String expression) {
		for (int i = 0; i < expression.length(); ++i) {
			if (ops.contains(expression.charAt(i))) {
				operators.push(expression.charAt(i))
			}
			else if (Character.isDigit(expression.charAt(i))) {
				operators.push(expression.charAt(i))
			}
		}
	}

	public static void main(String[] args) {

	}
}