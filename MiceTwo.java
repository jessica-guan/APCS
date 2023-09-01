import java.util.*;
 
public class MiceTwo {
    private static class Cell {
        int x;
        int y;
        int dist;
        Cell prev;
        Cell (int x, int y, int dist, Cell prev) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.prev = prev;
        }
        @Override
        public String toString() {
        	return "(" + x + "," + y + ")";
        }
    }
	public static void shortestPath(int[][] matrix, int[] start, int[] end) {
		int sx = start[0], sy = start[1];
		int dx = end[0], dy = end[1];	
		if (matrix[sx][sy] == 0 || matrix[dx][dy] == 0) {
			return;  
		}
	    int m = matrix.length;
	    int n = matrix[0].length;	    
	    Cell[][] cells = new Cell[m][n];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matrix[i][j] != 0) {
	                cells[i][j] = new Cell(i, j, Integer.MAX_VALUE, null);
	            }
	        }
	    }
	    LinkedList<Cell> queue = new LinkedList<>();       
	    Cell src = cells[sx][sy];
	    src.dist = 0;
	    queue.add(src);
	    Cell dest = null;
	    Cell p;
	    while ((p = queue.poll()) != null) {
	        if (p.x == dx && p.y == dy) { 
	            dest = p;
	            break;
	        }
	        visit(cells, queue, p.x - 1, p.y, p);        
	        visit(cells, queue, p.x + 1, p.y, p);        
	        visit(cells, queue, p.x, p.y - 1, p);        
	        visit(cells, queue, p.x, p.y + 1, p);
	    }
	    if (dest == null) {
	    	System.out.println("NO");
	        return;
	    } else {
	        LinkedList<Cell> path = new LinkedList<>();
	        p = dest;
	        do {
	            path.addFirst(p);
	        } while ((p = p.prev) != null);
	        System.out.println("YES");
	    }
	}
	private static void visit(Cell[][] cells, LinkedList<Cell> queue, int x, int y, Cell parent) { 
	    if (x < 0 || x >= cells.length || y < 0 || y >= cells[0].length || cells[x][y] == null) {
	        return;
	    }    
	    int dist = parent.dist + 1;
	    Cell p = cells[x][y];
	    if (dist < p.dist) {
	        p.dist = dist;
	        p.prev = parent;
	        queue.add(p);
	    }
	}
	public static void main(String[] args) {
		System.out.println("Enter number of rows and columns, then enter map.");
		Scanner console = new Scanner(System.in);
		int r = console.nextInt();
		int c = console.nextInt();
		int[][] map = new int[r][c];
		int row = 0;
		int col = 0;
		String string;
		for (int i = 0; i < r; i++) {
			string = console.next();
			for (int j = 0; j < string.toCharArray().length; j++) {
				if (string.toCharArray()[j] == '+') {
					map[i][j] = 0;
				} else {
					map[i][j] = 1;
				}
				if (string.toCharArray()[j] == 'M') {
					row = i;
					col = j;
				}
			}
        }
	   	int[] start = {0, 0};
	   	int[] end = {row, col};
	   	shortestPath(map, start, end);
	   	console.close();
	} 
}