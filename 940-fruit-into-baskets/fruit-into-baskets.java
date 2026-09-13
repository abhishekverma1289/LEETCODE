class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int low = 0; int maxFruits = 0;

        for(int high = 0; high < fruits.length; high++){
            int numsOfFruits = map.getOrDefault(fruits[high],0);
            map.put(fruits[high] , numsOfFruits + 1);

            while(map.size() > 2){
                int numsOfLow = map.get(fruits[low]) - 1;

                if(numsOfLow == 0) map.remove(fruits[low]);
                else map.put(fruits[low] , numsOfLow);
                low++;
            }
            maxFruits = Math.max(maxFruits , high - low + 1);
        }
        return maxFruits;
    }
}