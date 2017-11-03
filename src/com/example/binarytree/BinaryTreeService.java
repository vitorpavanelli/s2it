package com.example.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeService {

	private static BinaryTree TREE = null;
	private List<Integer> numbers = null;	
	private BinaryTree selectedNode = null;
	
	public void createTree(int valor) {
		if (TREE == null) {
			TREE = new BinaryTree(valor);
		
		} else {
			BinaryTree current = TREE;
			while (true) {
				if (valor < current.getValor()) {
					if (current.getLeft() == null) {
						current.setLeft(new BinaryTree(valor));
						break;
					}
					
					current = current.getLeft();
				
				} else {
					if (current.getRight() == null) {
						current.setRight(new BinaryTree(valor));
						break;
					}
					
					current = current.getRight();
				}
			}
		}
	}
	
	private void preFetchNumbers(BinaryTree node) {
		if (node != null) {
			preFetchNumbers(node.getLeft());
			numbers.add(node.getValor());
			preFetchNumbers(node.getRight());
		}
	}
	
	public List<Integer> getTreeValues(BinaryTree node) {		
		numbers = new ArrayList<>();		
		preFetchNumbers(node == null ? TREE : node);
		
		return numbers;
	}
	
	private void findAndSetNode(BinaryTree node, int value) {
		if (node != null) {
			if (node.getValor() == value) {
				selectedNode = node;
				return;
			
			} else if (value < node.getValor()) {
				findAndSetNode(node.getLeft(), value);
			
			} else {
				findAndSetNode(node.getRight(), value);
			}
		}
	}
	
	public BinaryTree getNode(int value) {
		findAndSetNode(TREE, value);
		return selectedNode;
	}
}
