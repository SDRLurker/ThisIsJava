public class Compare{
	public static void main(String args[]){
		double a = 0.1;
		float b = 0.1f;

		System.out.println("0.1 == 0.1 => " + (0.1 == 0.1));
		System.out.println("0.1 == 0.1f => " + (0.1 == 0.1f));
		System.out.println("a(double) == b(float) => " + (a == b));
		System.out.println("a=" + String.format("%.10f", a) 
			+ ", b=" + String.format("%.10f", b));
	}
}
