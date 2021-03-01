package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/30 0:36
 */

public class JZ61 {
  int index = -1;
  String Serialize(TreeNode root) {
    StringBuilder str = new StringBuilder();
    if(root == null){
      str.append("#,");
      return str.toString();
    }
    str.append(root.val+",");
    str.append(Serialize(root.left));
    str.append(Serialize(root.right));
    return str.toString();
  }
  TreeNode Deserialize(String str) {
    index ++;
    String[] strs = str.split(",");
    TreeNode head = null;
    while(!"#".equals(strs[index])){
      head = new TreeNode(Integer.parseInt(strs[index]));
      head.left = Deserialize(str);
      head.right = Deserialize(str);
    }
    return head;
  }
}
