//6. Check whether the given number is niven or not?
class Program6 {
    public static void main(String[] args) {
        int num = 21;
        int n = num;
        int sum = 0;

        while (num>0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if(n % sum==0){
            System.out.println("Niven Number");
        } else {
            System.out.println("Not A Niven Number");
        }
    }
}
