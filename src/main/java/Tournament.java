
public class Tournament {
	Competitor[] competitors;
	SortingAlgorithm sortingAlgorithm;
	
	public Tournament(Competitor[] competitors, SortingAlgorithm sortingAlgorithm) {
		super();
		this.competitors = competitors;
		this.sortingAlgorithm = sortingAlgorithm;
	}
	public Competitor[] getCompetitors() {
		return competitors;
	}
	public void setCompetitors(Competitor[] competitors) {
		this.competitors = competitors;
	}

	public SortingAlgorithm getSortingAlgorithm() {
		return sortingAlgorithm;
	}
	public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
	}
	public void sort() {
		this.competitors = this.sortingAlgorithm.sort(this.competitors);
	}
}
