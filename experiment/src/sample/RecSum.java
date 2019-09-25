package sample;

class RecSum {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public static void main(String[] args) {
		System.out.println(findSum(arr, arr.length));
	}

	static int findSum(int A[], int N) {
		if (N <= 0)
			return 0;
		return (findSum(A, N - 1) + A[N - 1]);
	}

}
