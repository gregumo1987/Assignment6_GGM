/**
 *  @author Greg Gutierrez
 */

public class Application {


	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);//makes root - this is 31= 2^5-1
		DepthFirstSearch aSearch=new DepthFirstSearch();//instantiating depthFirstSearch
		aSearch.DFS(root);
		
		
		
		System.out.println("The height of the tree is:"+aTree.getHeight());
		
		System.out.println("The number of nodes transversed:"+aSearch.traverseIncrement);
		
		
		System.out.println("invoking getNumberOfNodes() to find number of nodes traversed");
		System.out.println("The number of nodes transversed:"+aTree.getNumberOfNodes());	
	}

}