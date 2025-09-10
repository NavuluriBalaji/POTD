class Solution {
    public String largestSwap(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Support full ASCII range
        int[] lastIndex = new int[256];
        for (int i = 0; i < n; i++) {
            lastIndex[arr[i]] = i;  // store last occurrence
        }

        // Traverse string
        for (int i = 0; i < n; i++) {
            // Check for larger characters than arr[i]
            for (int ch = 255; ch > arr[i]; ch--) {
                if (lastIndex[ch] > i) {
                    // Swap arr[i] with this rightmost larger char
                    int j = lastIndex[ch];
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    return new String(arr);
                }
            }
        }

        // No swap improves the string
        return s;
    }
}
