class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxFreq = 0;
        int freqSum = 0;

        for(int num: nums){
            int freq = map.getOrDefault(num , 0) + 1;
            if(freq > maxFreq) maxFreq = freq;

            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == maxFreq) freqSum += entry.getValue();
        
        }
        return freqSum;
    }
}