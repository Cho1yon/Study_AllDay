package oneWeek.FIRST.程序控制结构;

/**
 * @author： choiyon
 * Date：2022/7/27 23:34
 */
public class ForExercise02 {

    public static void main(String[] args) {

        //化繁为简
        //先死后活
        int n = 9;
        for( int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
