package homework3;

import java.util.Scanner;

/*
 Copyright (c) 2012, Finnian Herzfeld
All rights reserved.

Chicken Dance License v0.1
http://supertunaman.com/cdl/

Redistribution and use in source and binary forms, with 
or without modification, are permitted provided that the 
following conditions are met:

    1. Redistributions of source code must retain the 
        above copyright notice, this list of conditions and 
        the following disclaimer.
    2. Redistributions in binary form must reproduce the 
        above copyright notice, this list of conditions and 
        the following disclaimer in the documentation and/or 
        other materials provided with the distribution.
    3. Neither the name of the Cactus Enterprises nor the names 
        of its contributors may be used to endorse or promote 
        products derived from this software without specific 
        prior written permission.
    4. An entity wishing to redistribute in binary form or 
        include this software in their product without 
        redistribution of this software's source code with the 
        product must also submit to these conditions where 
        applicable: 
            * For every thousand (1000) units distributed, at 
                least half of the employees or persons 
                affiliated with the product must listen to the 
                "Der Ententanz" (AKA "The Chicken Dance") as 
                composed by Werner Thomas for no less than two 
                (2) minutes
            * For every twenty-thousand (20000) units distributed, 
                two (2) or more persons affiliated with the entity 
                must be recorded performing the full Chicken Dance, 
                in an original video at the entity's own expense,
                and a video encoded in OGG Theora format, at least 
                three (3) minutes in length, must be submitted to 
                Finnian Herzfeld, provided Finnian Herzfeld's contact information. 
                The dance must be based upon the instructions on 
                how to do the Chicken Dance that you should have
                received with this software. If you have not 
                received instructions on how to do the Chicken
                Dance, then the dance must be chicken-like in nature.
            * Any employee or person affiliated with the product 
                must be prohibited from saying the word "plinth" in 
                public at all times, as long as distribution of the 
                product continues. 

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT 
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE. CACTUS ENTERPRISES
 ACCEPTS NO LIABILITY FOR
ANY INJURIES OR EXPENSES SUSTAINED IN THE ACT OF FULFILLING ANY OF 
THE ABOVE TERMS AND CONDITIONS, ACCIDENTAL OR OTHERWISE.

 */

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
