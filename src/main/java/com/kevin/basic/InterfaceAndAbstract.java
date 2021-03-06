package com.kevin.basic;

/**
 * 
 * 
 * @author Kai.Zhao
 * @date Nov. 26th, 2014
 * @since 1.0
 */
public class InterfaceAndAbstract {

}

/*
 * In its most common form, an interface is a group of related methods with empty bodies. 
 * A bicycle's behavior, if specified as an interface, might appear as follows:
 * */
interface Bicycle {

	//  wheel revolutions per minute
	void changeCadence(int newValue);

	void changeGear(int newValue);

	void speedUp(int increment);

	void applyBrakes(int decrement);
}

abstract class Phoenix implements Bicycle {
	
}

/*
 * To implement this interface, the name of your class would change
 *  (to a particular brand of bicycle, for example, such as ACMEBicycle), 
 *  and you'd use the implements keyword in the class declaration:
 * 
 * */
class ACMEBicycle implements Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	// The compiler will now require that methods
	// changeCadence, changeGear, speedUp, and applyBrakes
	// all be implemented. Compilation will fail if those
	// methods are missing from this class.

	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}