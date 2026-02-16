
public class Competitor {
	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Competitor(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}
