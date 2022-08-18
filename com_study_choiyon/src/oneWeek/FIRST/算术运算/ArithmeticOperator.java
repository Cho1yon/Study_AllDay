package oneWeek.FIRST.算术运算;

/**
 * @author： choiyon
 * Date：2022/7/27 22:30
 * 算术运算符
 */
public class ArithmeticOperator {
    public static void main(String[] args) {

        // /???
        System.out.println(10 / 4); //???????????2.5, java?? 2
        System.out.println(10.0 / 4); //java??2.5
        // ?????? ctrl + /, ??????? ctrl + / ??????
        double d = 10 / 4;//java??10 / 4 = 2, 2=>2.0
        System.out.println(d);// ??2.0

        // % ?? ,???
        // ?? % ????? ????????!!!! a % b = a - a / b * b
        // -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
        // 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
        // -10 % -3 =  (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
        System.out.println(10 % 3); //1

        System.out.println(-10 % 3); // -1
        System.out.println(10 % -3); //1
        System.out.println(-10 % -3);//-1

        //++?????
        //
        int i = 10;
        i++;//???? ????? i = i + 1; => i = 11
        ++i;//???? ????? i = i + 1; => i = 12
        System.out.println("i=" + i);//12

		/*
		??????????
        ?++??++i?????????
        ??++??i++??????????
		 */
        int j = 8;
        //int k = ++j; //??? j=j+1;k=j;
        int k = j++; // ??? k =j;j=j+1;
        System.out.println("k=" + k + "j=" + j);//8 9
    }
}
