package contests.atCoder.contests.beginner_contest385;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SantaClaus2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        ArrayList<int[]> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new int[]{x, y});
        }
        sc.nextLine();
        ArrayList<Move> moves = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            char direction = sc.next().charAt(0);
            int steps = sc.nextInt();
            moves.add(new Move(direction, steps));
        }
        String result = solve(n, m, sx, sy, points, moves);
        System.out.println(result);
        sc.close();

    }

    static String solve(int n, int m, int sx, int sy, ArrayList<int[]> points, ArrayList<Move> moves) {
        return "";
    }

    static class Move {
        char direction;
        int steps;

        public Move(char direction, int steps) {
            this.direction = direction;
            this.steps = steps;
        }
    }
}

