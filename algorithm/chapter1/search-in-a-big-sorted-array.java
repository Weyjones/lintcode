/**http://www.lintcode.com/en/problem/search-in-a-big-sorted-array/
 * Definition of ArrayReader:
 * class ArrayReader {
 *      // get the number at index, return -1 if not exists.
 *      public int get(int index);
 * }
 */
public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        // Step 1: find the first index >= target
        int index = 1;
        
        while (reader.get(index) < target) {
            if (reader.get(index * 2) == -1) {
                index = index + 1;
            } else {
                index = index * 2;
            }
        }
        
        // at this point, reader.get(index) >= target
        
        // Step 2: binary search for target between 0 and index
        int start = 0, end = index;
        while (start + 1 < end) {
            int mid = (start + end)/2;
            int value = reader.get(mid);
            if (value >= target) {
                //move left
                end = mid;
            } else {
                // move right
                start = mid;
            }
        }
        
        // at this point, start + 1 = end
        if (reader.get(start) == target) {
            return start;
        }
        if (reader.get(end) == target) {
            return end;
        }
        return -1;
    }
}