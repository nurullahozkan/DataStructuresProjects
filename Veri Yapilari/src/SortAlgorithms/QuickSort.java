package SortAlgorithms;
public class QuickSort {
	static void yerDegis(int[] A, int i, int j) {
		int tmp;
		tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	static int parcala(int[] A, int bas, int son) {
		int x = A[son], tmp;
		int i = bas - 1, j;
		for (j = bas; j < son; j++) {
			if (A[j] <= x) {
				i++;
				yerDegis(A, i, j);
			}
		}
		yerDegis(A, i + 1, son);
                                for (int k = 0; k < A.length; k++) {
			System.out.print(A[k] + " ");
		}
                System.out.println("");
		return i + 1;
                
                
	}

	static void hizli(int[] A, int bas, int son) {
		int pivot;
		if (bas < son) {
			pivot = parcala(A, bas, son);
			hizli(A, bas, pivot - 1);
			hizli(A, pivot + 1, son);
		}
	}

	public static void main(String[] args) {
		int[] nums = {5, 2, 9, 7, 3, 0, 8, 4};
		hizli(nums, 0, nums.length - 1);
		print(nums);
	}

	private static void print(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
