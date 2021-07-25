package tree;

import java.util.Arrays;

public class InsertNodes {

    public BST.Node insert(BST.Node root, int value) {
        if(root==null)
            return new BST.Node(value);
        if(value<root.key){
            root.left =insert(root.left,value);
        } else {
            root.right =insert(root.right,value);
        }
        return root;
    }
    public BST.Node createTreeFromArray(int[] treeValues, BST.Node root) {

        for(int i=0;i<treeValues.length;i++){
            root=insert(root,treeValues[i]);
        }
        return root;
    }
    public BST.Node sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;

        int mid = nums.length/2;
        BST.Node root = new BST.Node(nums[mid]);
        Arrays.copyOfRange(nums,0,mid);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length-1));
        return root;
    }

}
