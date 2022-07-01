class ekClass{
    int a;
    public int getA(){
        return a;
    }
    ekClass(int x){
        this.a = x;
        //a = x;        
    }
    public int returnOne(){
        return 1;
    }
}
public class this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(6);
        System.out.println(e.getA());
    }
}
