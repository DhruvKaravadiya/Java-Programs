public class var_args {
    static int sum (int a , int b){
        return a+b;
    }
    static int sum (int a , int b , int c){
        return a+b+c;
    }
    static int sumAll (int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    static int compulsoryArgument(int x , int ...arr){
        int result = x;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("sum = "+sum(4,5));
        System.out.println("sum = "+sum(4,5,6));
        System.out.println("sum by varargs = "+sumAll(1,2,3,4,5,6,7,8,9));
        System.out.println("sum by varargs when nothing is written = "+sumAll());   //Zero will be returned
        System.out.println("sum by varargs (atleast 1 compulsory argument) = "+compulsoryArgument(1));
        System.out.println("sum by varargs (atleast 1 compulsory argument) = "+compulsoryArgument(1,2,3));

    }
}
