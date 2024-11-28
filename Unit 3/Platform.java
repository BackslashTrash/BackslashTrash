import javax.swing.JOptionPane;
public class Platform {
    public static void main(String[] args) {
        A2 John = new A2();
        A2 Jeff = new A2("Jeff","Boy",67);

        John.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter age:")));
        John.setGender(JOptionPane.showInputDialog("Enter gender:"));
        John.setName(JOptionPane.showInputDialog("Enter name:"));

        JOptionPane.showMessageDialog(null, John.getName() +", " + John.getGender() + ", " + John.getAge());


    }
}

