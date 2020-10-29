import java.util.ArrayList;
import java.util.List;

public class p00118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows ==0) return res;
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for(int i = 1; i < numRows;i++){
            List<Integer> prev = res.get(i-1);
            List<Integer> current = new ArrayList<Integer>();
            current.add(1);
            for(int j = 1; j < i; j++){
                current.add(prev.get(j-1)+prev.get(j));
            }
            current.add(1);
            res.add(current);
        }
        return res;
        
    }


}
