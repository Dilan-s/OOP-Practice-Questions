package com.company.Trees;

public abstract class AbstractTreeNode<T extends Comparable<T>> implements TreeNode<T> {

  protected T key;

  @Override
  public T getKey() {
    return key;
  }

  @Override
  public void setKey(T key) {
    this.key = key;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(key);
    sb.append(" [");
    sb.append(getNumberOfChildren());
    sb.append("]");
    if (getNumberOfChildren() > 0) {
      sb.append(" [");
      for (int i = 0; i < getNumberOfChildren(); i++) {
        sb.append(getChild(i));
        if (i < getNumberOfChildren() - 1) {
          sb.append(", ");
        }
      }
      sb.append("]");
    }
    return sb.toString();
  }

  public abstract TreeNode<T> clone();

}
