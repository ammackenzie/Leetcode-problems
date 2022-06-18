package hard.WordFilter;

public class TrieNode {
    TrieNode[] children;
    int weight;
    public TrieNode() {
        children = new TrieNode[27]; // 'a' - 'z' and '{'. 'z' and '{' are neighbours in ASCII table
        weight = 0;
    }
}

