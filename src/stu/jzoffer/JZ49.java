package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/27 11:06
 */
public class JZ49 {
  public int StrToInt(String str) {
    if(str == null||"".equals(str)){
      return 0;
    }

    boolean flag = true;
    if(str.charAt(0) == '+'){
      str = str.substring(1, str.length());
    }
    else if(str.charAt(0) == '-'){
      str = str.substring(1, str.length());
      flag = false;
    }
    int sum = 0;
    for(int i = 0;i < str.length();i ++){
      if(str.charAt(i) < '0'||str.charAt(i) > '9'){
        return 0;
      }
      else{
        sum *= 10;
        sum += str.charAt(i) - '0';
      }
    }
    return flag?sum:-sum;
  }
}
