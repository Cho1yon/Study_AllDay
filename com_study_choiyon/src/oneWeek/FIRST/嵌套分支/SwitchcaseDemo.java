package oneWeek.FIRST.嵌套分支;
import java.util.*;
public class SwitchcaseDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int Score = random.nextInt(101)+1;
        if (Score >0 && Score <= 100 ){
            switch ((int)Score/60){
                case 0:
                    System.out.println("fail");
                    System.out.println(Score);
                    break;
                case 1 :
                    System.out.println("pass");
                    System.out.println(Score);
                    break;
                    default :
                        System.out.println("erro");
            }
        }
    }
}
