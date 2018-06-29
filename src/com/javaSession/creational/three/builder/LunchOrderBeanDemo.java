package com.javaSession.creational.three.builder;
/*
 * ******************THIS IS NOOOOOOOT GOOD**********************
 * check the TELE class
 */
public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
		System.out.println(lunchOrderBean.getBread());
		
		/*
		 * We can comment out the setter and it will still print the LunchOrderBean object
		 * It also dose not provide any contract that how the object should look like
		 */
		
		lunchOrderBean.setBread("Wheat");
		//lunchOrderBean.setCondiments("Lettuce");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());

	}

}
