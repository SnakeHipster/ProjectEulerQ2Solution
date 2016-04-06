package com.simon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=2;
		int prev1=2;
		int prev2=1;
		int current=3;
		boolean con =true;
		
		while(con){
			System.out.print(current + ", ");
			if (current % 2 ==0 && current <= 4000000){
				total +=current;
				
			}
			int temp1=prev1;
			int temp2=prev2;
			prev2=prev1;
			prev1=current;
			current=prev1+prev2;
			if (current > 4000000){
				con =false;				
			}
		}
		System.out.print("Total: "+total);
	}
}
