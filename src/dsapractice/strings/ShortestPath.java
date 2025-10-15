package dsapractice.strings;

public class ShortestPath {
    private static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }

        }

        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path is: " + getShortestPath(path));
    }
}
