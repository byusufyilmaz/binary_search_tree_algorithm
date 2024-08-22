package agacbst10;

public class Agacbst {
	Node root;
	
	Node insert(Node root,int data ) {
		if (root==null) {
			return new Node(data);
		}else if (root.data>data) {
			root.left=insert(root.left , data );
		}else if (root.data <data ) {
			root.right=insert(root.right, data);
		}else {
			return root;
		}
		return root;
	}
	void aragezinti(Node root) {
		if(root!=null) {
			aragezinti(root.left);
			System.out.print(root.data + ">");
			aragezinti(root.right);
		}
	}
	int kacelemanlı(Node root) {
		if(root==null) {
			return 0;
		}else {
			return kacelemanlı(root.right)+1+kacelemanlı(root.left);
		}
	}
	int boy(Node root) {
		if(root==null) {
			return 0;
		}else {
			int sag=0;
			int sol=0;
			sag=boy(root.right);
			sol=boy(root.left);
			if(sol>sag) {
				return sol+1;
			}else {
				return sag+1;
			}
		}
	}
	Node delete(Node root,int key) {
		if (root==null) {
			return null;
		}if (root.data>key) {
			root.left=delete(root.left, key);
		}if (root.data<key) {
			root.right=delete(root.right, key);
		}else {
			if (root.left==null) {
				return root.right;
			}if (root.right==null) {
				return root.left;
			}
			root.data=minvalue(root.right);
			root.right=delete(root.right, root.data);
		}
		return root;
	}
	int minvalue(Node root) {
		int minvalue=root.data;
		while(root.left!=null) {
			minvalue=root.left.data;
			root=root.left;
		}
		return minvalue;
	}
	void deletesil(int key) {
		root=delete(root, key);
	}
}
