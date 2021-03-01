package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/9 0:04
 */
public class JZ2 {
  // 也可以遍历str，遇到空格，就添加%20
  public String replaceSpace(StringBuffer str) {
    if(str == null && str.length() == 0) return null;
    while(str.indexOf(" ") != -1){
      int index = str.indexOf(" ");
      str.replace(index,index+1,"%20");
    }
    return str.toString();
  }

  public static void main(String[] args) {
    System.out.println(new JZ2().replaceSpace(new StringBuffer("WE ARE HAPPY")));
  }
}
