import java.util.Scanner;

class split{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        //StringBuffer sb=new StringBuffer(s);

        String arr[]=s.split("@");
        int len=arr.length;
        for(int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
        }
    }
}