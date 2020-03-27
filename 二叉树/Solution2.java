package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//中序遍历
public class Solution2 {
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
