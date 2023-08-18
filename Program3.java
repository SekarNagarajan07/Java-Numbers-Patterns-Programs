// 3. Check whether the given number is Armstrong or not?
class Program3 {
    public static void main(String[] args) {
        int num = 370,number,temp,total=0;
        number = num;
        while (number!=0){
            temp = number % 10;
            total = total + temp * temp * temp;
            number = number / 10;
        }
        if(total == num){
            System.out.println(num + " Is Armstrong Number");
        } else {
            System.out.println(num + " Is Not Armstrong Number");
        }
    }
}
