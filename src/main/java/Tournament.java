
public class Tournament {Competitor[] c;SortingAlgorithm x;
public Tournament	(Competitor[] xx, SortingAlgorithm x) {super(); this.c = xx; this.x = x;}
public Competitor[] getCompetitors() {return c;}public void setCompetitors(Competitor[] xx) {this.c = 											xx;}
		public SortingAlgorithm getSortingAlgorithm() {return 
x;}
public void setSortingAlgorithm(SortingAlgorithm x) {this.x = x;}
public void sort() {this.c = this.x.sort(this.c);}
}
