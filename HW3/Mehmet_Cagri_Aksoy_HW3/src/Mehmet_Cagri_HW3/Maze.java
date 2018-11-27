
package Mehmet_Cagri_HW3;

import static Mehmet_Cagri_HW3.Mehmet_Cagri_HW3.path;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Maze implements HW3Maze  {
    private Scanner readCodes;
    int x,y;
    int tmp0,tmp1;
    public static int[][] maze = new int[10][10];
  
    @Override
    public void ReadMazeFromFile() {
        try {
            System.out.println("Enter Database's file Location (PATH of File):");
            Scanner scanner = new Scanner(System.in); //I used scanner func. to get path from keyboard.
            String DOSYA = scanner.nextLine();
            File file = new File(DOSYA); 
            readCodes = new Scanner(file); //File scanner code.            
            System.out.println("File Opened!\nOur Maze file is:");
             
            while(readCodes.hasNext()){
                for(int x = 1 ; x<=8 ; x++){
                    int k = 1;
                    for(int y=1; y<=8 ; y++){
                        maze[x][y]=readCodes.nextByte();
                        System.out.print(maze[x][k]);
                        System.out.print(" ");
                        k++;
                    }
                 System.out.println(" ");       
                }
            } 
            
	} catch (FileNotFoundException e) {
            System.out.println("Could not locate the data file!");
            ReadMazeFromFile(); 
            //In this line function called itself (recursive one)
            //Because we prob. enter wrong location of file, program wants true location.
        }
    }
    @Override
    public void SolveMaze() {
        
        Position [] offset = new Position[8];	
		for(int i = 0; i <= 7; i++)
			offset[i] = new Position();
                // EAST
		offset[0].row = 0; 
		offset[0].col = 1; 
                // SOUTH
		offset[1].row = 1;
		offset[1].col = 0; 
                // WEST
		offset[2].row = 0; 
		offset[2].col = -1; 
                // NORTH
		offset[3].row = -1; 
		offset[3].col = 0; 
                // SW
		offset[4].row = 1; 
		offset[4].col = -1;
                // NW
                offset[5].row = -1; 
		offset[5].col = -1;
                // SE
                offset[6].row = 1; 
		offset[6].col = 1;
                // NE
                offset[7].row = -1; 
		offset[7].col = 1;
                
                Position here;
                here = new Position();
		Position next;
                next = new Position();
                
                for (x = 1; x <= 8; x++) {
                        for (y = 1; y <= 8; y++) {
                            if(maze[x][y] == 32){
                                here.row = x;
                                here.col = y;
                                tmp0 = x;
                                tmp1 = y;
                                maze[x][y] = 0;
                                break;
                            }
                        }
                    }                
                try{
                    for (int i = 0; i <= 9; i++) {
                          maze[0][i] = maze[9][i] = 0; // bottom and top
                          maze[i][0] = maze[i][9] = 0; // left and right
                          }
                       int option = 0; // next move
                       int LastOption = 7;
                       int temp=31;
                       // search for a path
                       while (temp != 0) {// not exit
                          // find a neighbor to move to
                          int r = 0;
                          int c = 0;      
                          while (option <= LastOption) {
                             r = here.row + offset[option].row;
                             c = here.col + offset[option].col;
                             if (maze[r][c] == temp) break;
                             option++; // next option
                             }

                          // was a neighbor found?
                          if (option <= LastOption) {
                             // move to maze[r][c]
                             here = new Position(r,c);
                             path.push(here); //Add "here" Position into the Stack		     
                             here.row = r; 
                             here.col = c;
                             maze[r][c] = 0; // set to 0 to prevent revisit
                             option = 0;
                             temp--;
                             }
                          else {// no neighbor to move to, back up       
                             if (path.IsEmpty()) return;
                             next = path.pop(); 
                             if (next.row == here.row)
                                option = 2 + next.col - here.col;
                             else option = 3 + next.row - here.row;
                             here = next;
                             ++temp;  
                            }		  
                        }
                    }
                catch(Exception e){
                    for (int a = (tmp0+1); a <= 8; a++) {
                        for (int b = tmp1; b <= 8; b++) {
                            if(maze[a][b] == 32){
                                here.row = a;
                                here.col = b;
                                maze[x][y] = 0;
                                break;
                                }
                        }
                    }                   
                }	 
    }
    @Override
    public void PrintSolution() {
        
        System.out.println("The path is:");
        while (!path.IsEmpty()) {
		      Position here = path.pop();
		      System.out.print((here.row)+":"+(here.col)+"->");                      
		}
        System.out.print(tmp0);
        System.out.print(":"+tmp1);
        System.out.print("\n");
        }  
  
    }