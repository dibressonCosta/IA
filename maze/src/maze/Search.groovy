package maze
import maze.Node
class Search {
	enum SearchType{BF, DF, AStar}
	SearchType type
	def Fringe() {}
	
	public AddBF(Dist) {
		
	}
	
	public Node busca(Node Root) {
		if(Root.isGoal()) {
			return Root
		}
		def Dist = Root.expand().collect([] as TreeSet){entry -> entry.value}
		if(type == "BF") {
			addBF(Dist)
		}else if(type == "DF") {
			
		}
	}
	
	private Node backingtrackPath(Node current) {
		path = new ArrayList();
		Node iter = cur;
		while(iter != null) {
			path.add(iter)
			iter = iter.parent;
		}
		return path
	}
}
