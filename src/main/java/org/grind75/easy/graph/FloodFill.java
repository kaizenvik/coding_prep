package org.grind75.easy.graph;

import java.util.*;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ic = image[sr][sc];

        if(ic == color) return image;

        Stack<Integer[]> stack = new Stack<>();
        stack.push(new Integer[] { sr, sc });
        image[sr][sc] = -1;

        while (!stack.isEmpty()) {
            Integer[] s = stack.pop();
            int i = s[0], j = s[1];
            System.out.println(i + " " + j + " " + image[i][j] + " " + ic);

            image[i][j] = color;

            if (i > 0 && image[i - 1][j] == ic) {
                stack.push(new Integer[] { i - 1, j });
                image[i - 1][j] = -1;
            }
            if (j > 0 && image[i][j - 1] == ic) {
                stack.push(new Integer[] { i, j - 1 });
                image[i][j - 1] = -1;
            }
            if (i < image.length - 1 && image[i + 1][j] == ic) {
                stack.push(new Integer[] { i + 1, j });
                image[i + 1][j] = -1;
            }
            if (j < image[0].length - 1 && image[i][j + 1] == ic) {
                stack.push(new Integer[] { i, j + 1 });
                image[i][j + 1] = -1;
            }
        }
        return image;
    }
}
