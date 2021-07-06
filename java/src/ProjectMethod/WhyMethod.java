package ProjectMethod;


public class WhyMethod {

	
	
	
	public static void main(String[] args) {
		
						//인자 argument
		printTwoTimesA("kkk");
		
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	
									   //매게변수 parameter
	public static void printTwoTimesA(String a) {
		System.out.println("-");
		System.out.println(a);
		System.out.println(a);

	}
}
