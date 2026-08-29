class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0; int maxFruits = 0;

        for(int i=0; i<fruits.length; i++){
            if(map.containsKey(fruits[i])){
                    map.put(fruits[i], map.get(fruits[i])+1);
            }else if(map.size() < 2){
                map.put(fruits[i] , 1);
            } else {
                while(map.size() >= 2){
                    if(map.get(fruits[left]) == 1){
                        map.remove(fruits[left]);
                        left++;
                    }
                    else{
                        map.put(fruits[left] , map.get(fruits[left])-1);
                        left++;
                    }
               }
               map.put(fruits[i] , 1);
            }
            maxFruits = Math.max(maxFruits , i - left + 1);
        }
        return maxFruits;
}
}