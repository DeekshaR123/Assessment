package com.lululelom.assesment;

public class Simpleinterest {
public static void main(String[] args) {
		
		float p;
		int t;
		float r;
		p=12;
		t=11;
		r=44;
		float si;
		float totalamount;
		
		
		si=p*t*r/100;
		
		System.out.println("The simple interest is " +si);
		
		totalamount = si + p;
		
		System.out.println("The total amount to be paid is " +totalamount);
		
	}


}
