## Two Sum Problem
*LeetCode Problem #1* | *Difficulty: Easy* | *Topics: Array, Hash Table*

## Problem Description
*Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

*You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

## Complexity Analysis
- **Time Complexity:** O(n²) - Brute force approach
- **Space Complexity:** O(1) - Only constant extra space

## Approach
* Use nested loops to check every pair of numbers.
* Return indices when target sum is found.
