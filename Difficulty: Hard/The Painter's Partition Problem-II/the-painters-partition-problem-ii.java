class Solution {

    static boolean isValidSolution(int[] boards, int k, int maxLength) {

        int painterCount = 1;
        int paintedLength = 0;

        for (int board : boards) {

            if (paintedLength + board <= maxLength) {
                paintedLength += board;
            } else {

                painterCount++;

                if (painterCount > k) {
                    return false;
                }

                paintedLength = board;
            }
        }

        return true;
    }

    public int minTime(int[] boards, int k) {

        int sum = 0;
        int max = 0;

        for (int board : boards) {
            sum += board;
            max = Math.max(max, board);
        }

        int s = max;
        int e = sum;
        int ans = sum;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidSolution(boards, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}