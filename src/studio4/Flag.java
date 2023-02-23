package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(216, 191, 216);
		StdDraw.filledRectangle(0.5,0.5, 0.5, 0.25);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.5, 0.5, 0.20);
		
		
		StdDraw.setPenColor(95,158,160);
		StdDraw.filledSquare(0.5, 0.5, 0.14);
	}
}