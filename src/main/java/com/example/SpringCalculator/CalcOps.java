package com.example.SpringCalculator;

import org.springframework.stereotype.Service;

@Service
public class CalcOps {
	
	public int getResult(int a, int b, String oper) {
		int res=0;
		System.out.println(a);
		System.out.println(b);
		switch(oper) {
		case "add": res = a+b;break;
		case "sub":  res = a-b;break;
		case "mul": res = a*b;break;
		case "divide": res = a/b;break;
		default: 
		}
		return res;
	}
}
