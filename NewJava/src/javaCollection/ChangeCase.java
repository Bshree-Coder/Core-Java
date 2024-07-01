package javaCollection;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bhagyashri is a software engineer";
		
		String t="SHE WORKS AT CAPGEMINI";
		String add= s+ " " +t;
		
		
		System.out.println(s.length());

		System.out.println(s.toUpperCase());
		System.out.println(t.toLowerCase());
		//System.out.println(s.concat(t));
		
		//System.out.println(s + " " +  t);
		//System.out.println(add.toUpperCase());
		//System.out.println(add.length());
		char[] sh= add.toCharArray();
		System.out.println(sh[2]);
		
	}

}
