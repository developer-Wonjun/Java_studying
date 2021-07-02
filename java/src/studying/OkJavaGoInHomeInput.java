package studying;

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) { //�����α׷��� ����ϴ� ����� ���α׷� ������ �Ű����� Parameter 	
		
		String id = args[0];
		String bright = args[1];
		double bbb = Double.parseDouble(bright);
		//Elevator call
		Elevator myElevator = new Elevator(id);
		//������Ÿ�� Elevator - Elevator�� �����մ°͸� �� �� �ִ�.
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
		moodLamp.setBright(bbb); // ��⸦ Argument
		moodLamp.on();
		
		
	}
}
