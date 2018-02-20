public class VariablesAndNames {
	public static void main(String[] args){

		int drivers, passengers, boatsNotDriven, boatsDriven;
		double spaceInBoat, boatpoolCapacity, averagePassengersPerBoat;

		int boats=100;
		int spaceInBoats=4;
		int captains=30;
		passengers=90;
		boatsNotDriven=boats - captains;
		boatsDriven = captains;
		boatpoolCapacity=boatsDriven*spaceInBoats;
		averagePassengersPerBoat=passengers/boatsDriven;

		System.out.println("There are "+boats+" boats available.");
       		System.out.println("There are only "+captains+" captains available.");
        	System.out.println("There will be "+boatsNotDriven+" empty boats today.");
        	System.out.println("We can transport "+boatpoolCapacity+" people today.");
        	System.out.println("We have "+passengers+" to boatpool today.");
        	System.out.println("We need to put about "+averagePassengersPerBoat+" in each boat.");
    }
}