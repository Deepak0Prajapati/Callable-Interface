package com.dencofamily.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
    	ExecutorService executorService=Executors.newFixedThreadPool(2);
    	Callable<Integer> t1=new Thread1();
    	Callable<Integer> t2=new Thread2();
    	
    	Future<Integer> total=executorService.submit(t1);
    	Future<Integer> total2=executorService.submit(t2);
    	
    	try {
    		int result=total.get();
    		int result2=total2.get();
    		int sum=result+result2;
    		System.out.println("total of t1 :"+result+" Total of t2 :"+result2+" sum of both threads :"+sum);
    		
    	}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
    	
       
    }

 
}
