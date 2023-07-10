
public class ProductOfNNaturalNumbers {

	public static int factorial(int n) {
		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	public static void fun(int x) {
		System.out.print(x + " ");
		if (x >= 3)
			return;
		fun(x + 1);
		fun(x + 2);
	}

	public static void print1Ton(int n) {
		if (n == 0)
			return;
		print1Ton(n - 1);
		System.out.print(n + " ");

	}

	public static void printnTo1(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		printnTo1(n - 1);

	}

	public static void printTriangle(int[] a, int n) {

		if (n <= 0)
			return;

		int[] temp = new int[a.length - 1];
		for (int i = 0; i < a.length - 1; i++) {
			temp[i] = a[i] + a[i + 1];
		}
		n--;
		printTriangle(temp, n);

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static int minVal(int[] arr, int i, int n, int min) {

		if (i >= n)
			return min;
		min = Math.min(arr[i], min);

		return minVal(arr, i + 1, n, min);

	}

	public static int minValNew(int[] arr, int i,int j) {
		if(i==j) return arr[i];
		int mid = (i + j) / 2;
		
		int x = minValNew(arr, i, mid);
		int y = minValNew(arr, mid+1, j);
		return Math.min(x, y);
		
	}
	
	public static int maxVal(int[] arr, int i, int n, int max) {

		if (i >= n)
			return max;
		max = Math.max(arr[i], max);

		return maxVal(arr, i + 1, n, max);

	}

	public static char firstUpperCase(String str, int len, int i) {
		if (i == len)
			return 0;
		if (Character.isUpperCase(str.charAt(i))) {
			return str.charAt(i);
		}
		return firstUpperCase(str, len, i + 1);
	}

	public static int lengthOfString(String str) {
		if (str.equals(""))
			return 0;
		return lengthOfString(str.substring(1)) + 1;
	}

	public static void recursiveBubbleSort(int a[], int n) {
		if (n == 1)
			return;
		int swapCount = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				swapCount++;
			}
		}
		if (swapCount == 0)
			return;
		recursiveBubbleSort(a, n - 1);
	}

	public static int sumOfDigits(int n, int sum) {
		if (n == 0)
			return sum;

		sum = sum + n % 10;
		return sumOfDigits(n / 10, sum);
	}
    
	public static int productRecursive(int x , int y , int result) {
		
		if(y == 0) return result;
		
		result +=  x;
	//	System.out.println( result + " " + y + " " +n);
		
		return productRecursive(x, y-1, result);
		
	}
	
	public static boolean checkPrimes(int number, int it) {
	   if(it > Math.sqrt(number)) return true;
		
		if(number  % it == 0) return false;
	
		
		return checkPrimes(number, it+1 );
		
	}

	public static int productOfNNaturalNos(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return n + productOfNNaturalNos(n-1);
	}

	public static boolean checkSort(int a[], int n , int i) {
		if (n == i)
			return true ;
		if(a[i]>a[i+1]) return false;
		return checkSort(a, n , i+1);
	}
	
	public static int findx(int n, int a, int cnt) {
		/*
		 *  Write a recursive function for given n and a to determine x:
		 *       n = a ^ x 
                 a = 2, 3, 4
                 (2 ^ -31) <= n <= (2 ^ 31) - 1      */
		if(n == 1) return cnt;
		
		return (findx(n/a,a,cnt+1));
	}
	public static void main(String[] args) {
		// int n = factorial(5);
//          System.out.println(n);

		// fun(0);

		// print1Ton(7);
		// printnTo1(7);
	  // int[] a = {1,2,3,4,5,-1,0,9,-1,-8,-1111};
		int a[] = {20,45,58,95,105};
		 System.out.println(checkSort(a, a.length-1,0));
		// printTriangle(a, a.length);
//		recursiveBubbleSort(a, a.length);
//		for(int i : a) {
//			System.out.print(i + " ");
//		}
		// System.out.println( minVal(a, 0, a.length, Integer.MAX_VALUE));
		// System.out.println(minValNew(a, 0, a.length-1));
		// System.out.println( maxVal(a, 0, a.length, Integer.MIN_VALUE));
		// System.out.println(min);
		/// String str = "ritutiwari";
		// System.out.println(firstUpperCase(str, str.length(), 0));
		// System.out.println(str.length());
		// System.out.println(lengthOfString(str));
		//System.out.println(sumOfDigits(12345, 0));
		// System.out.println(productRecursive(100, 100, 0));
		//System.out.println(checkPrimes(133, 3) ? "Yes"  : "No");
		//System.out.println(productOfNNaturalNos(0));
		// System.out.println(findx(729, 3, 0));

	}

}
