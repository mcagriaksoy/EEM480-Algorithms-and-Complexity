/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mehmet_Cagri_HW3;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */

public class Mehmet_Cagri_HW3 {

    public static MyStack<Position> path = new MyStack<Position>();
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Maze maze = new Maze();
        maze.ReadMazeFromFile();
        maze.SolveMaze(); 
        maze.PrintSolution();
    }   
}
