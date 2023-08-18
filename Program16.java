//16. Print 1 to 10 without using loops
class Program16 {
    public static void main(String[] args) {
        resursive(1);
    }
    public static void resursive(int num){
        if(num<=10){
            System.out.println(num);
            resursive(num+1);
        }
    }
}
