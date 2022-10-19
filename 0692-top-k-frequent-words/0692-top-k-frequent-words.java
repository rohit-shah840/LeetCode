class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        //for the frequency count of each word (On)
        Map<String,Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        //priority queue for the lexicographical order
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>(){
            public int compare(String w1, String w2){
                int freq1 = map.get(w1);
                int freq2 = map.get(w2);
                if(freq1==freq2) return w2.compareTo(w1);
                return freq1-freq2;
            }
        });
        
        //to check for the size of the queue equal to k
        for(Map.Entry<String,Integer> e :map.entrySet()){
            pq.add(e.getKey());
            if(pq.size() >k ) pq.poll(); //for size should not be greater than k
        }
        
        //storing the answer here in the order as per the question (O log k)
        List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()) ans.add(pq.poll());
        
        //revers it so that it is in the lexicographical order
        Collections.reverse(ans);
        return ans;
    }
}