package assignment2.leetcode;

public class ShortestWordDistance {
    public static void main(String[] args) {

    }

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        if(wordsDict.length < 2) return 0;
        int p1 = -1;
        int p2 = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < wordsDict.length; i ++){
            String tmp = wordsDict[i];

            if(tmp.equals(word1)){
                p1 = i;
            }

            if(tmp.equals(word2)){
                p2 = i;
            }

            if(p1 != -1 && p2 != -1){
                min = Math.min(min, Math.abs(p1 - p2));
            }

        }

        return min;
    }
}
