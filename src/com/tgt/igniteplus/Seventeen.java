package com.tgt.igniteplus;

public class Seventeen {
    public static void main(String[] args) {
        TreeNode d = new TreeNode('D');
        TreeNode k = new TreeNode('K');
        TreeNode e = new TreeNode('E');
        TreeNode g = new TreeNode('G');
        TreeNode c = new TreeNode('C', d, null);
        TreeNode b = new TreeNode('B', c, e);
        TreeNode h = new TreeNode('H', null, k);
        TreeNode f = new TreeNode('F', g, h);
        TreeNode a = new TreeNode('A', b, f);
        System.out.println("The leaf nodes are : ");
        leafnodes(a);

    }
    public static void leafnodes(TreeNode node)
    {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null)
        { System.out.printf("%c ", node.value);
        }
        leafnodes(node.left);
        leafnodes(node.right);
    }

}
    class TreeNode
    {     char value;
          TreeNode left;
          TreeNode right;

        TreeNode(char data)
        { this.value = data;
        }

        TreeNode(char data, TreeNode left, TreeNode right)
        { this.value = data;
        this.left = left;
        this.right = right;
        }
    }




