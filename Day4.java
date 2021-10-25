import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day4 {
    
    public static int lastStoneWeight(int[] stones) {
		List<Integer> data = new ArrayList<>();
		for(int i =0; i<stones.length;i++) {
			data.add(stones[i]);
		}
		while(data.size() > 1) {
			Collections.sort(data);
			if(data.get(data.size() -1) == data.get(data.size()-2)) {
				data.remove(data.size()-1);
			} else {
				data.set(data.size()-2, data.get(data.size()-1) - data.get(data.size()-2));
			}
			data.remove(data.size() -1);
		}
		return data.size() == 1? data.get(0):0;
	}
    public static void main(String[] args) {
		/******** DAY 4 ********/     
		
		/******** DAY 4 ENDS ***/
	}
 
}        