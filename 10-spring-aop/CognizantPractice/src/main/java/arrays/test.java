package arrays;
import java.util.*;
public class test {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        char ch = str.charAt(0);
        System.out.println();
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        // 1. Correctly declare and initialize the hash array
        // This array will store the last seen index of each character.
        int[] hash = new int[256];
        Arrays.fill(hash, -1); // Fill the array with -1

        // 2. Initialize pointers and maxLen
        int l = 0, r = 0; // 'l' is the left pointer, 'r' is the right pointer
        int maxLen = 0;

        // Loop with the right pointer until it reaches the end of the string
        while (r < n) {
            char currentChar = s.charAt(r); // 3. Use charAt() to get the character

            // Check if we have seen this character before
            if (hash[currentChar] != -1) {
                // If the last seen position of the char is within our current window (>= l),
                // we must move our left pointer 'l' to the right of that last position.
                l = Math.max(l, hash[currentChar] + 1);
            }

            // Update the last seen index for the current character
            hash[currentChar] = r;

            // 4. Correctly calculate the length of the current window
            int currentLen = r - l + 1;
            maxLen = Math.max(maxLen, currentLen);

            // Move the right pointer to expand the window
            r++;
        }
        return maxLen;
    }
}