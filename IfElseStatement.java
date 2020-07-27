public class IfElseStatement {
	
	public static void main(String[] args) {
		int modelYear = 2010;
		boolean recalled;

		if (modelYear >= 2015 && modelYear <= 2020) {
			recalled = true;
		} else {
			recalled = false;
		}
		System.out.println(recalled);
	}

	  
}