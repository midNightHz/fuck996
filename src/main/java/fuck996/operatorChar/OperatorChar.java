package fuck996.operatorChar;

public class OperatorChar {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;

		int d = a++ + ++a << b++ + c-- & ++c + + +a << 4;
		System.out.println(d);

	}

}
