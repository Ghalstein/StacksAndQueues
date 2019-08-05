import java.util.*;

public class WellFormedness {

	private static HashMap<String, String> containers = new HashMap<>();

	private static void setup() {
		containers.put("(", ")");
		containers.put("{", "}");
		containers.put("[", "]");
	}

	private static StackRAString stack = new StackRAString();

	public static boolean valid(String str) {
		setup();
		for (int i = str.length() - 1; i >= 0; --i) {
			stack.push(str.charAt(i) + "");
		}
		String next = "";
		while(!stack.isEmpty()) {
			String curr = stack.pop();
			if (containers.containsKey(curr)) {
				next = stack.pop();
				if (!containers.get(curr).equals(next)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(valid("(){}[]"));
	}
}