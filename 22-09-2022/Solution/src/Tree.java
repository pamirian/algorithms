public class Tree {
    public boolean search(int value) {
        TreeNode current = root;
        while (true) {
            if (current.value == value) {
                return true;
            }
            if (value < current.value) {
                // Необходимо идти влево
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else {
                    return false;
                }
            } else {
                // Необходимо идти вправо
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else {
                    return false;
                }
            }
        }
    }

    public TreeNode searchElement(int value) {
        TreeNode current = root;
        while (true) {
            if (current.value == value) {
                return current;
            }
            if (value < current.value) {
                // Необходимо идти влево
                if (current.leftChild != null) {
                    current = current.leftChild;
                } else {
                    return null;
                }
            } else {
                // Необходимо идти вправо
                if (current.rightChild != null) {
                    current = current.rightChild;
                } else {
                    return null;
                }
            }
        }
    }

    public void pass() {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.leftChild);
        System.out.println(node.value);
        inorder(node.rightChild);
    }


}
}
