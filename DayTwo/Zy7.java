import java.util.Scanner;
public class Zy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(int i=9;i>=1;i--){
           for(int j=1;j<=i;j++){
                  int z=i*j;

               System.out.print(i+"*"+j+"="+z);
           }

           System.out.println();
       }
    }
}
