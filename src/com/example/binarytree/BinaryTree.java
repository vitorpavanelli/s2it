package com.example.binarytree;

public class BinaryTree {
	private int valor; 
    private BinaryTree left; 
    private BinaryTree right;
    
    public BinaryTree(int valor) {
    	this.valor = valor;
    	this.left = null;
    	this.right = null;
    }

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int getValor() {
		return valor;
	}    
    
}
