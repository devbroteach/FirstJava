package firstjava;

import java.util.ArrayDeque;

public class TraverseDeepStack {

    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        traverse(map, 1, 1);
        char[] ch = {'.', '*', 'G', 'o'};
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }
    static boolean traverse(int[][] map, int curX, int curY) {
        record Position(int x, int y) {
        }
        var stack = new ArrayDeque<Position>();
        stack.push(new Position(curX, curY));
        for (Position p; (p = stack.pollFirst()) != null; ) {
            switch (map[p.y()][p.x()]) {
                case 0:
                    break; // 통로이므로 계속 처리
                case 2:
                    return true; // 목표(골)이므로 종료
                default:
                    continue; // 통과할 수 없기 때문에 다른 경로 처리
            }
            map[p.y()][p.x()] = 3;
            stack.push(new Position(p.x() + 1, p.y()));
            stack.push(new Position(p.x() - 1, p.y()));
            stack.push(new Position(p.x(), p.y() + 1));
            stack.push(new Position(p.x(), p.y() - 1));
        }
        return false;
    }
}
