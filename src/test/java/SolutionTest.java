import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void fourSumTest1(){

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(-2, -1, 1, 2)));
        expected.add(new ArrayList<>(List.of(-2, 0, 0, 2)));
        expected.add(new ArrayList<>(List.of(-1, 0, 0, 1)));

        List<List<Integer>> actual = new Solution().fourSum(nums, target);

        for (List<Integer> list : actual) {
            Collections.sort(list);
        }

        Assertions.assertEquals(expected, actual);



    }
}
