package july2922.leetcode;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                area = calculateArea(height[i], height[j], j - i);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }
    public static int calculateArea(int height1, int height2, int distance) {
        int height = Math.min(height1, height2);

        return distance * height;
    }
}
