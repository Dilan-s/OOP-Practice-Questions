package com.company.Trees;

public interface TreeNode<E> {

  int getNumberOfChildren();

  TreeNode<E> getChild(int childIndex);

  void setChild(int childIndex, TreeNode<E> child);

  E getKey();

  void setKey(E key);

  boolean addChild(TreeNode<E> child);

  TreeNode<E> clone();
}
