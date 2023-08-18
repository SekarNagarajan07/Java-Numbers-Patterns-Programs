//1. Find the sum of a digits?
class Program1 {
    public static void main(String[] args) {
        int num = 10;
        int total = 0;
        for (int i = 1;i<=num;i++){
            total = total + i;
        }
        System.out.println("sum of a digits: " + total);
    }
}
