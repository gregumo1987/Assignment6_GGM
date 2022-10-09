/**
 * @author Greg Gutierrez
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}
	
	/**counts up the number of nodes and number of nodes referenced to left and right nodes
	 * @return 1 plus the left and right node
	 */
	
	public int getNumberOfNodes() {
		int left=0;
		int right=0;
		
		if(lChild != null) {
		left=lChild.getNumberOfNodes();
			
			if(rChild !=null)	{
			
			right=rChild.getNumberOfNodes();
			}	
			
		}
		return 1+left+right;	
	}	
}