package array;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName removeDuplicates
 * @Description TODO
 * @Author lc
 * @Data 2019年12月24日  16:04
 * @Version 1.0
 **/
public class removeDuplicates {

    @Test
    public void out() {
        removeDuplicates r = new removeDuplicates();
        int[] nums = {-3,-1,0,0,0,3,3};
        int len = r.removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (Integer integer : set) {
            nums[i] = integer.intValue();
            i++;
        }

        return set.size();
    }
}
