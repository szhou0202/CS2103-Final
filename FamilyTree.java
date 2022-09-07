import java.util.*;

public class FamilyTree {
	private static class FamilyTreeNode {
		private String _name;
		private FamilyTreeNode _parent;
		private Collection<FamilyTreeNode> _children;
	}

	private FamilyTreeNode _root;

	FamilyTreeNode findLowestCommonAncestor (FamilyTreeNode node1, FamilyTreeNode node2) {
		// TODO: IMPLEMENT ME
		// note: we can access the instance vars of FamilyTreeNode
		// strategy:
		// - iterate up through the tree,
		// - keep track of a counter 
		// - return when the ancestor is the same
		// !!! is this too simple?
		// !!! COME BACK TO THIS

		// int counter = 0;
		while (node1 != null && node2 != null && !node1.equals(node2)) {
			node1 = node1._parent;
			node2 = node2._parent;
		}

		// if no common ancestor found
		if (node1 == null || node2 == null) {
			return null;
		}

		return node1;
	}
}
