package chapter10;

class MyInteger {
	private int value;

	MyInteger(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

	public boolean isEven() {
		return (value % 2 == 0);
	}

	public boolean isOdd() {
		return (value % 2 != 0);
	}

	public boolean isPrime() {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	static boolean isEven(int val) {
		return (val % 2 == 0);
	}

	static boolean isOdd(int val) {
		return (val % 2 != 0);
	}

	static boolean isPrime(int val) {
		for (int i = 2; i <= val / 2; i++) {
			if (val % i == 0)
				return false;
		}
		return true;
	}

	static boolean isEven(MyInteger my) {
		return (my.isEven(my.getValue()));
	}

	static boolean isOdd(MyInteger my) {
		return (my.isOdd(my.getValue()));
	}

	static boolean isPrime(MyInteger my) {
		return (my.isPrime(my.getValue()));
	}

	boolean equals(int val) {
		return (value == val);
	}

	boolean equals(MyInteger m) {
		return (value == m.getValue());
	}

	static int parseInt(char[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++)
			res = res * 10 + (int) (a[i] - '0');
		return res;
	}

	static int parseInt(String a) {
		int res = 0;
		for (int i = 0; i < a.length(); i++)
			res = res * 10 + (int) (a.charAt(i) - '0');
		return res;
	}

}

public class Question3 {
	public static void main(String[] args) throws java.lang.Exception {
		MyInteger m = new MyInteger(10);
		MyInteger m1 = new MyInteger(11);
		System.out.println("Is 10 even " + m.isEven());
		System.out.println("Is 10 odd " + m.isOdd());
		System.out.println("Is 10 prime " + m.isPrime());
		System.out.println("Is 11 even " + MyInteger.isEven(11));
		System.out.println("Is 11 odd " + MyInteger.isOdd(11));
		System.out.println("Is 11 prime " + MyInteger.isPrime(11));
		System.out.println("Is value of m(10) even " + MyInteger.isEven(m));
		System.out.println("Is value of m(10) odd " + MyInteger.isOdd(m));
		System.out.println("Is value of m(10) prime " + MyInteger.isPrime(m));
		System.out.println("Is 10 equal to m(10) value " + m.equals(10));
		System.out.println("Is object m equal to object m1 " + m.equals(m1));
		System.out.println("Integer equivalent for the char array " + MyInteger.parseInt("1234".toCharArray()));
		System.out.println("Integer equivalent for the String " + MyInteger.parseInt("1234"));

	}
}
