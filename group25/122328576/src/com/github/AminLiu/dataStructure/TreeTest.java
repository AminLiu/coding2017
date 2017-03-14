package com.github.AminLiu.dataStructure;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {
	private BinaryTreeNode<Integer> tree;

	@Before
	public void setUp() throws Exception {
		tree = new BinaryTreeNode<>();
		tree.insert(6);
		tree.insert(5);
		tree.insert(7);
		tree.insert(4);
		tree.insert(1);
		tree.insert(8);
		System.out.println(tree.toString());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(tree.getData().intValue(), 6);
	}

}
