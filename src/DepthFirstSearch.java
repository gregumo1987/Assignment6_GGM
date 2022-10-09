/**
 * @author Greg Gutierrez
 */

public class DepthFirstSearch {       
       Node root;
       int traverseIncrement;
       
       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }
       

   	
   	/**method to traverse nodes/and references in a depth-first preorder manner.
   	 * @param root node to start DFS search in tree
   	 */
       
        public void DFS(Node node)        {
                   System.out.println(node.getData()); //prints out node I'm on
                  //ADD CODE TO TRAVERSE THE TREE HERE
                   traverseIncrement++;//counts number of recrusrions called/ used to calculate number of nodes traversed
                   
                   if(node.getlChild()==null && node.getrChild()==null) {
                	 return;// returns one left child and right are null. stops the recursion
                	   
                   }
                  else  {
                	   DFS(node.getlChild());//if left child is not null the left child will be passed through DFS() recursively until null 
                	   DFS(node.getrChild());//if right child is not null the rigt child will be passed through DFS() recursively until null
                 }

   /**     	
    * @return traverseIncrement to count the amount of times dfs is calld/traversed
    */            	
         
        }
		public int getTraverseIncrement() {
			return traverseIncrement;
		}
   
        	
        

}