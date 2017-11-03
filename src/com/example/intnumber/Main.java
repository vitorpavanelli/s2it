package com.example.intnumber;

public class Main {
    private static int A = 12;
    private static int B = 7734;
    
	public static void main(String[] args) {
		CalculateCService service = new CalculateCService();
		
		try {
			System.out.print(service.getC(A, B));
		
		} catch (NumberNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
