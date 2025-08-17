# Reverse Array Problem

*Problem Type: Basic Array* | *Difficulty: Easy* | *Topics: Arrays , Two pointer*

## Problem Description
Given an array of integers, reverse the array in-place. You need to reverse the elements of the array without using extra space.

## Example
* Input: nums = [1, 2, 3, 4, 5]
* Output: [5, 4, 3, 2, 1]

## Approach
1. Use two pointers: one at start (left) and one at end (right)
2. Swap elements at left and right positions
3. Move left pointer forward and right pointer backward
4. Continue until left >= right

## Complexity Analysis
**Time Complexity: O(n) - Single pass through half the array
**Space Complexity: O(1) - Only constant extra space for swapping
