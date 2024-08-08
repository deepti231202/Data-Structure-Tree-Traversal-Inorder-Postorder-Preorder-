// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.addFirst("Blue");
//         System.out.println(colors);
//     }
// }


// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.addLast("Blue");
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.removeFirst();
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.removeLast();
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.clear();
//         System.out.println("After clearing all the elements");
//         colors.add("purple");
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.set(2,"White");
//         System.out.println("After clearing all the elements");
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.getFirst();
//         System.out.println(colors);
//     }
// }

// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
       
//         colors.getLast();
//         System.out.println(colors);
//     }
// }







// import java.util.LinkedList;
// class Main {
//     public static void main (String args [])
//     {
//         LinkedList<String>colors = new LinkedList<String>();
//         colors.add("yellow");
//         colors.add("red");
//         colors.add("pink");
//        System.out.println("Linked List"+colors);

//        if (colors.contains("red")) {
//         System.out.println("red is present in the linked list.");
//      } 
//      else {
//         System.out.println("red is not present in the linked list.");
//       }
//     }
// }


// import java.util.*;
// class TreeNode{
//   int value;
//   TreeNode left,right;
//   TreeNode(int value){
//     this.value=value;
//     left=right=null;
//   }
// }
// class inorderTraversal {
// public void inorder(TreeNode root) {
//   if(root == null)
//   return;

//   inorder(root.left);

//   System.out.print(root.value+" ");
//   inorder(root.right);
  
  
// }
// public static void main(String args[]) {
  
//    TreeNode root =new TreeNode(1);
//    root.left =new TreeNode(2);
//   root.right =new TreeNode(3);
//   root.left.left =new TreeNode(4);
//   root.left.right =new TreeNode(5);
//  inorderTraversal tree=new inorderTraversal();
//   System.out.print("Inorder traversal : ");
//   tree.inorder(root);

// }
// }

// import java.util.*;
// class TreeNode{
//   int value;
//   TreeNode left,right;
//   TreeNode(int value){
//     this.value=value;
//     left=right=null;
//   }
// }
// class postorderTraversal {
// public void postorder(TreeNode root) {
//   if(root == null)
//   return;

//   postorder(root.left);

 
//   postorder(root.right);
//   System.out.print(root.value+" ");
  
  
// }
// public static void main(String args[]) {
  
//    TreeNode root =new TreeNode(1);
//    root.left =new TreeNode(2);
//   root.right =new TreeNode(3);
//   root.left.left =new TreeNode(4);
//   root.left.right =new TreeNode(5);
//   root.left.right.left=new TreeNode(8);
//   root.right.left=new TreeNode(6);
//   root.right.right=new TreeNode(7);
//   root.right.right.left=new TreeNode(9);
//   root.right.right.right=new TreeNode(10);
//  postorderTraversal tree=new postorderTraversal();
//   System.out.print("Postorder traversal : ");
//   tree.postorder(root);

// }
// }

// import java.util.*;
// class TreeNode{
//   int value;
//   TreeNode left,right;
//   TreeNode(int value){
//     this.value=value;
//     left=right=null;
//   }
// }
// class inorderTraversal {
// public void inorder(TreeNode root) {
//   if(root == null)
//   return;

//   inorder(root.left);

//   System.out.print(root.value+" ");
//   inorder(root.right);
  
  
// }
// public static void main(String args[]) {
  
//    TreeNode root =new TreeNode(1);
//    root.left =new TreeNode(2);
//   root.right =new TreeNode(3);
//   root.left.left =new TreeNode(4);
//   root.left.right =new TreeNode(5);
//   root.left.right.left=new TreeNode(8);
//     root.right.left=new TreeNode(6);
//     root.right.right=new TreeNode(7);
//     root.right.right.left=new TreeNode(9);
//     root.right.right.right=new TreeNode(10);
//  inorderTraversal tree=new inorderTraversal();
//   System.out.print("Inorder traversal : ");
//   tree.inorder(root);

// }
// }


// import java.util.*;
// class TreeNode{
//   int value;
//   TreeNode left,right;
//   TreeNode(int value){
//     this.value=value;
//     left=right=null;
//   }
// }
// class preorderTraversal {
// public void preorder(TreeNode node) {
//   if(node == null)
//   return;
//   System.out.print(node.value+" ");
//   preorder(node.left);
//   preorder(node.right);
  
  
// }
// public static void main(String args[]) {
  
//    TreeNode root =new TreeNode(1);
//    root.left =new TreeNode(2);
//   root.right =new TreeNode(3);
//   root.left.left =new TreeNode(4);
//   root.left.right =new TreeNode(5);
//   root.left.right.left=new TreeNode(8);
//     root.right.left=new TreeNode(6);
//     root.right.right=new TreeNode(7);
//     root.right.right.left=new TreeNode(9);
//     root.right.right.right=new TreeNode(10);
//  preorderTraversal tree=new preorderTraversal();
//   System.out.print("Preorder traversal : ");
//   tree.preorder(root);

// }
// }

import java.util.*;
class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class TreeTraversal {
    public void preorder(TreeNode node) {
        if (node == null)
            return;

        
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    
    public void postorder(TreeNode root) {
        if (root == null)
            return;

    
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        
        TreeTraversal tree = new TreeTraversal();
        System.out.print("Preorder traversal: ");
        tree.preorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree.inorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        tree.postorder(root);
        System.out.println();
    }
}


// import java.util.*;
// class TreeNode {
//     int value;
//     TreeNode left, right;
//     TreeNode(int value) {
//         this.value = value;
//         left = right = null;
//     }
// }

// class TreeTraversal {
//     public void preorder(TreeNode node) {
//         if (node == null)
//             return;

        
//         System.out.print(node.value + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }

//     public void inorder(TreeNode root) {
//         if (root == null)
//             return;

//         inorder(root.left);
//         System.out.print(root.value + " ");
//         inorder(root.right);
//     }

    
//     public void postorder(TreeNode root) {
//         if (root == null)
//             return;

    
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.value + " ");
//     }

//     public static void main(String args[]) {
//         TreeNode root = new TreeNode(4);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(5);
//         root.left.left = new TreeNode(3);
//         root.left.left.right = new TreeNode(9);
//         root.left.left.right.left = new TreeNode(1);
//         root.right.left = new TreeNode(7);
//         root.right.right = new TreeNode(6);
//         root.right.right.left = new TreeNode(8);
    

        
//         TreeTraversal tree = new TreeTraversal();
//         System.out.print("Preorder traversal: ");
//         tree.preorder(root);
//         System.out.println();
//         System.out.print("Inorder traversal: ");
//         tree.inorder(root);
//         System.out.println();
//         System.out.print("Postorder traversal: ");
//         tree.postorder(root);
//         System.out.println();
//     }
// }
    

    