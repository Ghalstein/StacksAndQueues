import java.util.*;

public class ReversePolishNotation {

	private static String ops = "+*/-";

	private static StackRA operands = new StackRA();
	private static StackRA operators = new StackRA();

	private static void parse(String expression) {
		for (int i = 0; i < expression.length(); ++i) {
			if (ops.contains(expression.charAt(i) + "")) {
				operators.push(expression.charAt(i) + "");
			}
			else if (Character.isDigit(expression.charAt(i))) {
				operators.push(expression.charAt(i) + "");
			}
		}
	}

	private static int evaluate(String val1, String val2, String op) {
		switch(op) {
		case '-': return val1 - val2;
		case '+': return val1 + val2;
		case '*': return val1 * val2;
		case '/': return val1 / val2;
		}
	}

	public static int calculate() {

		while (!operators.isEmpty()) {
			int val1 = Integer.parseInt(operands.pop());
			int val2 = Integer.parseInt(operands.pop());
			String op = operators.pop();
			operands.push(evaluate(val1, val2, op));
		}
		return operands.pop();
	}

	public static void setup(String expression) {
		parse(expression);
		calculate();
	}	

	public static void main(String[] args) {
		setup("12+");

	}
}