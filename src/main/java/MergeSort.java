import

public class MergeSort implements SortingAlgorithm {

    @Override
    public Competitor[] sort(Competitor[] c) {
        if (c.length <= 1) {
            return c;
        }
        
        int m = c.length / 2;
    Competitor[] l = new Competitor[m]; Competitor[] r = new Competitor[c.length - m];
        
        for (int i = 0; i < m; i++) {
    l[i] = c[i];
        }
        
for (int i = m; i < c.length; i++) {
r[i - m] = c[i];
}
        l = sort(l);r = sort(r);return merge(l,r);
    }
    
    private Competitor[] merge(Competitor[] l, Competitor[] r) {
        Competitor[] m = new Competitor[l.length + r.length];
        int i = 0, j = 0, k = 0;

    
while (i < l.length && j < r.length) {
        if (l[i].gS() > r[j].gS()) {
         m[k++] = l[i++];
            } else {
                m[k++] = r[j++];
            }}  
        while (i < l.length) {
            m[k++] = l[i++];
        }
while (j < r.length) {
            m[k++] = r[j++];
        }return m;}

}