import java.util.Scanner;
class A{
    public int a,b;
    public void getData(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println("hiii "+a+" "+b);
    }
}
class ArrayObj{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        A obj[] = new A[2] ;
       for(int i=0;i<2;i++){
           obj[i]=new A();
       }
       for(int i=0;i<2;i++){
            a=sc.nextInt();
            b=sc.nextInt();
           obj[i].getData(a,b);
       }
       System.out.println("For Array Element 0");
       obj[0].showData();
       obj[1].showData();
}
}