/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                temp=st.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }  
}



// List <Integer> list=new ArrayList<>();
//     public void fun(TreeNode root){
//             if(root ==null){
//                 return;
//             }
//             fun(root.left);
//             list.add(root.val);
//             fun(root.right);
//         }