//11. Find the factorial of an given number without using loops?
class Fact{
    public static int fact(int num){
        if(num==1){
            return 1;
        } else {
            return num *=fact(num-1);
        }
    }

    public static void main(String[] args) {
        int f = fact(5);
        System.out.println(f);
    }
}