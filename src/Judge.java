
public class Judge {
    private boolean gameOver = false;

    public Judge(){

    }

    private void winner(int x){
        switch (x){
            case 0:{
                System.out.println("El ganador fue el jugador 0");
                break;
            }

            case 1:{
                System.out.println("El ganador fue el jugador X");
                break;
            }
        }
    }

    public boolean evaluate(Board game){
        int criterion = game.empty;
        if( (game.board[0][0] == game.board[0][1]) && (game.board[0][0] == game.board[0][2] && (game.board[0][0] != criterion ))){
            winner(game.board[0][0]);
            return true;
        }

        if( (game.board[1][0] == game.board[1][1]) && (game.board[1][0] == game.board[1][2]) && (game.board[1][0] != criterion) ){
            winner(game.board[1][0]);
            return true;
        }

        if( (game.board[2][0] == game.board[2][1]) && (game.board[2][0] == game.board[2][2] && (game.board[2][0] != criterion))){
            winner(game.board[2][0]);
            return true;
        }

        //TODO: complete conditions for game over
        return gameOver;
    }
}
