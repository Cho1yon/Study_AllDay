package oneWeek.FIRST.程序控制结构;

/**
 * @author： choiyon
 * Date：2022/7/27 23:46
 */
public class Break01 {

    public static void main(String[] args) {

        //测试代码
        for( int i = 0; i < 10; i++) {
            if( i == 3) {
                break ;
            }
            System.out.println("i=" + i);
        }


    }
}
