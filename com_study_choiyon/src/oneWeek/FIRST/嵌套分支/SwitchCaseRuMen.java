package oneWeek.FIRST.嵌套分支;
import java.util.*;
public class SwitchCaseRuMen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入暗号");
        char Day = input.next().charAt(0);
        switch (Day){
            case 'a':
                System.out.println("1");
                break;
            case 'b':
                System.out.println("2");
                break;
            case 'c':
                System.out.println("3");
                break;
            case 'd':
                System.out.println("4");
                break;
            default :
                System.out.println("end");
        }
        System.out.println("结束switch");
    }
}

