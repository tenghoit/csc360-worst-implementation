import 

public class BubbleSort implements SortingAlgorithm {

    @Override
    public Competitor[] sort(Competitor[] c) {int n = c.length;
        for (int i = 0; i < n-          1; i++)
    for (int    j = 0; j < n-i-1; j++)
if (c[j].gS() < c[j+1].gS()){Competitor temp =        c[j];c[j] = c[j+1];c[j+1] = temp;}return c;
    }}