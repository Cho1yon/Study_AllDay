package oneWeek.FIRST.键盘输入语句;
import java.util.*;
public class KeyBoardInput {
    public static void main(String[] args) {
        //演示接受用户的输入
        // 步骤
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = input.next();
        System.out.println("请输入你的薪水");
        int sal = input.nextInt();
        System.out.println("名字"+name+"薪水"+sal);

    }

}
