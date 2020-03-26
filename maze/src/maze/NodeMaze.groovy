package maze

class NodeMaze extends Node{
	int x;
	int y;
	Boolean close;
	public NodeMaze(Node parent, int x, int y) {
		super();
		this.x = x
		this.y = y
		this.parent = parent
		this.close = false
	}
	public NodeMaze(int x, int y) {
		super()
		this.x = x
		this.y = y
		this.close = false
	}
	
	@Override
	public Boolean isGoal(int x, int y) {
		if(this.x == x && this.y == y) {
			return true
		}else
			return false
	}
	
	@Override
	public Double h() {
		Double dist = Math.sqrt((this.x-59)**2 + (this.y - 29)**2  )
		return dist
	}

	@Override
	public Double g() {
		if(this.parent == null)
			return 0
		int g = this.parent.g() + 1
		return g;
	}
	public Double score() {
		return this.g() - this.h()
	}
	
}
