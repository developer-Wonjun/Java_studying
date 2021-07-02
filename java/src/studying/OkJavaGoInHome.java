package studying;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		//데이터타입 Elevator - Elevator과 관련잇는것만 올 수 있다.
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id +"Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +"floor Lamp");
		floorLamp.on();
		
	}
}
