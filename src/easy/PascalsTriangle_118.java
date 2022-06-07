package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            if(i == 0){
                list.add(1);
            }
            else if(i == 1){
                list.add(1);
                list.add(1);
            }
            else{
                int n = l.get(l.size() - 1).size();
                list.add(1);
                for(int j=0;j<n-1;j++){
                    list.add(l.get(l.size() - 1).get(j) + l.get(l.size() - 1).get(j + 1));
                }
                list.add(1);
            }
            l.add(list);
        }
        return l;
    }
}
