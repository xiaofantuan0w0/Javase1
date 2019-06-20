import java.util.Scanner;
public class Zy5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in );
        int score = sr.nextInt();
        String sex = sr.next();
        if(score>80){
             if(sex=="女"){
                 System.out.println("女子决赛组");
             }else {
                 System.out.println("男子决赛组");
             }

        }else {
            System.out.println("未进决赛");
        }


    }


    }
