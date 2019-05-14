import java.util.Scanner;

public class countvowels{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        String name[]=new String[T];
        
        for(int x=0;x<T;x++){
        name[x] = s.nextLine();  
        }
        for(int x=0;x<T;x++){
            System.out.println(name[x]);
            }
        for(int x=0;x<T;x++){              
        int len=name[x].length();
        int count=0;

        for(int k=0;k<len;k++){
            if(name[x].charAt(k) == 'a' || name[x].charAt(k) == 'e' || name[x].charAt(k) == 'i' || name[x].charAt(k) == 'o' || name[x].charAt(k) == 'u'){
                count++;
            }
        }
        System.out.println(count);
        }
    }
    }
