package oneWeek.FIRST.嵌套分支;
import java.util.*;
public class TicketSystem {

    public static void main(String[] args) {

/* 票务系统：根据淡季旺季的月份和年龄，打印票价
* 4-10旺季：
* 成人：age 18-60 ：60rmb
* 儿童：age <18   :1/2rmb
* 老人：age >60   ：1/3rmb
*
* 淡季：
* 成人：40
* 其他：20
* */

        System.out.println("欢迎来到欢乐谷");
        int Tickets = 60;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomMonth = random.nextInt(12)+1;
        System.out.println("当前月份是："+randomMonth);
        System.out.println("请输入你的年龄");
        int inputAge = scanner.nextInt();
//        if (inputAge > 60 && (3 < randomMonth && randomMonth < 11) ) {
//            System.out.println("你的票价为：" +Tickets / 3);
//            if (inputAge > 18 && inputAge < 60 &&(3 < randomMonth && randomMonth < 11)){
//                System.out.println("你的票价为："+Tickets);
//            } else if (inputAge < 18 && (3 < randomMonth && randomMonth < 11)) {
//                System.out.println("你的票价为："+Tickets /2);
//
//            }
//
//        }else if (inputAge > 18 && inputAge < 60 &&(3 < randomMonth && randomMonth < 11)) {
//            System.out.println("你的票价为：40");
//        }else {
//            System.out.println("你的票价为：20");
//        }
        if (randomMonth > 3 && randomMonth < 13) {
            if (inputAge >= 60){
                System.out.println("你的票价为：" +Tickets / 3);
            } else if (inputAge >= 18 && inputAge < 60) {
                System.out.println("你的票价为："+Tickets);
            }else {
                System.out.println("你的票价为："+Tickets /2);
            }
        } else if (inputAge >= 18 && inputAge < 60) {
            System.out.println("你的票价为：40");
        }else {
            System.out.println("你的票价为：20");
//
        }


    }
}
