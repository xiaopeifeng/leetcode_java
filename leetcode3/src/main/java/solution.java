import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int front = 0;
        int end = 0;

        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> map = new LinkedHashSet<Character>();
        for (; end < s.length(); ) {
            Character c = s.charAt(end);
            if (map.contains(c)) {
                map.remove(s.charAt(front));
                front++;
            } else {
                end++;
                map.add(c);
                if (end - front > maxlen) {
                    maxlen = end - front;
                }
            }
        }

        return maxlen;
    }

    static public void main(String[] args) {
        Solution s = new Solution();
        assert (s.lengthOfLongestSubstring("abcabcbb") == 3);
        assert (s.lengthOfLongestSubstring("bbbb" ) == 1);
        assert (s.lengthOfLongestSubstring("pwwkew") == 3);
    }
}