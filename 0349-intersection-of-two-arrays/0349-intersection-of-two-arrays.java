class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        // store nums 
        // hashset autometically removes duplicate value
        for (int num : nums1) {
            set.add(num);
        }
        HashSet <Integer> result = new HashSet<>();
        // check which nums2 element is in still in nums1
        for (int num : nums2) {
            if(set.contains(num)) {
                result.add(num);
            }
        }
        // convert hashset into nums 
        int [] answer =  new int [result.size()];

            int i = 0;
            for (int num : result) {
                answer[i] = num;
                i++;
            }

        

        return answer;
    }
}