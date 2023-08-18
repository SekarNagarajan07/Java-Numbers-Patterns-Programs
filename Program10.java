//10. Print the Fibonacci series.
class Program10 {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+ " ");
        for (int i = 2;i<=num;i++){
            c = a + b;
            System.out.print(c+ " ");
            a = b;
            b =c;
        }
    }
}
