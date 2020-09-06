package Day3;

public class BinarySearch2D {
    //column and row sorted
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        if(matrix[0].length==0) return false;
        
        int left=0, right=(matrix.length*matrix[0].length)-1, n=matrix[0].length;
        int pivotId; int pivotElement;
        while(left<=right){
            pivotId=(left+right)/2;
            pivotElement=matrix[pivotId/n][pivotId%n];
            if(pivotElement==target)
                return true;
            else if(pivotElement>target) right=pivotId-1;
            else left=pivotId+1;
        }
        return false;
    }
    
    public boolean searchMatrixII(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int i=0;
        int j=matrix[0].length-1;
        while(i>=0&&i<matrix.length&&j>=0&&j<matrix[0].length){
            if(matrix[i][j]==target)
                return true;
            else if(target>matrix[i][j])
                i++;
            else
                j--;
            
        }
        return false;
    }
}