import javax.swing.*;
import java.awt.*;
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
    private JButton tutorial;
    private JLabel tutorialText;
    private JButton bestOfThreeButton;
    private JLabel PointsText1;
    private JLabel PointsText2;
    private JLabel bestOfThreeWinnerText;
    private int AiChoice;
    private String AiChoiceText;
    private final String Player1_Wins = "Player 1 wins this round!!";
    private final String Player1_Chose = "Player 1 chose";
    private final String rock = "rock";
    private final String paper = "paper";
    private final String scissors = "scissors";
    private final String itsADraw = "it's a draw.";
    private int GameMode;
    private String player1;
    private String player2;
    private int VsAiGameOutcome;
    private int VsPlayerGameOutcome;
    private int tutorialSteps;
    private int aiPoints;
    private int P1Points;
    private int P2Points;
    private int winPoints = 1;
    private boolean bestOfThree;
    public Main() {
        setContentPane(Game); // adds the game panel to the frame
        setBounds(0, 0, 1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors");
        initialize();
        ChooseGame.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        quitGameButton.addActionListener(_ -> {             //quit game button
            int input = JOptionPane.showConfirmDialog(null,"Confirm exiting program?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (input == JOptionPane.YES_OPTION) {
                dispose();
            }
        });
        vsAIButton.addActionListener(_ -> {                 //vs ai button
            GameMode = 0;                       // game mode 0 is vs Ai, 2 is vs another player
            P1SetVisible();
            MenuSetInvisible();
            if (bestOfThree) {                  //displays scores of each player if it's a bo3
                PointsText1.setVisible(true);
                PointsText2.setVisible(true);
            }
            setPlayerPoints();
            bestOfThreeButton.setVisible(false);
        });
        vsPlayerButton.addActionListener(_ -> {             //vs player button
            GameMode = 2;
            P1SetVisible();
            MenuSetInvisible();
            if (bestOfThree) {
                PointsText1.setVisible(true);
                PointsText2.setVisible(true);
            }
            setPlayerPoints();
            bestOfThreeButton.setVisible(false);
        });
        restartButton.addActionListener(_ -> initialize()); // restart button
        rockButton.addActionListener(_ -> {             //rock button for player 1
            winnerMessage.setVisible(false);
            if (GameMode == 0){                                 //check for game mode
                if (P1Points < winPoints && aiPoints < winPoints) {     //check for winning against AI
                player1 = rock;
                    if (AiChoice == 0) {
                    VsAiGameOutcome = 2;
                    } else if (AiChoice == 1) {
                    VsAiGameOutcome = 0;
                    aiPoints += 1;
                    setPlayerPoints();
                    } else {
                    VsAiGameOutcome = 1;
                    P1Points += 1;
                    setPlayerPoints();
                    }
                    displayVsAiOutcome();
                    displayBestOfThreeOutcome();
                    Ai_Guess();                                 // AI guesses after each round
                } else {
                    GameMode = -1;
            }
        } else if(GameMode == 2){               // for playing with another player
            player1 = rock;
            P1SetInvisible();
            P2SetVisible();
        }
        });
        paperButton.addActionListener(_ -> {            //player 1 paper button
            winnerMessage.setVisible(false);
            if (GameMode == 0){
                if (P1Points < winPoints && aiPoints < winPoints) {
                    player1 = paper;
                    if (AiChoice == 0) {
                        VsAiGameOutcome = 1;
                        P1Points += 1;
                    } else if (AiChoice == 1) {
                        VsAiGameOutcome = 2;
                    } else {
                        VsAiGameOutcome = 0;
                        aiPoints += 1;
                    }
                    setPlayerPoints();
                    displayVsAiOutcome();
                    displayBestOfThreeOutcome();
                    Ai_Guess();
                } else {
                    GameMode = -1;
                }
            } else if (GameMode == 2){
                player1 = paper;
                P1SetInvisible();
                P2SetVisible();
            }
        });
        scissorsButton.addActionListener(_ -> {         //player 1 scissors button
            winnerMessage.setVisible(false);
            if (GameMode == 0){
                if (P1Points < winPoints && aiPoints < winPoints) {
                    player1 = scissors;
                    if (AiChoice == 0) {
                        VsAiGameOutcome = 0;
                        aiPoints += 1;
                    } else if (AiChoice == 1) {
                        VsAiGameOutcome = 1;
                        P1Points += 1;
                    } else {
                        VsAiGameOutcome = 2;
                    }
                    setPlayerPoints();
                    displayVsAiOutcome();
                    displayBestOfThreeOutcome();
                    Ai_Guess();
                } else {
                    GameMode = -1;
                }
            } else if (GameMode == 2){
                player1 = scissors;
                P1SetInvisible();
                P2SetVisible();
            }
        });
        rockButton1.addActionListener(_ -> {   //player 2's rock button
            player2 = rock;
            if(GameMode == 2) {
                if (P1Points < winPoints && P2Points < winPoints) { //check for winning
                    if (player1.equals(paper)) {
                        VsPlayerGameOutcome = 0;
                        P1Points += 1;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 1;
                        P2Points +=1;
                    } else {
                        VsPlayerGameOutcome = 2;
                    }
                    if (bestOfThree) {                             //check for bo3
                        setPlayerPoints();
                        P1SetVisible();
                        P2SetInvisible();
                        displayVsPlayerOutcome();
                        displayBestOfThreeOutcome();
                    } else {
                        P2SetInvisible();
                    }
                    displayVsPlayerOutcome();
                } else {
                    GameMode = -1;
                }
            }
        });
        paperButton1.addActionListener(_ -> { // player 2's paper button
            player2 = paper;
            if(GameMode == 2) {
                if (P1Points < winPoints && P2Points < winPoints) {
                    if (player1.equals(paper)) {
                        VsPlayerGameOutcome = 2;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 0;
                        P1Points += 1;
                    } else {
                        VsPlayerGameOutcome = 1;
                        P2Points += 1;
                    }
                    if (bestOfThree) {
                        setPlayerPoints();
                        P1SetVisible();
                        P2SetInvisible();
                        displayVsPlayerOutcome();
                        displayBestOfThreeOutcome();
                    } else {
                        P2SetInvisible();
                    }
                    displayVsPlayerOutcome();
                } else {
                    GameMode = -1;
                }
            }
        });
        scissorsButton1.addActionListener(_ -> { // player 2's scissors button
            player2 = scissors;
            if (GameMode == 2) {
                if (P1Points < winPoints && P2Points < winPoints) {
                    if (player1.equals(rock)) {
                        VsPlayerGameOutcome = 0;
                        P1Points +=1;
                    } else if (player1.equals(scissors)) {
                        VsPlayerGameOutcome = 2;
                    } else {
                        VsPlayerGameOutcome = 1;
                        P2Points += 1;
                    }
                    if (bestOfThree) {
                        setPlayerPoints();
                        P1SetVisible();
                        P2SetInvisible();
                        displayVsPlayerOutcome();
                        displayBestOfThreeOutcome();
                    } else {
                        P2SetInvisible();
                    }
                    displayVsPlayerOutcome();
                } else {
                    GameMode = -1;
                }
            }
        });
        tutorial.addActionListener(_ -> {
            bestOfThreeButton.setVisible(false);
            P1SetInvisible();
            P2SetInvisible();
            winnerMessage.setVisible(false);
            tutorialText.setVisible(true);
            tutorial.setText("Next");
            tutorialText.setSize(105,61);
            tutorialText.setFont(new Font("Bahnschrift", Font.PLAIN, 24));
            tutorialSteps += 1;
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
        winnerMessage.setVisible(true);
        String ai_Chose = "Ai chose";
        String ai_Wins = "Ai wins this round.";
        switch (VsAiGameOutcome) {
            case 0 -> winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + ai_Wins);
            case 1 -> winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + Player1_Wins);
            case 2 -> winnerMessage.setText(ai_Chose + " " + AiChoiceText + ", " + Player1_Chose + " " +player1 + ", " + itsADraw);
        }
    }
    private void displayVsPlayerOutcome() { // 0 = player1 wins, 1 = player2 wins, 2 = draw
        winnerMessage.setVisible(true);
        String player2_Chose = "Player 2 chose";
        String player2_Wins = "Player 2 wins this round!!";
        switch (VsPlayerGameOutcome) {
            case 0 -> winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + Player1_Wins);
            case 1 -> winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + player2_Wins);
            case 2 -> winnerMessage.setText(Player1_Chose + " " + player1 + ", " + player2_Chose + " " +player2 + ", " + itsADraw);
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
            } else if (P1Points > aiPoints && P1Points == winPoints){
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Ai have " + aiPoints + " points, you have " + P1Points + " points, You won!!");
            }
        } else if (GameMode == 2 && bestOfThree) {
            if (P2Points > P1Points && P2Points == winPoints) {
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Player 2 have " + P2Points + " points, Player 1 have " + P1Points + " points, Player 2 won!!");
            } else if (P1Points > P2Points && P1Points == winPoints){
                bestOfThreeWinnerText.setVisible(true);
                bestOfThreeWinnerText.setText("Player 2 have " + P2Points + " points, Player 1 have " + P1Points + " points, Player 1 won!!");
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}