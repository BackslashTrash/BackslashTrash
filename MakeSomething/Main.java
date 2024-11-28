import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Main extends JFrame{
    private JButton vsAIButton;
    private JButton vsPlayerButton;
    private JButton quitGameButton;
    private JPanel Game;
    private JButton paperButton;
    private JButton rockButton;
    private JButton scissorsButton;
    private JLabel ChooseGame;
    private JLabel P1Choice;
    private JLabel P2Choice;
    private JButton paperButton1;
    private JButton rockButton1;
    private JButton scissorsButton1;
    private JButton restartButton;
    private JLabel winnerMessage;
    private int AiChoice;
    private String AiChoiceText;
    private final String Player1_Wins = "Player1 wins!!";
    private final String Player1_Chose = "Player1 chose";
    private final String rock = "rock";
    private final String paper = "paper";
    private final String scissors = "scissors";
    private final String itsADraw = "it's a draw.";
    private int GameMode;
    private String player1;
    private String player2;
    private int VsAiGameOutcome;
    private int VsPlayerGameOutcome;
    public Main() {
        setContentPane(Game);
        setBounds(0, 0, 1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors");
        initialize();
        quitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Confirm exiting program?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (input == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        vsAIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameMode = 0;
                P1SetVisible();
                MenuSetInvisible();
            }
        });
        vsPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameMode = 2;
                P1SetVisible();
                MenuSetInvisible();
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            initialize();
            }
        });
        rockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (GameMode == 0){
                player1 = rock;
                if (AiChoice == 0) {
                    VsAiGameOutcome = 2;
                } else if (AiChoice == 1) {
                    VsAiGameOutcome = 0;
                } else {
                    VsAiGameOutcome = 1;
                }
                displayVsAiOutcome();
                GameMode = -1;
            } else if(GameMode == 2){
                player1 = rock;
                P1SetInvisible();
                P2SetVisible();
            }
            }
        });
        paperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GameMode == 0){
                    player1 = paper;
                    if (AiChoice == 0) {
                        VsAiGameOutcome = 1;
                    } else if (AiChoice == 1) {
                        VsAiGameOutcome = 2;
                    } else {
                        VsAiGameOutcome = 0;
                    }
                    displayVsAiOutcome();
                    GameMode = -1;
                } else if (GameMode == 2){
                    player1 = paper;
                    P1SetInvisible();
                    P2SetVisible();
                }
            }
        });
        scissorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GameMode == 0){
                    player1 = scissors;
                    if (AiChoice == 0) {
                        VsAiGameOutcome = 0;
                    } else if (AiChoice == 1) {
                        VsAiGameOutcome = 1;
                    } else {
                        VsAiGameOutcome = 2;
                    }
                    displayVsAiOutcome();
                    GameMode = -1;
                } else if (GameMode == 2){
                    player1 = scissors;
                    P1SetInvisible();
                    P2SetVisible();
                }
            }
        });
        rockButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2 = rock;
                if(GameMode == 2) {
                    if (player1.equals(paper)) {
                        VsPlayerGameOutcome = 0;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 1;
                    } else {
                        VsPlayerGameOutcome = 2;
                    }
                    displayVsPlayerOutcome();
                    GameMode = -1;
                }
            }
        });
        paperButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2 = paper;
                if(GameMode == 2) {
                    if (player1.equals(paper)) {
                        VsPlayerGameOutcome = 2;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 0;
                    } else {
                        VsPlayerGameOutcome = 1;
                    }
                    displayVsPlayerOutcome();
                    GameMode = -1;
                }
            }
        });
        scissorsButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2 = scissors;
                if (GameMode == 2) {
                    if (player1.equals(rock)) {
                        VsPlayerGameOutcome = 0;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 2;
                    } else {
                        VsPlayerGameOutcome = 1;
                    }
                    displayVsPlayerOutcome();
                    GameMode = -1;
                }
            }
        });
    }
    private void initialize() {
        P1SetInvisible();
        P2SetInvisible();
        restartButton.setVisible(false);
        ChooseGame.setVisible(true);
        vsPlayerButton.setVisible(true);
        vsAIButton.setVisible(true);
        Ai_Guess();
        GameMode = -1;
        player1 = null;
        player2 = null;
        winnerMessage.setText(null);
    }
    private void P1SetVisible() {
        rockButton.setVisible(true);
        paperButton.setVisible(true);
        scissorsButton.setVisible(true);
        P1Choice.setVisible(true);
        restartButton.setVisible(true);
    }
    private void P2SetVisible() {
        rockButton1.setVisible(true);
        paperButton1.setVisible(true);
        scissorsButton1.setVisible(true);
        P2Choice.setVisible(true);
    }
    private void P1SetInvisible() {
        rockButton.setVisible(false);
        paperButton.setVisible(false);
        scissorsButton.setVisible(false);
        P1Choice.setVisible(false);
    }
    private void P2SetInvisible() {
        rockButton1.setVisible(false);
        paperButton1.setVisible(false);
        scissorsButton1.setVisible(false);
        P2Choice.setVisible(false);
    }
    private void MenuSetInvisible() {
        ChooseGame.setVisible(false);
        vsAIButton.setVisible(false);
        vsPlayerButton.setVisible(false);
    }
    private void Ai_Guess() {
        Random rand = new Random();
        AiChoice = rand.nextInt(3);    // 0 = rock, 1 = paper, 2 = scissors
        if (AiChoice == 0) {
            AiChoiceText = "rock";
        } else if (AiChoice == 1) {
            AiChoiceText = "paper";
        } else {
            AiChoiceText = "scissors";
        }
    }
    private void displayVsAiOutcome() { // 0 = ai wins, 1 = player1 wins, 2 = draw
        String ai_Chose = "Ai chose";
        if (VsAiGameOutcome == 0) {
            String ai_Wins = "Ai wins.";
            winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + ai_Wins);
        } else if (VsAiGameOutcome == 1) {
            winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + Player1_Wins);
        } else {
            winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + itsADraw);
        }
    }
    private void displayVsPlayerOutcome() { // 0 = player1 wins, 1 = player2 wins, 2 = draw
        String player2_Chose = "Player2 chose";
        if (VsPlayerGameOutcome == 0) {
            winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + Player1_Wins);
        } else if (VsPlayerGameOutcome == 1) {
            String player2_Wins = "Player2 wins!!";
            winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + player2_Wins);
        } else {
            winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + itsADraw);
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}