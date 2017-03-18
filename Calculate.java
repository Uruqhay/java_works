public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		System.out.println("Summ of values = " + summ);
		int Proizv = first * second;
		System.out.println("Proizv of values = " + Proizv);
	}
}