package studio7;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction() {
		numerator=1;
		denominator=1;
	}
	
	public Fraction(int numerator1, int denominator1) {
		numerator=numerator1;
		denominator=denominator1;
	}
	
	public String add(int new_num,int new_deno) {
		int upp=new_deno*numerator+new_num*denominator;
		int down=new_deno*denominator;
		String result=upp+"/"+down;
		return result;
	}
	public String times(int new_num,int new_deno) {
		int upp=new_num*numerator;
		int down=new_deno*denominator;
		String result=upp+"/"+down;
		return result;
	}
	public static void main(String[] args) {
		Fraction class1=new Fraction(1,3);
		System.out.println(class1.add(4, 3));
		System.out.println(class1.times(4, 3));
	}
}
