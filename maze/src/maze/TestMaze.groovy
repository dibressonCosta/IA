package maze



class TestMaze {
	static def u = 0
	static def Directions = ["R": [1, 0], "L":[-1, 0],"U":[0, -1], "D": [0, 1]]
	static Boolean TestRight(NodeMaze No, Maze maze) {
		int x = No.x
		int y = No.y
		int aux_x = x + Directions["R"][0]
		int aux_y = y + Directions["R"][1]
		return maze.isEmpty(aux_x, aux_y)
	}
	static Boolean TestLeft(NodeMaze No, Maze maze) {
		int x = No.x
		int y = No.y
		int aux_x = x + Directions["L"][0]
		int aux_y = y + Directions["L"][1]
		return maze.isEmpty(aux_x, aux_y)
	}
	static Boolean TestUp(NodeMaze No, Maze maze) {
		int x = No.x
		int y = No.y
		int aux_x = x + Directions["U"][0]
		int aux_y = y + Directions["U"][1]
		return maze.isEmpty(aux_x, aux_y)
	}
	static Boolean TestDown(NodeMaze No, Maze maze) {
		int x = No.x
		int y = No.y
		int aux_x = x + Directions["D"][0]
		int aux_y = y + Directions["D"][1]
		return maze.isEmpty(aux_x, aux_y)
	}
	static Node nextCoordinate(NodeMaze No, Maze maze) {
		if(u == 0) {
			if(TestRight(No, maze)) {
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["R"][0], No.y + Directions["R"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestDown(No, maze)) {
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["D"][0], No.y + Directions["D"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestLeft(No, maze)) {
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["L"][0], No.y + Directions["L"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestUp(No, maze)) {
				u = 1
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["U"][0], No.y + Directions["U"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}
		}else {
			if(TestUp(No, maze)) {
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["U"][0], No.y + Directions["U"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestRight(No, maze)) {
				u = 0
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["R"][0], No.y + Directions["R"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestDown(No, maze)) {
				u = 0
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["D"][0], No.y + Directions["D"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}else if(TestLeft(No, maze)) {
				u = 0
				NodeMaze nextNode = new NodeMaze(No, No.x + Directions["L"][0], No.y + Directions["L"][1])
				maze.addPoint(nextNode.x, nextNode.y)
				return nextNode
			}
		}
	}
	static Boolean explore(Maze maze, NodeMaze no, path) {
		maze.display()
		sleep(200)

		if(no == null) {
			return true
		}
		path.add(no)
		if (no.x>maze.getNCols())
			return false;
		if (no.y>maze.getNRows())
			return false;
		if(no.x == 31 && no.y == 15) {
			return true
		}
		for (int i = 0; i < 4; i++) {
			NodeMaze node = nextCoordinate(no,maze);
			if (explore(maze, node, path)) {
				maze.addPoint(node.x, node.y)
				return true;
			}
		}
		//path.remove(path.size() - 1);
		return false;
	}
	static void main(String[] args) {
		def tom = []
		def path = []
		final int x = args.length >= 1 ? Integer.parseInt(args[0]) : 8;
		final int y = args.length == 2 ? Integer.parseInt(args[1]) : 8;
		final Maze maze = new Maze(x, y,1,1,31,15);
		//maze.display();
		def point = [1, 1]
		//maze.addPoint(31,15);
		NodeMaze goal = new NodeMaze(31,15)
		maze.addPoint(1,1);
		//maze.display();
		//int test = maze.getOriginX()
		NodeMaze no = new NodeMaze(1,1)
		maze.display()
		explore(maze, no, path)

		maze.display()



		//		println " "
		//		println TestRight(no, maze)
		//		println TestLeft(no, maze)
		//		println TestUp(no, maze)
		//		println TestDown(no, maze)

		//maze.display()
		//NodeMaze noAux = no2

		//NodeMaze no2 = nextCoordinate(no, maze)
		//explore(maze, no2, path)
		//NodeMaze no3 = nextCoordinate(no2, maze)
		//NodeMaze no4 = nextCoordinate(no3, maze)
		//NodeMaze no5 = nextCoordinate(no4, maze)
		//NodeMaze no6 = nextCoordinate(no5, maze)
		//maze.display()
		//println no6.parent
	}
}
