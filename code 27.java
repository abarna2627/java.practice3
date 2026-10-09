class Solution {
    public int[][] matrixReshape(int[][] a, int r, int c) {
        if(a.length*a[0].length!=r*c) return a;
        int [][] b= new int[r][c];
        for(int i=0;i<r*c;i++)
        b[i/c][i%c]=a[i/a[0].length][i%a[0].length];
        return b;
    }
}