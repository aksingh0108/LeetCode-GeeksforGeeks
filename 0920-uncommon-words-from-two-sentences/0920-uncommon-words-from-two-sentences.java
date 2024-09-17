class Solution {
    public String[] uncommonFromSentences(String s1, String s2) { 
        
      // Split both sentences into words using split() by space delimiter
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        // Create a map to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Count occurrences from the first sentence
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Count occurrences from the second sentence
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Collect words that appear exactly once
        List<String> result = new ArrayList<>();
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                result.add(word);
            }
        }
        
        // Convert result list to an array and return
        return result.toArray(new String[0]);
    }
 
}
