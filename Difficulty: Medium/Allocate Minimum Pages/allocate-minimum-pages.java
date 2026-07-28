class Solution {

    static boolean isValidAnswer(int arr[], int k, long maxPages) {

        int studentCount = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {

                studentCount++;

                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        if (arr.length < k)
            return -1;

        long sum = 0;
        int max = 0;

        for (int x : arr) {
            sum += x;
            max = Math.max(max, x);
        }

        long s = max;
        long e = sum;
        long ans = -1;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return (int) ans;
    }
}