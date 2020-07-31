// solution for https://leetcode.com/problems/pascals-triangle/submissions/
import java.util.ArrayList;
import java.util.List;
class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
             for(int line = 1; line <= numRows; line++) { 
                 int C=1;
                 triangle.add(new ArrayList<Integer>());
                 for(int i = 1; i <= line; i++) 
                 {   
                    triangle.get(line-1).add(C);
                	 System.out.print(C+" ");
                    C = C * (line - i) / i;  
                 }
                 System.out.println();
                } 

        return triangle;
    }
    public static void main(String args[])
    {
    	List<List<Integer>> list= generate(7);
    }
}
