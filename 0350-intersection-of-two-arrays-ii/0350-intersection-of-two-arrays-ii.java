import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0]; // Return an empty array

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Count occurrences of each element in nums1
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Find the intersection with nums2
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        // Convert list to array
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
