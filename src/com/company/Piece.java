package com.company;

public class Piece {

    Position position;
    Game game = new Game();

    boolean isValidMove(Position newPosition){
        if (newPosition.row > 0 && newPosition.column > 0 && newPosition.row < game.board.length
                && newPosition.column < game.board.length){
            return true;
        } else {
            return false;
        }
    }
}
