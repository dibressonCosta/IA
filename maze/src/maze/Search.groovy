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
			add
		}
	}
}
