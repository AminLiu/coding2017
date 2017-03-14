package com.github.AminLiu.dataStructure;

public class BinaryTreeNode<T extends Comparable> {

	private T data;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	@SuppressWarnings("unchecked")
	public BinaryTreeNode<T> insert(T object) {
		if (object == null) {
			return null;
		}
		if (this.data == null) {
			this.data = object;
			return this;
		}
		int arg0 = this.data.compareTo(object);
		if (arg0 > 0) {
			if (this.left == null) {
				this.left = new BinaryTreeNode<T>();
				this.left.data = object;
				return this.left;
			} else {
				return this.left.insert(object);
			}
		} else if (arg0 < 0) {
			if (this.right == null) {
				this.right = new BinaryTreeNode<>();
				this.right.data = object;
				return this.right;
			} else {
				return this.right.insert(object);
			}
		} else {
			return this;
		}
	}
}
