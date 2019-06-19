public class Zy2_1 {
    public static void main(String[] args){
      int age1 = 24;
      int age2 = 18;
      int age4 = 36;
      int age5 = 27;
      int sum = age1+age2+age4+age5;
      int avg = sum/4;
      int minus = age1-age2;
      int newAge = age1++;
      System.out.println("年龄总和"+sum);
      System.out.println("平均年龄"+avg);
      System.out.println("年龄差值"+minus);
      System.out.println("自减后的年龄"+newAge);
    }
}
