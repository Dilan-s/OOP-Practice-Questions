package com.company.Trees;

public class GenericTreeNode<E extends Comparable<E>> extends AbstractTreeNode<E> {

  private TreeNode<E>[] children;

  @SuppressWarnings("unchecked")
  public GenericTreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {
    children[childIndex] = child;
  }

  @Override
  public boolean addChild(TreeNode<E> child) {
    for (TreeNode<E> tN : children) {
      if (tN != null) {
        if (tN.getKey() == child.getKey()) {
          return false;
        }
      }
    }
    setChild(children.length - 1, child);
    return true;
  }

  @Override
  public TreeNode<E> clone() {
    TreeNode<E> clone = new GenericTreeNode<>(children.length);
    clone.setKey(super.key);
    int pointer = 0;
    for (TreeNode<E> child : children){
      clone.setChild(pointer, child.clone());
      pointer++;
    }
    return clone;
  }

}
