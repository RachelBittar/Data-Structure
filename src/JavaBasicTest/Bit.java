package JavaBasicTest;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mask = 0x000F;
		int value = 0x2222;
		
		System.out.println(mask & value);
		
		
		
		try {
			
		Float f1 =new Float("3.0");
		int x = f1.intValue();
		System.out.println("Float x = " + x);
		
		byte b = f1.byteValue();
		System.out.println("byte b =  " + b);
		
		
		double d = f1.doubleValue();
		System.out.println("Double d = "+ d);
		
		//System.out.println("Result "+ x+b+d);
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	

}
