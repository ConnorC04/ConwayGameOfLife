package com.zipcodeconway;

public class ConwayGameOfLife {

    public ConwayGameOfLife(Integer dimension) {
     }

    public ConwayGameOfLife(Integer dimension, int[][] startmatrix) {
    }

    public static void main(String[] args) {
        ConwayGameOfLife conwayGameOfLife = new ConwayGameOfLife(5);
        int[][] conway = conwayGameOfLife.createRandomStart(5);
        ConwayGameOfLife sim = new ConwayGameOfLife(5, conway);
    }

    // Contains the logic for the starting scenario.
    // Which cells are alive or dead in generation 0.
    // allocates and returns the starting matrix of size 'dimension'
    private int[][] createRandomStart(Integer dimension) {
        return new int[dimension][dimension];
    }

    public int[][] simulate(Integer maxGenerations) {

        while (maxGenerations > 0){

            maxGenerations--;
        }
        return new int[1][1];
    }

    // copy the values of 'next' matrix to 'current' matrix,
    // and then zero out the contents of 'next' matrix
    public void copyAndZeroOut(int [][] next, int[][] current) {
        for (int i = 0; i < current.length; i++){
            for (int j = 0; j < current.length; j++){
                current[i][j] = next[i][j];
                next[i][j] = 0;
            }
        }
    }

    // Calculate if an individual cell should be alive in the next generation.
    // Based on the game logic:
	/*
		Any live cell with fewer than two live neighbours dies, as if by needs caused by underpopulation.
		Any live cell with more than three live neighbours dies, as if by overcrowding.
		Any live cell with two or three live neighbours lives, unchanged, to the next generation.
		Any dead cell with exactly three live neighbours cells will come to life.
	*/
    private int isAlive(int row, int col, int[][] world) {
        if (world[row][col] == 1) {
            return 0;
        }
        return 1;
    }
}
