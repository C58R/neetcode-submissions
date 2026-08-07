class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // loop through nums and store frequencies in a map
        for (int num : nums) {
            frequencyMap.merge(num, 1, Integer::sum);
        }

        // afterwards, create a bucket algoritm to store key values using the bucket's index as 
        // frequencies (index = frequency, value = key)
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        } 

        int[] res = new int[k];
        int counter = 0;
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer integer : bucket[pos]) {
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }
}
