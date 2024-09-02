package TicTacToe;

import java.io.IOException;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe_GUI {


    static JButton button_1 = new JButton();
    static JButton button_2 = new JButton();
    static JButton button_3 = new JButton();
    static JButton button_4 = new JButton();
    static JButton button_5 = new JButton();
    static JButton button_6 = new JButton();
    static JButton button_7 = new JButton();
    static JButton button_8 = new JButton();
    static JButton button_9 = new JButton();

    static JButton restart = new JButton("Restart");

    static JLabel win = new JLabel(" ");

    
    public static void main(String args[])
    {

        // JButton button_1 = new JButton();
        // JButton button_2 = new JButton();
        // JButton button_3 = new JButton();
        // JButton button_4 = new JButton();
        // JButton button_5 = new JButton();
        // JButton button_6 = new JButton();
        // JButton button_7 = new JButton();
        // JButton button_8 = new JButton();
        // JButton button_9 = new JButton();

        // JButton restart = new JButton("Restart");
        Font font = new Font("Arial", Font.PLAIN, 50);
        
        // Creating Window in GUI
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(450,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        frame.setVisible(true);

        //Creating Board by Buttons
        button_1.setBounds(50,50,100,100);
        button_1.setFont(font);
        panel.add(button_1);

        button_2.setBounds(175,50,100,100);
        button_2.setFont(font);
        panel.add(button_2);

        button_3.setBounds(175+125,50,100,100);
        button_3.setFont(font);
        panel.add(button_3);

        button_4.setBounds(50,50+125,100,100);
        button_4.setFont(font);
        panel.add(button_4);

        button_5.setBounds(175,50+125,100,100);
        button_5.setFont(font);
        panel.add(button_5);

        button_6.setBounds(175+125,50+125,100,100);
        button_6.setFont(font);
        panel.add(button_6);

        button_7.setBounds(50,50+125+125,100,100);
        button_7.setFont(font);
        panel.add(button_7);

        button_8.setBounds(175,50+125+125,100,100);
        button_8.setFont(font);
        panel.add(button_8);

        button_9.setBounds(175+125,50+125+125,100,100);
        button_9.setFont(font);
        panel.add(button_9);

        restart.setBounds(175,50+125+125+125,100,50);
        panel.add(restart);

        win.setBounds(175,50+125+125+125+125,400,50);
        win.setFont(font);
        panel.add(win);

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
        // Scanner sc = new Scanner(System.in);
        // final int[] nn = {0};
        final int[] nn = new int[1];
        while(!gameOver)
        {
            // printBoard(board);
            // System.out.print("Click a button");
            
            int row = 0,col = 0;
            button_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("1");
                    nn[0] = 1;
                    button_1.setText(board[0][0] + "");
                    // printBoard(board);
                }
            });
            button_2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("2");
                    nn[0] = 2;
                    button_2.setText(board[0][1] + "");
                    // printBoard(board);
                }
            });
            button_3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("1");
                    nn[0] = 3;
                    button_3.setText(board[0][2] + "");
                    // printBoard(board);
                }
            });
            button_4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("2");
                    nn[0] = 4;
                    button_4.setText(board[1][0] + "");
                    // printBoard(board);
                }
            });
            button_5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("1");
                    nn[0] = 5;
                    button_5.setText(board[1][1] + "");
                    // printBoard(board);
                }
            });
            button_6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("2");
                    nn[0] = 6;
                    button_6.setText(board[1][2] + "");
                    // printBoard(board);
                }
            });
            button_7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("1");
                    nn[0] = 7;
                    button_7.setText(board[2][0] + "");
                    // printBoard(board);
                }
            });
            button_8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("2");
                    nn[0] = 8;
                    button_8.setText(board[2][1] + "");
                    // printBoard(board);
                }
            });
            button_9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // System.out.println("1");
                    nn[0] = 9;
                    button_9.setText(board[2][2] + "");
                    // printBoard(board);
                }
            });
            restart.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    restartt();
                }
            });

            // int n = sc.nextInt();
            // int row = sc.nextInt();
            // int col = sc.nextInt();
        
            int n = nn[0];

            // System.out.println("This is the nn " + n);
            if(n==0){
                continue;
            }

            else if(n<=3)
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
            }


            if(board[row][col] == '|')
            {
                board[row][col] = player;
                gameOver = haveWon(player, board);
                
                if(gameOver)
                {
                    // System.out.println("Player " + player + " Won! ");
                    break;
                }else{
                    player = player == 'X' ? 'O' : 'X';
                }
            }else{
                // System.out.println("Invalid move try Again !!");
                continue;
            }
            
            tie = isFull(board);
            if(tie)
            {
                // System.out.println("Tie !");
                break;
            }
        }

        if (gameOver) {
            // System.out.println("Player " + player + " Won! ");
            win.setText(player + " Won !");
        }
        if(tie)
        {
            // System.out.println("Tie !");
            win.setText("Tie !");
        }

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

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if (button_1.getModel().isArmed()) {
    //         System.out.println("1 Button is pressed");
    //     }
    //     if (button_2.getModel().isArmed()) {
    //         System.out.println("2 Button is pressed");
    //     }
    // }
    private static void restartt() {

        try {
            Runtime.getRuntime().exec("javac " + "TicTacToe/TicTacToe_GUI.java");
            Runtime.getRuntime().exec("java " + "TicTacToe/TicTacToe_GUI");

            System.exit(0);

        } catch (IOException e) {

            System.err.println("Error restarting Java program: " + e.getMessage());

        }

    }
}
