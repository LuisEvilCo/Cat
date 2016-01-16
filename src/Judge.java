
public class Judge {
    private boolean gameOver = false;
    private String playerO = "El ganador fue el jugador 0";
    private String playerX = "El ganador fue el jugador X";
    private String tie = "No hubo ganador";
    private int draw = 3;
    private int placesInBoard = 9;

    public Judge(){

    }

    private boolean winner(int x){
        switch (x){
            case 0:{
                System.out.println(playerO);
                return true; // no need for "break;" because return statement.
            }

            case 1:{
                System.out.println(playerX);
                return true; // no need for "break;" because return statement.
            }

            default:{
                System.out.println(tie);
                break;
            }
        }
        return true;
    }

    public boolean evaluate(Board game){
        int count = 0;
        int criterion = game.empty;
        if( (game.board[0][0] == game.board[0][1]) && (game.board[0][0] == game.board[0][2] && (game.board[0][0] != criterion ))){
            return winner(game.board[0][0]);
        }

        if( (game.board[1][0] == game.board[1][1]) && (game.board[1][0] == game.board[1][2]) && (game.board[1][0] != criterion) ){
            return winner(game.board[1][0]);
        }

        if( (game.board[2][0] == game.board[2][1]) && (game.board[2][0] == game.board[2][2] && (game.board[2][0] != criterion))){
            return winner(game.board[2][0]);
        }

        if( (game.board[0][0] == game.board[1][0]) && (game.board[0][0] == game.board[1][2]) && (game.board[0][0] != criterion)){
            return winner(game.board[2][0]);
        }

        if( (game.board[0][1] == game.board[1][1]) && (game.board[0][1] == game.board[2][1]) && (game.board[0][1] != criterion)){
            return winner(game.board[0][1]);
        }

        if( (game.board[0][2] == game.board[1][2]) && (game.board[0][2] == game.board[2][2]) && (game.board[0][2] != criterion)){
            return winner(game.board[0][2]);
        }

        if( (game.board[0][0] == game.board[1][1]) && (game.board[0][0] == game.board[2][2]) && (game.board[0][0] != criterion)){
            return winner(game.board[0][0]);
        }

        if( (game.board[0][2] == game.board[1][1]) && (game.board[0][2] == game.board[2][0]) && (game.board[0][2] != criterion)){
            return winner(game.board[0][2]);
        }

        for(int[] x : game.board){
            for(int val : x){
                if(val != criterion){
                    count++;
                }
                if(count == placesInBoard){
                    return winner(draw);
                }
            }
        }

        return gameOver;
    }
}
