import java.util.Arrays;

class Test {

    static int res;
    static void dfs(int currPos, int movesMade,
                    int[] move, int[] best, int m) {

        if (movesMade >= res)
            return;

        if (movesMade >= best[currPos])
            return;

        best[currPos] = movesMade;
        if (currPos == m) {
            res = Math.min(res, movesMade);
            return;
        }
        for (int dice = 1;
             dice <= 6 && currPos + dice <= m;
             dice++) {

            int nxt = currPos + dice;

            // Apply snake or ladder
            if (move[nxt] != -1)
                nxt = move[nxt];

            dfs(nxt, movesMade + 1, move, best, m);
        }
    }

    // Function to compute minimum throws
    static int minThrows(int n, int[] lad, int[] sn) {

        int m = n * n;

        int[] move = new int[m + 1];
        Arrays.fill(move, -1);

        // Store ladders
        for (int i = 0; i + 1 < lad.length; i += 2)
            move[lad[i]] = lad[i + 1];

        // Store snakes
        for (int i = 0; i + 1 < sn.length; i += 2)
            move[sn[i]] = sn[i + 1];

        int[] best = new int[m + 1];
        Arrays.fill(best, Integer.MAX_VALUE);

        res = Integer.MAX_VALUE;

        dfs(1, 0, move, best, m);

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String[] args) {

        int n = 6;

        int[] lad = {3, 22, 5, 8, 11, 35, 20, 32};
        int[] sn = {17, 4, 19, 7, 34, 1, 21, 9};

        System.out.println(minThrows(n, lad, sn));
    }
}
