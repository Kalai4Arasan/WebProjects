import java.util.Scanner;


class palindrome {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.nextLine();
    StringBuffer sb=new StringBuffer(s);
    String rev="";
    rev+=sb.reverse();
   if(s.equals(rev)){
   System.out.println("the given string is palindrome");
   }
   else{
       System.out.println("not a palindrome");
   }
}

}