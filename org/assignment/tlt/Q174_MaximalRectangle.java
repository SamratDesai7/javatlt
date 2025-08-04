package org.assignment.tlt;

import java.util.Stack;

public class Q174_MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            int area = largestRectangleArea(heights);
            if (area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println("Max Area: " + maxArea);
    }

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int[] extended = new int[heights.length + 1];

        for (int i = 0; i < heights.length; i++) {
            extended[i] = heights[i];
        }

        for (int i = 0; i < extended.length; i++) {
            while (!stack.isEmpty() && extended[i] < extended[stack.peek()]) {
                int height = extended[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
            stack.push(i);
        }

        return maxArea;
    }
}
