
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        
        int numberOfRows = grid.length;
        int numberOfColumns = grid[0].length;
        int land = 0;
        int count =0;
        int overlap = 0;
        
        for(int i =0; i <numberOfRows; i++){
            for(int j=0; j<numberOfColumns;j++ ){
                if(grid[i][j]==0){
                    continue;
                }else{
                    count++;
                    land =1;
                }
            }
        }
        
        if(land==0){
            return 0;
        }
        
        if(count == 1){
            return 4;
        }
        
        for(int i =0; i <numberOfRows; i++){
            for(int j=0; j<numberOfColumns-1;j++ ){
                if(grid[i][j]==1 && grid[i][j+1]== 1){
                    overlap ++;
                }else{
                    continue;
                }
            }
        }
        
        for(int i =0; i <numberOfRows-1; i++){
            for(int j=0; j<numberOfColumns;j++ ){
                if(grid[i][j]==1 && grid[i+1][j]== 1){
                    overlap ++;
                }else{
                    continue;
                }
            }
        }
        
        return ((4 * count) - (2 * overlap));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0}, {1,1,1,0},{0,1,0,0},{1,1,0,0}};
		IslandPerimeter ip = new IslandPerimeter();
		System.out.println(ip.islandPerimeter(grid));
		

	}

}
