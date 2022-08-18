package oneWeek.FIRST.嵌套分支;
import java.util.*;
public class NestedIf {
    public static void main(String[] args) {

/*
*参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
* 并且根据性别提示进入男子组或女子组。【可以 让学员先练习下】,
* 输入成绩和性别，进行判断和输出信息。[NestedIf.java]
*
* 思路：
*
* */
    Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入选手成绩");
        double score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入你的性别");
            char gender = myScanner.next().charAt(0);
            if (gender == '男') {
                System.out.println("请进入男子组决赛");
            }else if (gender == '女') {
                System.out.println("请进入女子组决赛");
            }else {
                System.out.println("性别资料有误，无法参加决赛");
            }
        }else {
            System.out.println("不好意思你被淘汰了");
        }

    }
}
