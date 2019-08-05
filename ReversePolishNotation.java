import java.util.*;

public class ReversePolishNotation {

	private static String ops = "+*/-";

	private static StackRA operands = new StackRA();
	private static StackRAString operators = new StackRAString();

	private static void parse(String expression) {
		for (int i = 0; i < expression.length(); ++i) {
			if (ops.contains(expression.charAt(i) + "")) {
				operators.push(expression.charAt(i) + "");
			}
			else if (Character.isDigit(expression.charAt(i))) {
				operands.push(Integer.parseInt(expression.charAt(i) + ""));
			}
		}
	}

	private static int evaluate(int val1, int val2, String op) {
		// int val1 = Integer.parseInt(v1);
		// int val2 = Integer.parseInt(v2);
		switch(op) {
		case "-": return val1 - val2;
		case "+": return val1 + val2;
		case "*": return val1 * val2;
		case "/": return val1 / val2;
		}
		return -1;
	}

	public static int calculate() {

		while (!operators.isEmpty()) {
			int val1 = operands.pop();
			int val2 = operands.pop();
			String op = operators.pop();
			operands.push(evaluate(val1, val2, op));
		}
		return operands.pop();
	}

	public static int setup(String expression) {
		parse(expression);
		return calculate();
	}	

	public static void main(String[] args) {
		System.out.println(setup("12+"));
	}
}