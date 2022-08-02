class Solution {
    public int kthSmallest(int[][] matrix, int k) { 
    int row = matrix.length;
    int a[] = new int[row*row];
    int x =0;
    for(int i=0;i<row;i++){
        for(int j=0;j<row;j++){
            a[x] = matrix[i][j];
            x++;
        }
    }
    Arrays.sort(a);
    return a[k-1];
    }
}