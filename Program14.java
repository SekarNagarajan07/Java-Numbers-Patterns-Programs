//14. Find sum of digits of a number using recursion in java
class Program14 {
    public static void main(String[] args) {
        int num = 54321;
        System.out.println("sum of digits of a number: " + sum(num));
    }
    public static int sum(int num){
        if(num==0){
            return 0;
        }else {
            return (num%10 + sum(num/10));
        }
    }

}
