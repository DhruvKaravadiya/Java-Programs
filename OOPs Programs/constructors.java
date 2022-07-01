class MyMainEmployee{
    private int id;
    private String name;
    MyMainEmployee(){           //CONSTRUCTOR 
        id = 34;
        name = "HARRY";
    }
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name = str; 
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i; 
    }
   
}
public class constructors {
    public static void main(String[] args) {
        
        //conventional method of declaring each and every object one after another
        MyMainEmployee dhruv = new MyMainEmployee();
        //dhruv.setName("dhruv karavadiya");    //When commented out this line, it will invoke the constructor
        System.out.println(dhruv.getName());
        //dhruv.setId(234);
        System.out.println(dhruv.getId());

        
    }
}
