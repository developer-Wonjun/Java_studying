package studying;

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) { //이프로그램을 사용하는 사람과 프로그램 사의의 매개변수 Parameter 	
		
		String id = args[0];
		String bright = args[1];
		double bbb = Double.parseDouble(bright);
		//Elevator call
		Elevator myElevator = new Elevator(id);
		//데이터타입 Elevator - Elevator과 관련잇는것만 올 수 있다.
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id +" Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +" floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(bbb); // 밝기를 Argument
		moodLamp.on();
		
		
	}
}
