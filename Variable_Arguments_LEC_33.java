package hello.com;

public class Variable_Arguments_LEC_33 {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
//    static int sum(int ... brr){
//        int result = 0;
//        for (int element: brr){
//            result+=element;
//        }
//        return  result;
//    }
    static int hey(int x, int ... arr){
        int result = x;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Variable arguments");
        System.out.println("The sum of a and b is:" + hey(4, 5));
        System.out.println("The sum of a and b is:" + hey(4, 5, 3));
        System.out.println("The sum of a and b is:" + hey(4, 5, 3, 2));
        System.out.println("The sum of a and b is:" + hey(4, 5, 3, 2, 1));
    }
}
