# Move Zeros

**LeetCode Problem #283** | **Difficulty: Easy** | **Topics: Array, Two Pointers**

## Problem Description
Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note:** You must do this in-place without making a copy of the array.

## Example
*Input: nums = [0,1,0,3,12]*
*Output: [1,3,12,0,0]*

## Approach
1. Use two pointers: `left` for placing non-zero elements, `right` for scanning
2. When `right` finds a non-zero element, place it at `left` position
3. After processing all elements, fill remaining positions with zeros
4. Maintains relative order of non-zero elements

## Complexity Analysis
* Time Complexity: O(n) - Single pass through the array
* Space Complexity: O(1) - Only constant extra space
