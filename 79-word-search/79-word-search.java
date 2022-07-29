class Solution {
    public boolean exist(char[][] board, String word) {
        int size=board.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&dfsWord(board,i,j,0,word)) return true;
            }
        }
        return false;
    }
    boolean dfsWord(char[][] board,int i,int j,int wordIndex,String word){
        if(word.length()==wordIndex)return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length ||
        board[i][j] !=word.charAt(wordIndex))  return false;
        char replace=board[i][j];
        board[i][j]='#';
        boolean check=dfsWord(board,i+1,j,wordIndex+1,word) ||    
                      dfsWord(board,i-1,j,wordIndex+1,word)||
                      dfsWord(board,i,j+1,wordIndex+1,word) || 
                      dfsWord(board,i,j-1,wordIndex+1,word);
         board[i][j]=replace;
        return check;
    }
}