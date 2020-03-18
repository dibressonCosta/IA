package maze

public abstract class Node {
	Node parent;
	public abstract Double h();
	public abstract Double g();
	def Boolean isGoal() {
		return false
	};
	def expand () {};
}
