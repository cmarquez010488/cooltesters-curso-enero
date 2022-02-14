
public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numOne =-3.176;
		double numTwo =-3.175;
		
		System.out.println(areEqualByThreeDecimalPlaces(numOne, numTwo));

	}
	
	public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
		boolean areEqual = false;
		numOne = numOne * 1000;
		numTwo = numTwo* 1000;
		int intOne = (int)numOne;
		int intTwo = (int)numTwo;
		
		if(intOne==intTwo) {
			areEqual = true;
		}else {
			areEqual = false;
		}
		return areEqual;
	}	

}
