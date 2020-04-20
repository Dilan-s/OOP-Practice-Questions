package com.company.Trees;

public class LeafTreeNode<T extends Comparable<T>> extends AbstractTreeNode<T> {


  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public TreeNode<T> getChild(int childIndex) {
    return null;
  }

  @Override
  public void setChild(int childIndex, TreeNode<T> child) {
  }

  @Override
  public boolean addChild(TreeNode<T> child) {
    return false;
  }

  @Override
  public TreeNode<T> clone() {
    return null;
  }
}


