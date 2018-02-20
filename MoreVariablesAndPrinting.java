public class MoreVariablesAndPrinting {
	public static void main(String[] args){

		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight;

		myName="Taylor Sun";
		myAge=16;
		myHeight=172;//cm
		myEyes="Brown";
		myHair="Black";
		myTeeth="White";

		System.out.println("Let's talk about "+myName+" .");
		System.out.println("She is "+myAge+" years old.");
		System.out.println("She is "+myHeight+" cm tall.");
		System.out.println("She's got "+myEyes+" eyes and "+myHair+" hair.");
		System.out.println("Her teeth is usually "+myTeeth+" depending on the chocolate.");

		//This is a math question.
		System.out.println("If I add "+myAge+" and "+myHeight+", I will get "+(myAge+myHeight)+". ");
	}
}