import java.util.Scanner;
public class Zy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>60){
            System.out.println("老年");
        }
        else if(age>40){
            System.out.println("中年");
        }
        else if(age>18){
            System.out.println("少年");
        }
        else {
            System.out.println("童年");
        }
    }
}
