package petSim;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Pet extends JFrame implements ActionListener {
    private int health;
    private int hunger;
    private int tiredness;
    private int speed;
    private int attack;
    private String name;
    private String type;
    private int tutorialSteps;
    private int foodcounter = 0;
    private int restcounter =0;
    private int playcounter = 0;
    private JButton petChoice1;
    private JButton petChoice2;
    private JButton petChoice3;
    private JButton petChoice4;
    private JButton TutorialYes;
    private JButton TutorialNo;
    private JButton Exit;
    private JButton StartGame;
    private JButton Feed;
    private JButton Play;
    private JButton Rest;
    private Font regular;
    private JLabel Title;
    private JLabel TutorialText;
    private JLabel bg;
    private JLabel petLabel;
    private JLabel statsText;
    private final ImageIcon backgroundImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("background.jpg")));
    private ImageIcon petimage;
    private JPanel Main;
    public Pet() {
        setTitle("Random pet game");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        setSize(1600,810);
        setLayout(null);
        setVisible(true);
        this.health = 12;
        this.hunger = 12;
        this.tiredness = 0;
        this.speed = 12;
        this.attack = 0;
        this.name = null;
        this.type = null;
    }
    public void init() {
        tutorialSteps = 0;
        bg = new JLabel();
        bg.setSize(1600,810);
        bg.setIcon(backgroundImage);
        add(bg);
        Main = new JPanel();
        Main.setBounds(300,100,1000,125);
        Main.setLayout(new FlowLayout(FlowLayout.CENTER, 20,10));
        Main.setBackground(Color.decode("#5b4070"));
        regular = new Font("Futura", Font.PLAIN, 20);
        Title = new JLabel("Pet Game V 0.0.1 pre-Alpha");
        Title.setForeground(new Color(255,255,255, 255));
        Title.setFont(regular);
        Title.setSize(100,25);
        statsText = new JLabel();
        statsText.setFont(regular);
        bg.add(statsText);
        statsText.setVisible(false);
        TutorialText = new JLabel("Welcome to the game, would you like a tutorial?");
        TutorialText.setSize(100,25);
        TutorialText.setFont(regular);
        TutorialText.setForeground(Color.white);
        TutorialYes = new JButton("Yes");
        TutorialNo = new JButton("No");
        Exit = new JButton("Quit");
        Exit.setBounds(1400,25,75,30);
        TutorialYes.addActionListener(this);
        TutorialNo.addActionListener(this);
        Exit.addActionListener(this);
        StartGame = new JButton("Start");
        StartGame.addActionListener(this);
        StartGame.setVisible(false);
        bg.add(Exit);
        Main.add(Title);
        Main.add(TutorialText);
        Main.add(TutorialYes);
        Main.add(TutorialNo);
        petChoice1 = new JButton("Northern fulmar");
        petChoice2 = new JButton("Red-tailed hawk");
        petChoice3 = new JButton("Chinstrap penguin");
        petChoice4 = new JButton("Atlantic puffin");
        petChoice1.addActionListener(this);
        petChoice2.addActionListener(this);
        petChoice3.addActionListener(this);
        petChoice4.addActionListener(this);
        Main.add(petChoice1);
        Main.add(petChoice2);
        Main.add(petChoice3);
        Main.add(petChoice4);
        Feed = new JButton("Feed");
        Play = new JButton("Play");
        Rest = new JButton("Rest");
        Feed.addActionListener(this);
        Play.addActionListener(this);
        Rest.addActionListener(this);
        Feed.setBounds(25,400,75,30);
        Play.setBounds(25,475,75,30);
        Rest.setBounds(25,550,75,30);
        bg.add(Feed);
        bg.add(Play);
        bg.add(Rest);
        Feed.setVisible(false);
        Play.setVisible(false);
        Rest.setVisible(false);
        yeetMa();
        bg.add(Main);
    }
    private void menu(){
        tutorialSteps = 0;
        TutorialYes.setText("Tutorial");
        TutorialYes.setVisible(true);
        TutorialNo.setVisible(false);
        TutorialText.setVisible(false);
        Title.setVisible(true);
        Main.add(StartGame);
        StartGame.setVisible(true);
        yeetMa();
    }
    private void fpr(){
        Feed.setVisible(true);
        Play.setVisible(true);
        Rest.setVisible(true);
    }
    private void choosePet(){
        Title.setVisible(false);
        TutorialText.setVisible(true);
        TutorialText.setText("Choose your pet to start the game:");
        TutorialYes.setVisible(false);
        petChoice1.setVisible(true);
        petChoice2.setVisible(true);
        petChoice3.setVisible(true);
        petChoice4.setVisible(true);
    }
    private void setPetStats(int health, int speed, int attack, String type) {
        this.attack = attack;
        this.health = health;
        this.hunger = 0;
        this.tiredness = 0;
        this.speed = speed;
        this.type = type;
    }
    private void yeetMa() {
        petChoice1.setVisible(false);
        petChoice2.setVisible(false);
        petChoice3.setVisible(false);
        petChoice4.setVisible(false);
    }
    private void startGame() {
        yeetMa();
        this.name = JOptionPane.showInputDialog(null, "Enter a name for your pet:", "Set name");
        Main.setVisible(false);
        updateStats();
    }
    private void updateStats() {
        statsText.setBounds(75, 25, 400,400);
        statsText.setForeground(Color.white);
        statsText.setText(
                "<html>Health: " + health +
                        "<br>Hunger: " + hunger +
                        "<br>Tiredness: " + tiredness +
                        "<br>Speed: " + speed +
                        "<br>Attack: " + attack +
                        "<br>Type: " + type +
                        "<br>Name: " + name
        );
        statsText.setVisible(true);
    }
    private void detectHealth() {
        if (health < 1) {
            JOptionPane.showMessageDialog(null,"Womp womp","Your pet died",JOptionPane.WARNING_MESSAGE);
            dispose();
        }
    }
    private void makeLabel(){
        petLabel = new JLabel();
        petLabel.setSize(750,450);
        Image img = petimage.getImage();
        Image newImage = img.getScaledInstance(petLabel.getWidth(),petLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Final = new ImageIcon(newImage);
        petLabel.setIcon(Final);
        petLabel.setLocation(500,-1);
        bg.add(petLabel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Exit) {
            int input = JOptionPane.showConfirmDialog(null,"Confirm exiting program?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (input == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
        if (e.getSource() == TutorialYes) {
            StartGame.setVisible(false);
            TutorialNo.setVisible(false);
            Title.setVisible(false);
            TutorialText.setVisible(true);
            TutorialYes.setText("Next");
            tutorialSteps++;
            switch (tutorialSteps) {
                case 1 -> TutorialText.setText("Choose your pet to start");
                case 2 -> TutorialText.setText("Your pet have stats such as health, hunger tiredness, etc.");
                case 3 -> TutorialText.setText("There are various activities you can do to increase your pet's stats");
                case 4 -> TutorialText.setText("If your pet's health is below zero, the game is over");
                default -> {
                    tutorialSteps = 0;
                    menu();
                }
            }
        }
        if (e.getSource() == TutorialNo) {
            menu();
        }
        if (e.getSource() == StartGame) {
            StartGame.setVisible(false);
            Main.remove(TutorialYes);
            bg.add(TutorialYes);
            TutorialYes.setText("Tutorial");
            TutorialYes.setBounds(1300,25,75,30);
            TutorialYes.setVisible(true);
            choosePet();
        }
        if (e.getSource() == petChoice1) {
            setPetStats(12, 10,40,"Northern Fulmar");
            fpr();
            startGame();
            petimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("northernfulmar.png")));
            makeLabel();
        }
        if (e.getSource() == petChoice2) {
            setPetStats(12, 39,12,"Red-tailed hawk");
            fpr();
            startGame();
            petimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("redtailedhawk.jpg")));
            makeLabel();
        }
        if (e.getSource() == petChoice3) {
            setPetStats(37, 10,20,"Chinstrap penguin");
            fpr();
            startGame();
            petimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("chinstrappenguin.png")));
            makeLabel();
        }
        if (e.getSource() == petChoice4) {
            setPetStats(15, 20,30, "Atlantic puffin");
            fpr();
            startGame();
            petimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("atlanticpuffin.png")));
            makeLabel();
        }
        if (e.getSource() == Feed) {
            foodcounter++;
            if (foodcounter > 4 ) {
                foodcounter =0;
                health++;
            }
            if (hunger > 0) {
                hunger--;
            }
            updateStats();
            detectHealth();
        }
        if (e.getSource() == Play) {
            playcounter++;
            hunger++;
            tiredness++;
            if (playcounter > 5) {
                playcounter = 0;
                speed ++;
            }
            if(tiredness >5 || hunger >3)  {
                health--;
            }
            updateStats();
            detectHealth();
        }
        if (e.getSource() == Rest) {
            restcounter++;
            if (restcounter > 5) {
                restcounter=0;
                attack++;
            }
            if (tiredness > 0) {
                tiredness--;
            }
            updateStats();
            detectHealth();
        }
    }
    public static void main(String[] args) {
        new Pet();
    }
}