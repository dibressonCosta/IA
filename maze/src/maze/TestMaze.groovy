package maze



class TestMaze {
	static def u = 0
	static def Directions = ["R": [1, 0], "D": [0, 1],"L":[-1, 0],"U":[0, -1], ]
	static Node nextCoordinate(NodeMaze No, int x, int y) {
		NodeMaze nextNode = new NodeMaze(No, (No.x + x), (No.y + y))
		return nextNode
	}
	static Boolean explore(Maze maze, NodeMaze no, List path) {
		//maze.display()
		//sleep(200)
		if(no.state|| path.contains(no) || !maze.isEmpty(no.x, no.y)) {
			return false
		}
		path.add(no)
		no.state = true
		if(no.isGoal()) {
			return true
		}
		for (def Dir : Directions) {
			int x = Dir.value[0]
			int y = Dir.value[1]
			//maze.addPoint(no.x, no.y)
			NodeMaze node = nextCoordinate(no, x, y);
			if (explore(maze, node, path)) {
				return true;
			}
		}
		path.remove(path.size() - 1);
		return false;
	}
	static List solve(Maze maze) {
		def path = []
		NodeMaze no = new NodeMaze(maze.getOriginX(), maze.getOriginY())
		if(explore(maze, no, path)) {
			println path
			return path
		}
		return Collections.emptyList()
	}
	static void main(String[] args) {
		def tom = []
		List path = []
		final int x = args.length >= 1 ? Integer.parseInt(args[0]) : 8;
		final int y = args.length == 2 ? Integer.parseInt(args[1]) : 8;
		final Maze maze = new Maze(x, y,1,1,31,15);
		
		//NodeMaze goal = new NodeMaze(31,15)
		path = solve(maze)
		println "Deu bom"
		//maze.addOption(1, 1)
	}
}
