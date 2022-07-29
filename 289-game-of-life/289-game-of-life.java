class Solution {
    public void gameOfLife(int[][] board) {
        //state 0->1=2;
        //state 1->0=-1;
        int row=board.length;
        int column=board[0].length;
      
        int direction[][]=new int [][]{{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int count=0;
                for(int z=0;z<8;z++){
                    int x=i+direction[z][0];
                    int y=j+direction[z][1]; 
                    if(x>=0 && x<row && y>=0 && y<column){
                    if(Math.abs(board[x][y])==1)count++;
                    }
                }
                if(board[i][j]==1){
                    if(count==2||count==3)board[i][j]=1;
                    else board[i][j]=-1;
                }
                else{
                    if(count==3)board[i][j]=2;
                    else board[i][j]=0;
                }
            }
        }
           for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++)
                    board[i][j] = board[i][j] > 0 ? 1 : 0;
        }
        System.out.println(board);
        
    }
}