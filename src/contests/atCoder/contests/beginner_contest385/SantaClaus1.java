package contests.atCoder.contests.beginner_contest385;

import java.util.Scanner;

public class SantaClaus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        char[][] grid = new char[h][w];
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < w; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        String t = sc.nextLine();
        x--;
        y--;
        int count = 0;
        int[][] visited = new int[h][w];
        for (int i = 0; i < t.length(); i++) {
            switch (t.charAt(i)) {
                case 'U' -> {
                    if(x - 1 >= 0) {
                        if (grid[x - 1][y] != '#') {
                            x--;
                            if(grid[x][y] == '@' && visited[x][y] == 0) {
                                count++;
                                visited[x][y] = 1;
                            }
                        }
                    }

                }
                case 'D' -> {
                    if(x + 1 < h) {
                        if (grid[x + 1][y] != '#') {
                            x++;
                            if(grid[x][y] == '@' && visited[x][y] == 0) {
                                count++;
                                visited[x][y] = 1;
                            }
                        }
                    }
                }
                case 'L' -> {
                    if(y - 1 >= 0) {
                        if (grid[x][y - 1] != '#') {
                            y--;
                            if(grid[x][y] == '@' && visited[x][y] == 0) {
                                count++;
                                visited[x][y] = 1;
                            }
                        }
                    }
                }
                case 'R' -> {
                    if(y + 1 < w) {
                        if (grid[x][y + 1] != '#') {
                            y++;
                            if(grid[x][y] == '@' && visited[x][y] == 0) {
                                count++;
                                visited[x][y] = 1;
                            }
                        }
                    }
                }
            }
        }
        x++;
        y++;
        System.out.println(x + " " + y + " " + count);

    }
}
