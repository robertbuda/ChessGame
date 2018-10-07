package com.company;

public class Queen extends Piece {

    int column = 1;
    int row = 1;

    @Override
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)){
            return false;
        }
        if (newPosition.column == this.column || newPosition.row == this.row || Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)){
            return true;
        } else {
            return false;
        }
    }


}
