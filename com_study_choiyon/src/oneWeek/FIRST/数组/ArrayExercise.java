package oneWeek.FIRST.数组;

public class ArrayExercise {
    public static void main(String[] args) {
    /*
    创建一个char 类型的26个元素的数组，分别放置'A'-'Z'
     */

        char chars[] =new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A'+i);
        }
        System.out.println("chars 数组");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]+"");
        }
    }
}
