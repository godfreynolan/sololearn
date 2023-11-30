
import java.util.Scanner;

//your code goes here
public class Convertor{
String binary="";
while(num > 0) {
   binary = (num%2)+binary;
   num /= 2;
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
