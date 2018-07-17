public class Solution {
    public static void main(String[] args){
//        String sentence = "haha";
//        String result  = "";
//
//        result = firstRepeatedWord(sentence);
    }

    String sentance;

    Solution(String input){

        this.sentance = input;
    }

    public String[] firstRepeatedWord() {
        String[] tokens = tokenize(this.sentance);
        return tokens;
    }

    private String[] tokenize(String sentance) {

        return sentance.split(" ");

    }

}