import javax.swing.JOptionPane;

public class PlatformA3 {
    public static void main(String[] args) {
        Soccerplayer.setsTotalPlayer(0);
        Soccerplayer jonathan =  new Soccerplayer();
        System.out.println(jonathan.toString());

        Soccerplayer jeff = new Soccerplayer("Forward");
        System.out.println(jeff.toString());

        Soccerplayer joe = new Soccerplayer("Defender", 99, "Liverpool");
        System.out.println(joe.toString());

        jonathan.setJerseynum(50);
        jonathan.setPosition("Midfielder");
        jonathan.setTeam("Leeds United");
        System.out.println(jonathan.toString());

        Soccerplayer a = new Soccerplayer();
        Soccerplayer b = new Soccerplayer();

        System.out.println(a.equals(b));

        System.out.println(Soccerplayer.getsTotalPlayer());
        JOptionPane.showMessageDialog(null,
                jonathan.getJerseynum()
                + "\n " + jonathan.getTeam()
                + "\n " + jonathan.getPosition(),
                "Jonathan", JOptionPane.PLAIN_MESSAGE);

        int Smart = JOptionPane.showConfirmDialog(null, "Do you understand?", "IQ check", JOptionPane.YES_NO_OPTION);
        if (Smart == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You're dumb");
        } else {
            JOptionPane.showMessageDialog(null, "You're smart");
        }
    }
}
