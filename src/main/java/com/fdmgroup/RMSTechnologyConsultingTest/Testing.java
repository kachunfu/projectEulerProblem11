package com.fdmgroup.RMSTechnologyConsultingTest;

public class Testing {

	public static void main(String[] args) {
		// @formatter:off
				int grid[][] = { { 1, 2, 3 }, 
								 { 4, 5, 6 }, 
								 { 7, 8, 9},
								 };
				// @formatter:on

		long product = findProduct(grid, 3);

		// Answer of Question 2
		System.out.println("The greatest product is " + product);

	}

	// Method for Question 2
	public static long findProduct(int[][] grid, int length) {

		int row = grid.length;
		int column = grid[0].length;

		long product = 1;
		long largest = 0;

		// Check horizontally

	

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1; j++) {
				product = 1;
				for (int k = 0; k < 3; k++) {
					
					
					
					System.out.println(grid[i][j + k]);
					product *= grid[i][j + k];
					
					System.out.println("product = " + product);
//						product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2];
					
					
				}

				if (product > largest) {
					largest = product;
				}
			}

		}

		// Check vertically

//		product = 1;
//
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 3; j++) {
//
//				for (int k = 0; k < length - 1; k++) {
//
//					product *= grid[i + k][j];
//
////						product = grid[i][j] * grid[i + 1][j] * grid[i + 2][j];
//
//				}
//				if (product > largest) {
//					largest = product;
//				}
//			}
//		}

		// Check diagonally right

//		product = 1;
//
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 1; j++) {
//
//				for (int k = 0; k < length - 1; k++) {
//
//					product *= grid[i + k][j + k];
//
////						product = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2];
//
//				}
//				if (product > largest) {
//					largest = product;
//				}
//			}
//		}

		// Check diagonally left

//		product = 1;
//
//		for (int i = 0; i < 1; i++) {
//			for (int j = 2; j < 3; j++) {
//
//				for (int k = 0; k < length - 1; k++) {
//
//					product *= grid[i + k][j - k];
////						product = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2];
//
//				}
//				if (product > largest) {
//					largest = product;
//				}
//			}
//		}

		return largest;
	}

}
