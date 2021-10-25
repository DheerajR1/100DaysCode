import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Day4 {
    
    public static int lastStoneWeight(int[] stones) {
		List<Integer> data = new ArrayList<>();
		for(int i =0; i<stones.length;i++) {
			data.add(stones[i]);
		}
		while(data.size() > 1) {
			Collections.sort(data);
		}
	}
    public static void main(String[] args) {
		/******** DAY 4 ********/     
		
		/******** DAY 4 ENDS ***/
	}
 
}        