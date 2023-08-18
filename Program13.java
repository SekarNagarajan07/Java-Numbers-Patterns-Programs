//13. Java program to Calculate power of a number using recursion
class Program13 {
    public static void main(String[] args) {
        int base = 5;
        int x = 3;
        System.out.println(power(base,x));
    }
    public static int power(int base, int x){
        if(x==0){
            return 1;
        }else {
            return (base*power(base,x-1));
        }
    }
}
