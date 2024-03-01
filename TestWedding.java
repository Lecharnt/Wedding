import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TestWedding extends JFrame {
    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 400;

    public TestWedding() {
        setTitle("BigY Store");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// creates the title
        JPanel titleBar = new JPanel();
        titleBar.setPreferredSize(new Dimension(FRAME_WIDTH, 30));
        titleBar.setBackground(new Color(158, 143, 82));
// Creates components for user input
        JLabel heading = new JLabel("Make your wedding card");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        JTextField brideF = new JTextField();
        JTextField brideL = new JTextField();
        JTextField groomF = new JTextField();
        JTextField groomL = new JTextField();
        JTextField location = new JTextField();
        JTextField rep1 = new JTextField();
        JTextField rep2 = new JTextField();
        JTextField year = new JTextField();
        JTextField month = new JTextField();
        JTextField day = new JTextField();
// Creates text JLabels
        JLabel labelBrideF = new JLabel("bride first name: ");
        JLabel labelBrideL = new JLabel("bride last name: ");
        JLabel labelGroomF = new JLabel("groom first name: ");
        JLabel labelGroomL = new JLabel("groom last name: ");
        JLabel labelLocation = new JLabel("location: ");
        JLabel labelRep1 = new JLabel("recipient one: ");
        JLabel labelRep2 = new JLabel("recipient two: ");
        JLabel labelYear = new JLabel("year: ");
        JLabel labelMonth = new JLabel("month: ");
        JLabel labelDay = new JLabel("day: ");
        JButton button = new JButton("Confirm card");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieving user inputs and objects
                Person bride = new Person(brideF.getText(), brideL.getText());
                Person groom = new Person(groomF.getText(), groomL.getText());
                Couple couple = new Couple(bride, groom);
                int yearValue = Integer.parseInt(year.getText());
                int monthValue = Integer.parseInt(month.getText());
                int dayValue = Integer.parseInt(day.getText());
                LocalDate dateWed = LocalDate.of(yearValue, monthValue, dayValue);
                Wedding_for_a_wedding_planner wedding = new Wedding_for_a_wedding_planner(dateWed, couple, location.getText());
                displayWeddingDetails(wedding);
            }
        });
// Creating pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(0, 1));
        contentPane.add(titleBar);
        contentPane.add(heading);
        contentPane.add(labelBrideF);
        contentPane.add(brideF);
        contentPane.add(labelBrideL);
        contentPane.add(brideL);
        contentPane.add(labelGroomF);
        contentPane.add(groomF);
        contentPane.add(labelGroomL);
        contentPane.add(groomL);
        contentPane.add(labelLocation);
        contentPane.add(location);
        contentPane.add(labelRep1);
        contentPane.add(rep1);
        contentPane.add(labelRep2);
        contentPane.add(rep2);
        contentPane.add(labelYear);
        contentPane.add(year);
        contentPane.add(labelMonth);
        contentPane.add(month);
        contentPane.add(labelDay);
        contentPane.add(day);
        contentPane.add(button);

        getContentPane().add(contentPane);
    }

    // Method to display wedding details
    private void displayWeddingDetails(Wedding_for_a_wedding_planner wedding) {
        StringBuilder message = new StringBuilder("\n" +
                "You're Invited!\n" + "\n" +
                wedding.getcouple().getBride().getfirstNam() + " and " +
                wedding.getcouple().getGroom().getfirstNam() +
                " cordially invite you to share in their joy\n" +
                "as they exchange vows and begin their journey together\n" +
                "\n" +
                "Date: " + wedding.getDateWed() + "\n" +
                "Venue: " + wedding.getLocation() + "\n" +
                "\n" +
                "Please join us in celebrating love, laughter, and happily ever after!\n" +
                "\n" +
                "With love,\n" +
                wedding.getcouple().getBride().getfirstNam() +
                wedding.getcouple().getBride().getlastNam() + " and " +
                wedding.getcouple().getGroom().getfirstNam() +
                wedding.getcouple().getGroom().getlastNam());

        JOptionPane.showMessageDialog(TestWedding.this, message.toString(), "Congratulations", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        TestWedding example = new TestWedding();
        example.setVisible(true);
    }
}
