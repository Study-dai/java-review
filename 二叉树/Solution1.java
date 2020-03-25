package 二叉树;

import java.util.LinkedList;
import java.util.List;

//前序遍历
/*
从根节点开始，每次迭代弹出当前栈顶元素，并将其孩子几点压入栈中，先压右边
在压左边，在这个算法中输出到最终顺序按照TOP-Bottom和lefy-Right,符合前序遍历的顺序。
*/
public class Solution1 {
    public List<Integer> preorderTraversal(Node root){
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> output=new LinkedList<>();
         if(root==null){
             return output;
         }
         stack.add(root);
         while (!stack.isEmpty()){
             Node node=stack.pollLast();
             output.add(node.val);
             if(node.right!=null){
                 stack.add(node.right);
             }
             if(node.left!=null){
                 stack.add(node.left);
             }
         }
         return output;
    }
}
