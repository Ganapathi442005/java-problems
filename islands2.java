import java.util.*;
public class words{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter rows");
int row =sc.nextInt();
System.out.println("enter coiumns");
int col=sc.nextInt();
System.out.println("enter the elements");
int[][] grid=new int[row][col];

for(int i=0;i<row;i++)
{
    for(int j=0;j<col;j++)
    {
        grid[i][j]=sc.nextInt();
    }
}
System.out.println("No of Islands:"+islands(grid));
}

public static int islands(int[][] grid)
{
    if(grid== null|| grid.length==0)
    {
        return 0;
    }
    int count=0;
    int m=grid.length;
    int n=grid[0].length;
   for(int i=0;i<m;i++)
   {
      for(int j=0;j<n;j++)
    {
      if(grid[i][j]==1)
      {
        make0(grid,i,j);
        count++;
      }
    }
   }
   return count;
}

public static void make0(int[][] grid,int i,int j)
{
    if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)
    {
        return;
    }
     grid[i][j]=0;
   make0(grid,i+1,j);
   make0(grid,i-1,j);
   make0(grid,i,j+1);
   make0(grid,i,j-1);
   make0(grid,i+1,j+1);
   make0(grid,i-1,j-1);
   make0(grid,i-1,j+1);
   make0(grid,i+1,j-1);
    
}
}
