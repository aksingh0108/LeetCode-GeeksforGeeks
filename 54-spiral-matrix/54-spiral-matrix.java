class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0,left=0,right=matrix[0].length-1,down=matrix.length-1,direction=0;
        while(top<=down && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }else if(direction==1){
                 for(int i=top;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }else if(direction==2){
                 for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }else if(direction==3){
                 for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            direction=(direction+1)%4;
        }
        return list;
    }
}