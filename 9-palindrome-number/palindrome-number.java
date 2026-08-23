class Solution {
    public boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int numCopy = number;

        while(number > 0){
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number = number / 10;
        }
        if(reverseNumber == numCopy) return true;
        else return false;
    }
}