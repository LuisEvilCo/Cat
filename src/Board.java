
public class Board {
    int [][] board;
    String invalidPlace = "";
    public int empty = -1;
    private Judge moderator;
    public Board(){
        board = new int[3][3];
        for(int columns = 0 ; columns < board[0].length;columns++ ){
            for(int rows = 0 ; rows < board[columns].length; rows++){
                board[columns][rows] = empty;
            }
        }
        moderator = new Judge();
        //System.out.println("Dimension 1 " + board[0].length);
        display();
    }

    public void move(int value, int place){
        switch (place){
            case 1:{
                if(board[0][0] == empty){
                    board[0][0] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 2:{
                if(board[0][1] == empty){
                    board[0][1] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 3:{
                if(board[0][2] == empty){
                    board[0][2] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 4:{
                if(board[1][0] == empty){
                    board[1][0] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 5:{
                if(board[1][1] == empty){
                    board[1][1] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 6:{
                if(board[1][2] == empty){
                    board[1][2] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 7:{
                if(board[2][0] == empty){
                    board[2][0] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 8:{
                if(board[2][1] == empty){
                    board[2][1] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }

            case 9:{
                if(board[2][2] == empty){
                    board[2][2] = value;
                }else {
                    System.out.println(invalidPlace);
                }
                break;
            }
        }
        moderator.evaluate(this);
        display();
    }

    private void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void display(){
        /*for(int columns = 0; columns < board.length ; columns++){
            for(int rows = 0; rows < board[columns].length; rows++){
                System.out.print(board[columns][rows]);
            }
            System.out.println();
        }*/ //conventional way of doing
        System.out.println("Board");
        System.out.println();
        for(int[] x: board) //iterative way of doing it
        {
            for(int val: x) {
                switch (val){
                    case -1: {
                        System.out.print("-");
                        break;
                    }

                    case 0:{
                        System.out.print("O");
                        break;
                    }

                    case 1:{
                        System.out.print("X");
                        break;
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
