import java.util.Scanner;

class studMark{
    int mark;
    String name;
    public void getData(int mark){
    this.mark=mark;
    }
    public void printData(){
    System.out.println("Student Mark Is:"+mark);
    }
};

class any extends studMark{
    public static void main(String argst[]){
        Scanner sc=new Scanner(System.in);
        int mark[]=new int[5];
        studMark st[]=new studMark[5];
        for(int i=0;i<5;i++){
          st[i]=new studMark();
        }
      for(int i=0;i<5;i++){
        mark[i]=sc.nextInt();
	}
             for(int i=0;i<5;i++){
	    st[i].getData(mark[i]);
	}
	  for(int i=0;i<5;i++){
	st[i].printData();
	}
};

};
