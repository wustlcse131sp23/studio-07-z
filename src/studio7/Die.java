package studio7;

public class Die {

	private int n;
	public Die() {
		n=0;
	}
	public Die(int n1) {
		n = n1;
		
		
	}
	public int rd(){
		
	return (int)(Math.random()*n)+1;
	}
	public static void main(String[] args) {
		Die class1=new Die(10);
		System.out.println(class1.rd());
	}
}
