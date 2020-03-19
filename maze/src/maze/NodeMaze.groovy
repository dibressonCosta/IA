package maze

class NodeMaze extends Node{
	int x;
	int y;
	public NodeMaze(Node Parent, Maze maze, int x, int y) {
		super();
		this.x = x
		this.y = y
		this.parent = Parent
	}
	
	private enum DIR {
		D(1, 0), C(0, 1), B(0, -1), E(-1, 0);
		private final int bit;
		private final int dx;
		private final int dy;
		private DIR opposite;
 
		// use the static initializer to resolve forward references
		static {
			C.opposite = B;
			B.opposite = C;
			E.opposite = D;
			D.opposite = E;
		}
	}

	@Override
	public Boolean isGoal() {
		return false;
	}
	
	@Override
	public Double h() {
		
		return null;
	}

	@Override
	public Double g() {
		
		return null;
	}
	
}
