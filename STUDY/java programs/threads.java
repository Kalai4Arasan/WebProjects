
class supers extends Thread{
    int value;
    String name;
    public supers(int value,String name){
        this.name=name;
        this.value=value;
    }
    public void race(){
        while(value<20){
                value+=1;
                System.out.println(name+" is passed "+value);
        try{Thread.sleep(500);}
        catch(Exception e){System.out.println(e);}
    }
    }
    public void run(){
        race();
    }
}


class threads extends Thread{
    public static void main(String args[]) {
            supers obj= new supers(10,"mani");
            supers obj1= new supers(11,"kalai");
            supers obj2= new supers(12,"mom");
                obj.start();
                obj1.start();
                obj2.start();
        
    }
}