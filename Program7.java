//7. How to check if a given number is even/odd without using Arithmetic operator?
class Program7 {
    public static void main(String[] args) {
        int number = 10;
        if((number & 1)==0){
            System.out.print(number + " is Even Number");
        }
        else {
            System.out.print(number + " is Odd");
        }
    }
}
