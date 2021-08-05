package recursion;

class Fibonacci {

	static long[] memo = new long[100];

	static long fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (memo[n] == 0)
			memo[n] = fib(n - 1) + fib(n - 2);

		return memo[n];

	}

	public static void main(String args[]) {

		System.out.println(fib(8));
		// System.out.println(fib(10));
		// System.out.println(System.currentTimeMillis());
	}
}
