package javaCollection;

public class ReverseString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="Dessert";
//		String s="";
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			s=s+str.charAt(i);
//		}
//			System.out.println(s);
//		
//            return;
//		}
//	}

//_____________________________________________________________________
            // By using stringBuilder
		
		
       StringBuilder sb= new StringBuilder(str);
       
           sb.reverse();
           
             String reversedString=sb.toString();
             
          System.out.println(reversedString);
	}
}









