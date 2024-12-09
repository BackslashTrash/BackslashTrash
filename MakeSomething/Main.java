import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Main extends JFrame implements ActionListener {
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
    private JButton tutorial;
    private JLabel tutorialText;
    private JButton bestOfThreeButton;
    private JLabel PointsText1;
    private JLabel PointsText2;
    private JLabel bestOfThreeWinnerText;
    private String AiChoiceText;
    private final String rock = "rock";
    private final String paper = "paper";
    private final String scissors = "scissors";
    private int GameMode;
    private String player1;
    private String player2;
    private int tutorialSteps;
    private int aiPoints;
    private int P1Points;
    private int P2Points;
    private int winPoints = 1;
    private boolean bestOfThree;
    private String winner;

    public Main() {
        setContentPane(Game); // adds the game panel to the frame
        setBounds(0, 0, 1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors");
        initialize();
        ChooseGame.setFont(new Font("Bahnschrift", Font.PLAIN, 16));

        quitGameButton.addActionListener(this);
        vsAIButton.addActionListener(this);
        vsPlayerButton.addActionListener(this);
        restartButton.addActionListener(_ -> initialize()); // restart button
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);
        rockButton1.addActionListener(this);
        paperButton1.addActionListener(this);
        scissorsButton1.addActionListener(this);
        tutorial.addActionListener(_ -> {
            bestOfThreeButton.setVisible(false);
            P1SetInvisible();
            P2SetInvisible();
            winnerMessage.setVisible(false);
            tutorialText.setVisible(true);
            tutorial.setText("Next");
            tutorialText.setSize(105,61);
            tutorialText.setFont(new Font("Bahnschrift", Font.PLAIN, 24));
            tutorialSteps++;
            MenuSetInvisible();
            switch (tutorialSteps) {        //tutorial
                case 1 -> tutorialText.setText("There are 3 options in rock paper scissors");
                case 2 -> tutorialText.setText("Rock beats scissors, scissors beats paper, and paper beats rock.");
                case 3 -> tutorialText.setText("If both player played the same, it's a draw.");
                case 4 -> tutorialText.setText("Click on 'Best of one' button to change to best of three");
                case 5 -> initialize();
            }
        });
        bestOfThreeButton.addActionListener(_ -> {  //allows the player to play best of 3
            if (!bestOfThree) {
                bestOfThreeButton.setText("Best of Three");             //changes the text based on if it's bo3 or bo1
                bestOfThree = true;
                winPoints = 2;
            } else {
                bestOfThreeButton.setText("Best of One");
                bestOfThree = false;
                winPoints = 1;
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
        tutorial.setText("How to play");
        tutorialText.setVisible(false);
        tutorialSteps = 0;
        bestOfThreeButton.setText("Best of One");
        bestOfThreeButton.setVisible(true);
        bestOfThree = false;
        aiPoints = 0;
        P1Points = 0;
        P2Points = 0;
        PointsText1.setVisible(false);
        PointsText2.setVisible(false);
        winPoints = 1;
        bestOfThreeWinnerText.setVisible(false);
        winner = "";
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
        int aiChoice = rand.nextInt(3);    // 0 = rock, 1 = paper, 2 = scissors
        if (aiChoice == 0) {
            AiChoiceText = "rock";
        } else if (aiChoice == 1) {
            AiChoiceText = "paper";
        } else {
            AiChoiceText = "scissors";
        }
    }
    private void setPlayerPoints() {            //displays each player's scores
        if (GameMode == 0){
            PointsText1.setText("Ai's points: " + aiPoints);
            PointsText2.setText("Your points:" + P1Points);
        } else if (GameMode == 2) {
            PointsText1.setText("Player 1's points: " + P1Points);
            PointsText2.setText("Player 2's points: " + P2Points);
        }
    }
    private void displayBestOfThreeOutcome() {              //shows the final outcome of the bo3
        if (GameMode == 0 && bestOfThree) {
            if (aiPoints > P1Points && aiPoints == winPoints) {
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Ai have " + aiPoints + " points, you have " + P1Points + " points, Ai won.");
                GameMode = -1;
            } else if (P1Points > aiPoints && P1Points == winPoints){
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Ai have " + aiPoints + " points, you have " + P1Points + " points, You won!!");
                GameMode = -1;
            }
        } else if (GameMode == 2 && bestOfThree) {
            if (P2Points > P1Points && P2Points == winPoints) {
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Player 2 have " + P2Points + " points, Player 1 have " + P1Points + " points, Player 2 won!!");
                GameMode = -1;
            } else if (P1Points > P2Points && P1Points == winPoints){
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Player 2 have " + P2Points + " points, Player 1 have " + P1Points + " points, Player 1 won!!");
                GameMode = -1;
            }
        }
    }
    public void gamemodeChose(){
        P1SetVisible();
        MenuSetInvisible();
        if (bestOfThree) {                  //displays scores of each player if it's a bo3
            PointsText1.setVisible(true);
            PointsText2.setVisible(true);
        }
        setPlayerPoints();
        bestOfThreeButton.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int didfirstplayerwin;
        if (e.getSource() == quitGameButton) {
            int input = JOptionPane.showConfirmDialog(null,"Confirm exiting program?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (input == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
        if (e.getSource() == vsAIButton) {
            GameMode = 0;                       // game mode 0 is vs Ai, 2 is vs another player
            gamemodeChose();
        }
        if (e.getSource() == vsPlayerButton) {
            GameMode = 2;
            gamemodeChose();
        }
        if (e.getSource() == rockButton) {
            player1 = rock;
        }
        if (e.getSource() == paperButton) {
            player1 = paper;
        }
        if (e.getSource() == scissorsButton) {
            player1 = scissors;
        }
        if (e.getSource() == rockButton1) {
            player2 = rock;
        }
        if (e.getSource() == paperButton1) {
            player2 = paper;
        }
        if (e.getSource() == scissorsButton1) {
            player2 = scissors;
        }
        String p1 = null, p2 = null, gameresult = null;
        if (GameMode == 0) {
            p1 = "Ai ";
            p2 = "Player 1 ";
        } else if (GameMode == 2) {
            p1 = "Player 1 ";
            p2 = "Player 2 ";
        }
        if (player1 != null && GameMode != -1) {
            Ai_Guess();
            if (P1Points < winPoints && aiPoints < winPoints && GameMode == 0) {
                winnerMessage.setVisible(true);
                didfirstplayerwin = didFirstPlayerWin(AiChoiceText,player1);
                if (didfirstplayerwin == 0) {
                    gameresult = " wins this round."; winner = "Ai"; aiPoints +=1;
                } else if (didfirstplayerwin == 1) {
                    gameresult = " wins this round."; winner = "Player 1"; P1Points +=1;
                } else if (didfirstplayerwin == 2){
                    winner = ""; gameresult = "it's a tie.";
                }
                setPlayerPoints();
                if (GameMode == 0) {
                winnerMessage.setText(p1 + "chose " + AiChoiceText + ", " + p2 + "chose " + player1 + ", " + winner + gameresult);
                displayBestOfThreeOutcome();
                }
                if (!bestOfThree) {
                    GameMode = -1;
                }
            } else if (GameMode == 2 && bestOfThree){
                winnerMessage.setVisible(false);
                P1SetInvisible();
                P2SetVisible();
            }
        }
        if (player2 != null ) {
            if (P2Points < winPoints && P1Points < winPoints && GameMode == 2) {
                winnerMessage.setVisible(true);
                didfirstplayerwin = didFirstPlayerWin(player1,player2);
                if (didfirstplayerwin == 0) {
                    gameresult = " wins this round."; winner = "Player 1"; P1Points +=1;
                } else if (didfirstplayerwin == 1) {
                    gameresult = " wins this round."; winner = "Player 2"; P2Points +=1;
                } else if (didfirstplayerwin == 2){
                    winner = ""; gameresult = "it's a tie.";
                }
                setPlayerPoints();
                if (GameMode == 2) {
                    P2SetInvisible();
                    P1SetVisible();
                    winnerMessage.setText(p1 + "chose " + player1 + ", " + p2 + "chose " + player2 + ", " + winner + gameresult);
                }
            }
            player1 = null;
            player2 = null;
            displayBestOfThreeOutcome();
        }
    }
    public int didFirstPlayerWin(String firstchoice, String secondchoice) {
        if ((firstchoice.equals(rock) && secondchoice.equals(scissors)) ||
                (firstchoice.equals(paper) && secondchoice.equals(rock)) ||
                (firstchoice.equals(scissors) && secondchoice.equals(paper))) {
            return 0;
        } else if (firstchoice.equals(secondchoice)){
            return 2;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}