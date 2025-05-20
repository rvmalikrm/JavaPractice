//package PracticeTest.May.javaCollectionPrac;
//
//import javax.swing.tree.TreeNode;
//
//public class Lab20May25_GeneralTreeTraversal {
//    public static void main(String[] args) {
//        TreeNode root =new TreeNode("A");
//
//        TreeNode b = new TreeNode("B");
//        TreeNode c = new TreeNode("C");
//        TreeNode d = new TreeNode("D");
//        TreeNode e = new TreeNode("E");
//        TreeNode f = new TreeNode("F");
//
//        root.addChild(b);
//        root.addChild(c);
//        root.addChild(d);
//        b.addChild(e);
//        b.addChild(f);
//
//        System.out.println("General Tree DFS Traversal:");
//        dfs(root);
//
//    }
//    public static void dfs(TreeNode node){
//        if(node== null) return;
//        System.out.println(node.data + "");
//        // Visit all children data
//        for ( TreeNode child: node.children){
//            dfs(child);
//
//        }
//    }
//}
