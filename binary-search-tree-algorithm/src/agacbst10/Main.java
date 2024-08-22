package agacbst10;

public class Main {

	public static void main(String[] args) {
		Agacbst bst=new Agacbst();
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 30);
		bst.root=bst.insert(bst.root, 40);
		
		bst.deletesil(40);
		bst.deletesil(10);
		bst.deletesil(20);
		bst.deletesil(30);
		
		bst.aragezinti(bst.root);
		System.out.println("");
		System.out.println("agacın boyu " + bst.boy(bst.root));
		System.out.println("agactakı eleman sayısı " + bst.kacelemanlı(bst.root));
		
	}

}
