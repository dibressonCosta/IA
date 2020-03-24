package maze

class NodeMaze extends Node{
	int x;
	int y;
	public NodeMaze(Node parent, int x, int y) {
		super();
		this.x = x
		this.y = y
		this.parent = parent
	}
	public NodeMaze(int x, int y) {
		super()
		this.x = x
		this.y = y
	}
	
	//static def Directions = ["D": [1,0], "E":[-1,0],"C":[0,1], "B": [0,-1]]

	@Override
	public Boolean isGoal() {
		if(this.x == 31 && this.y ==15) {
			return true
		}else
			return false
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
