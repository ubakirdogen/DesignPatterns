package com.designpatterns.adapter;

public class AdapterTestDrive {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5.8);
        RoundPeg roundPeg = new RoundPeg(4);
        SquarePegAdapter adaptedSquare1 = new SquarePegAdapter(new SquarePeg(8));
        SquarePegAdapter adaptedSquare2 = new SquarePegAdapter(new SquarePeg(10));

        System.out.println(roundHole.fits(adaptedSquare1));
        System.out.println(roundHole.fits(adaptedSquare2));
    }
}
