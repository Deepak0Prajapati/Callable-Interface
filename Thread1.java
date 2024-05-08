package com.dencofamily.test;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thread1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int total=0;
		
		for(int i=0;i<=50;i++) {
			total=total+i;
		}
		System.out.println("thread1 running.....");
		return total;
	}

 
}
