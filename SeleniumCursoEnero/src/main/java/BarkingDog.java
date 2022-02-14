
public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean barking = true;
		int hourOfDay = 23;
		
		System.out.println(shouldWakeUp(barking, hourOfDay));
	}
	
	public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
		boolean wakeUp = false;
		if ((hourOfDay<0)||(hourOfDay>23)) {
			wakeUp = false;
		}else {
			if(((barking==true)&&(hourOfDay<8))||(barking==true)&&(hourOfDay>22)) {
				wakeUp= true;
			}else {
				wakeUp=false;
			}
		}
		return wakeUp;
	}

}
