package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[])
    {
        // Creating Window in GUI

        // JFrame frame = new JFrame();
        // JPanel panel = new JPanel();
        // frame.setSize(500,500);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(panel);
        // panel.setLayout(null);
        // frame.setVisible(true);

        // Board code
        char[][] board = new char[3][3];
        for(int row = 0; row<3;row++)
        {
            for(int col = 0;col<3;col++)
            {
                board[row][col] = '|';
            }
        }


        char player = 'X';
        boolean gameOver = false;
        boolean tie = false;
        try (Scanner sc = new Scanner(System.in)) {
            while(!gameOver)
            {
                printBoard(board);
                System.out.print("Player "+ player + " Choose Box: ");
                int n = sc.nextInt();
                // int row = sc.nextInt();
                // int col = sc.nextInt();
                int row = 0,col = 0;
                if(n<=3)
                {
                    row = 0;
                    col = n-1;
                }else if(n>3 && n<=6)
                {
                    row = 1;
                    col = n-4;
                }else if(n>6 && n<=9)
                {
                    row = 2;
                    col = n-7;
                }else{
                    System.out.println("Invalid No. ");
                }

                

                if(board[row][col] == '|')
                {
                    board[row][col] = player;
                    gameOver = haveWon(player, board);
                    
                    if(gameOver)
                    {
                        System.out.println("Player " + player + " Won! ");
                    }else{
                        player = player == 'X' ? 'O' : 'X';
                    }
                }else{
                    System.out.println("Invalid move try Again !!");
                }
                
                tie = isFull(board);
                if(tie)
                {
                    System.out.println("Tie !");
                    break;
                }
            }
        }

        printBoard(board);

    }

    public static boolean isFull(char[][] board)
    {
        boolean flag = true;
        for( int i = 0;i<3;i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                if(board[i][j] == '|')
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;

    }

    public static boolean haveWon(char player, char[][] board)
    {
        for( int row = 0; row<3;row++)
        {
            if (board[row][0]==player && board[row][1]==player && board[row][2]==player) {
                return true;
            }
        }

        for( int col = 0; col<3;col++)
        {
            if (board[0][col]==player && board[1][col]==player && board[2][col]==player) {
                return true;
            }
        }
        if (board[0][0]==player && board[1][1]==player && board[2][2]==player) {
            return true;
        }
        if (board[0][2]==player && board[1][1]==player && board[2][0]==player) {
            return true;
        }
        

        return false;
    }

    public static void printBoard(char[][] board)
    {

        for(int row = 0; row<3;row++)
        {
            for(int col = 0;col<3;col++)
            {
                System.out.print(" " +board[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
