class Solution {
    public boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int numberCopy = number;

        while(number > 0){
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number = number / 10;
        }
        return reverseNumber == numberCopy;
    }
}