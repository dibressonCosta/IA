package maze

import maze.NodeMaze.DIR

class TestMaze {
	
	private static int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	
	private static DIR = {[0, 1 ] [ 1, 0 ] [ 0, -1 ] [ -1, 0 ] }
	
	static void main(String[] args) {
		
		final int x = args.length >= 1 ? Integer.parseInt(args[0]) : 8;
		final int y = args.length == 2 ? Integer.parseInt(args[1]) : 8;
		final Maze maze = new Maze(x, y,1,1,31,15);
		//maze.display();
		
		maze.addPoint(31,15);
		maze.addPoint(1,1);
		//maze.display();
		
		//int test = maze.getOriginX()
		print DIR
		
	}
	
}
