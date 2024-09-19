class Solution {
   
   

    public List<Integer> diffWaysToCompute(String expression) {
         // Memoization map to store the results of subexpressions
      Map<String, List<Integer>> memo = new HashMap<>();
        // If the result is already computed for this expression, return it
        if (memo.containsKey(expression)) {
            return memo.get(expression);
        }

        List<Integer> result = new ArrayList<>();

        // Iterate through the expression and look for operators
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the current character is an operator, split the expression
            if (ch == '+' || ch == '-' || ch == '*') {
                // Recursively calculate all possible results for left and right parts
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));

                // Combine the results from the left and right subexpressions using the current operator
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        switch (ch) {
                            case '+':
                                result.add(left + right);
                                break;
                            case '-':
                                result.add(left - right);
                                break;
                            case '*':
                                result.add(left * right);
                                break;
                        }
                    }
                }
            }
        }

        // Base case: if there are no operators in the expression, it's a single number
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        // Store the computed result in memoization map
        memo.put(expression, result);

        return result;
    }
}