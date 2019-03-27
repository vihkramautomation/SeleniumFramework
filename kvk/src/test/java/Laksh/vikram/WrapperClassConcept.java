package Laksh.vikram;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "100";
		System.out.println(s+20);
		//data conversion from string to interger
		int i= Integer.parseInt(s);
		System.out.println(i+20);
		
		double d = Double.parseDouble(s);
		System.out.println(d+20.02);
		
		String value = "True";
		boolean valu = Boolean.parseBoolean(value);
		System.out.println(valu);

	}

}
