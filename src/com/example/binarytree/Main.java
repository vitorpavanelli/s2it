package com.example.binarytree;

public class Main {
	
	private static int[] numbers = {5, 1, 2, 4, 3, 6, 9, 7, 10, 8};

	public static void main(String[] args) {		
		BinaryTreeService service = new BinaryTreeService();
		for (int n: numbers) {
			service.createTree(n);
		}
		
		for (int n: service.getTreeValues(null)) {
			System.out.println(n);
		}
		
		System.out.println(service.getNode(1));
		
		int number = 5;
		long sum = 0;
		for (int n: service.getTreeValues(service.getNode(number))) {
			sum += n;
		}
		
		System.out.println("Soma: " + sum);
	}

}
