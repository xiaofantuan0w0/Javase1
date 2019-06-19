public class Zy2_5 {
    public static void main(String[] args){
        int score=53;
        int count=0;
        System.out.println("加分前成绩"+score);
        for(int i=0;score<60;i++) {
            score = score + 1;
            count ++;
        }
        System.out.println(score);
        System.out.println(count);

    }
}
