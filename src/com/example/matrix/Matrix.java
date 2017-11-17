package com.example.matrix;

public class Matrix {

	public int diffDiagonal(int[][] mtrx, int n) throws MatrixException {
		// não tenho certeza se precisa validar as informações
		validateMatrix(mtrx, n);
		
		int diag1 = 0;
		int diag2 = 0;
		for (int line = 0; line < n; line++) {
			diag1 += mtrx[line][line];
			diag2 += mtrx[line][(n - 1) - line];
		}
		
		return diag1 - diag2;
	}
	
	private void validateMatrix(int[][] mtrx, int n) throws MatrixException {
		if (mtrx == null) {
			throw new MatrixException("Matrix cannot be null");
		}
		
		if (n < 2) {
			throw new MatrixException("Matrix deve ser pelo menos 2x2 para que haja diagonais");
		}
		
		if (mtrx.length != n || mtrx[0].length != n) {
			throw new MatrixException("Matrix deve respeitar tamanho N");
		}
		
		
		// Seria melhor validar os números no input de cada number da matrix.
		// Talvez seria melhor adicionar essa validação dentro do for em diffDiagonal
		// para termos apenas um loop porém isso pode adicionar complexidade extra.
		// Como preciso somente das diagonais nesse caso, vou apenas validar o que preciso
		for (int line = 0; line < n; line++) {
			int diag1 = mtrx[line][line];
			int diag2 = mtrx[line][(n - 1) - line];			
			boolean check1 = (diag1 > 100 || diag1 < -100);
			boolean check2 = (diag2 > 100 || diag2 < -100);
			if (check1 || check2) {
				throw new MatrixException("Matrix cannot have numbers greater than 100 and lower than -100");
			}
		} 
	}

}
