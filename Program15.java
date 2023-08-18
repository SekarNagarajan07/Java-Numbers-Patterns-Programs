//15. Java Program to print the number of elements present in an array
class Program15 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for (int i = 0;i<a.length;i++){
            count++;
        }
        System.out.println(count);
    }
    
}
