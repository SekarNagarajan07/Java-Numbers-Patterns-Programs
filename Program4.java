//4. Check whether the given number is palindrome or not?
class Program4 {
    public static void main(String[] args) {
        int n = 454;
        int rev,sum=0,temp;
        temp = n;
        while (n>0){
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
