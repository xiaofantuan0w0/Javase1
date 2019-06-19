import java.util.Scanner;
public class Zy2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        int num = sc.nextInt();
        int count = 0;
        for(int i =1;num>=1;i++ ){
            num = num/10;
            count++;
        }
System.out.println("他是个"+count+"位的数");
    }
}
