import java.util.Scanner;

class studMark{
    int mark;
    String name;
    public void getData(int mark,String name){
    this.mark=sc.;
    this.name=name;
    }
    static void print(){
    System.out.println("student Name and Mark is going to be printed!!!");
    }
    public void printData(){
    System.out.println("Student Name Is:"+name);
    System.out.println("Student Mark Is:"+mark);
    }
};

public class classpro extends studMark{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        studMark st[];
        st=new studMark[5];
        System.out.println("Mark & Name:");
        for(int i=0;i<5;i++){
                    st[i].getData();
        }
        print();
        for(int i=0;i<5;i++){
        st[i].printData();
        }
    };

};

