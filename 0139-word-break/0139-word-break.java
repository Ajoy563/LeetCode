class Solution {

    static class Node {

        Node children[] = new Node[26];

        boolean eow = false;

        public Node() {

            Arrays.fill(children, null);

        }

    }

    public Node root = new Node();

    public void insert(String word) {

        Node curr = root;

        for(int level = 0; level < word.length(); level++) {

            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {

                curr.children[idx] = new Node();

            }

            curr = curr.children[idx];

        }

        curr.eow = true;

    }

    public boolean wordBreak(String s, List<String> wordDict) {

        // Build Trie only once

        for(String word : wordDict) {

            insert(word);

        }

        int n = s.length();

        // dp[i] = -1 -> not calculated

        // dp[i] = 0  -> cannot break

        // dp[i] = 1  -> can break

        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);

        return solve(s, 0, dp);

    }

    public boolean solve(String s, int start, int dp[]) {

        // Entire string is successfully matched

        if(start == s.length()) {

            return true;

        }

        // Already calculated

        if(dp[start] != -1) {

            return dp[start] == 1;

        }

        Node curr = root;

        for(int i = start; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            // No matching Trie path

            if(curr.children[idx] == null) {

                break;

            }

            curr = curr.children[idx];

            // Found a word

            if(curr.eow) {

                if(solve(s, i + 1, dp)) {

                    dp[start] = 1;

                    return true;

                }

            }

        }

        dp[start] = 0;

        return false;

    }

}