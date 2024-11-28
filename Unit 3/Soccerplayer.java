public class Soccerplayer {
    private static int sTotalPlayer;
    private String position;
    private String team;
    private int jerseynum;

    public Soccerplayer() {
        this("Goalie");
    }

    public Soccerplayer(String pos) {
        this(pos, 0, "Arsenal");
    }

    public Soccerplayer(String p, int jer, String tm) {
        this.position = p;
        this.jerseynum = jer;
        this.team = tm;
        sTotalPlayer++;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setJerseynum(int jerseynum) {
        this.jerseynum = jerseynum;
    }

    public int getJerseynum() {
        return jerseynum;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return team + ", " + position + ", " + jerseynum;
    }

    public boolean equals(Object o) {
        if (o instanceof Soccerplayer d) {
            return this.team.equals(d.team) && this.jerseynum == d.jerseynum && this.position.equals(d.position);
        }
        return false;
    }

    public static void setsTotalPlayer(int sTotalPlayer) {
        Soccerplayer.sTotalPlayer = sTotalPlayer;
    }

    public static int getsTotalPlayer() {
        return sTotalPlayer;
    }
}
