package homework3;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Triangle Size: ");
		int triangleheight = input.nextInt();
		char char1 = '*'; // The character for the space around the triangle.
		char char2 = ' '; // the character for the space inside the triangle
		System.out.print("Total rows: ");
		int totalRows = input.nextInt(); // the number of rows of triangles
		for(int row = 1; row <= totalRows; row++) { // This loop runs every row of triangles. 
			for(int y = 1; y <= triangleheight; y++) { // This loop draws each line within one row of triangles
				int padding = ((triangleheight*totalRows*2)-(triangleheight*2*row))/2; // crazy shizzle to determine the size of the padding on each side of the triangle(s)
				//System.out.print("Padding: " + padding + "\t"); // This will print out the size of the padding followed by a tab to line it all up nice.
				for(int x = 0; x <= padding; x++) { // draw left side padding
					System.out.print(char1);
				}
				// The following loop will execute once for every triangle that is supposed to be drawn in the current row
				for(int imrunningoutofsensicalvariablenames = 0; imrunningoutofsensicalvariablenames < row; imrunningoutofsensicalvariablenames++) {
					for(int x = 0; x < y; x++) {
						System.out.print(char1);
					}
					for(int x = 0; x < triangleheight-y; x++) {
						System.out.print(char2);
					}
					for(int x = 0; x < triangleheight-y; x++) {
						System.out.print(char2);
					}
					for(int x = 0; x < y; x++) {
						System.out.print(char1);
					}
				}
				for(int x = 0; x <= padding; x++) { // draw right side padding
					System.out.print(char1);
				}
				System.out.println(); // Don't forget to print the line break! otherwise it'll look like complete shit
			}
		}
	}
}
