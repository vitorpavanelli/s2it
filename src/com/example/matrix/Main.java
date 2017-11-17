package com.example.matrix;

public class Main {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrixData = {
				{1, 5, 3, 2},
				{4, 8, -5, 6},
				{7, 3, 4, 5},
				{2, 5, 9, -9}
		};
		
		Matrix matrix = new Matrix();		
		try {
			System.out.println("Soma de duas diagonais é: " + matrix.diffDiagonal(matrixData, n));
		
		} catch (MatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
