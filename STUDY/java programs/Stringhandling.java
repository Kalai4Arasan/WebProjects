import java.util.Scanner;
class Stringhandling{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)<48 || sb.charAt(i)>57){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}