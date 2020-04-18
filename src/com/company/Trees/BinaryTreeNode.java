package com.company.Trees;

public class BinaryTreeNode<T extends Comparable<T>> extends AbstractTreeNode<T> {

  private TreeNode<T> leftChild;
  private TreeNode<T> rightChild;

  public BinaryTreeNode(T key) {
    super.setKey(key);
  }

  public BinaryTreeNode() {
    this(null);
  }

  @Override
  public int getNumberOfChildren() {
    return 2;
  }

  @Override
  public TreeNode<T> getChild(int childIndex) {
    if (childIndex == 0) {
      return leftChild;
    } else if (childIndex == 1) {
      return rightChild;
    }
    throw new IllegalArgumentException();
  }

  @Override
  public void setChild(int childIndex, TreeNode<T> child) {
    if (childIndex == 0) {
      leftChild = child;
    } else if (childIndex == 1) {
      rightChild = child;
    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public boolean addChild(TreeNode<T> child) {
    int compareVal = key.compareTo(child.getKey());
    if (compareVal == 0) {
      return false;
    } else if (compareVal < 0) {
      if (leftChild == null) {
        leftChild = child;
        return true;
      }
      if (leftChild instanceof LeafTreeNode) {
        BinaryTreeNode<T> newLeft = new BinaryTreeNode<>();
        newLeft.setKey(leftChild.getKey());
        boolean b = newLeft.addChild(child);
        if (b) {
          leftChild = newLeft;
        }
        return b;
      } else {
        return leftChild.addChild(child);
      }
    } else {
      if (rightChild == null) {
        rightChild = child;
        return true;
      }
      if (rightChild instanceof LeafTreeNode) {
        BinaryTreeNode<T> newRight = new BinaryTreeNode<>();
        newRight.setKey(rightChild.getKey());
        boolean b = newRight.addChild(child);
        if (b) {
          rightChild = newRight;
        }
        return b;
      } else {
        return rightChild.addChild(child);
      }
    }
  }
}
