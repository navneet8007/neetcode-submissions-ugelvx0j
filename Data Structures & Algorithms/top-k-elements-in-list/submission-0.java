class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] results  = new int[k];
        Map<Integer, Integer> track = new HashMap<>();
        
        for(int n : nums){
            track.put(n, track.getOrDefault(n, 0) +1);
        }

        // Map<Integer, Integer> track = Arrays.stream(nums).boxed()
        //                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : track.entrySet()){
            heap.offer(new int[] {entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        for(int i = 0 ; i < k; i++){
            results[i] = heap.poll()[1];
        }
        return results;
    }
}
