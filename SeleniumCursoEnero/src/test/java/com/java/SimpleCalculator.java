package com.java;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubstractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
	}
	

	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}
	
	public double getSubstractionResult() {
		return firstNumber - secondNumber;
	}
	
	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}
	
	public double getDivisionResult () {
        if (secondNumber == 0) {
           return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
     }
	
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	

}
