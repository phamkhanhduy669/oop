public class SpiralWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int layer = 1;
        int direction = 0; // 0: right, 1: up, 2: left, 3: down

        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);

            switch (direction) {
                case 0: x++; break; // Move right
                case 1: y++; break; // Move up
                case 2: x--; break; // Move left
                case 3: y--; break; // Move down
            }

            steps++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);

            // Change direction at the boundaries of the current layer
            if (direction == 0 && x == layer) direction = 1;
            else if (direction == 1 && y == layer) direction = 2;
            else if (direction == 2 && x == -layer) direction = 3;
            else if (direction == 3 && y == -layer) {
                direction = 0;
                layer++;
            }
        }
        StdOut.println("Total steps = " + steps);
    }
}
