import java.awt.*;
import java.awt.event.*;

public class AWT27 extends Frame implements ActionListener {
    TextField t1;
    Panel p1;
    String[] cap = new String[] {
        "1", "2", "3", "+",
        "4", "5", "6", "-",
        "7", "8", "9", "*",
        "C", "0", "=", "/"
    };
    Button[] btn;
    int v1, v2, res, flg;
    char ch, opr;
    String s;

    AWT27() {
        super("Calculator");

        // TextField for displaying input/output
        t1 = new TextField(15);
        t1.setEditable(false); // Make the text field read-only
        t1.setFont(new Font("Arial", Font.BOLD, 18)); // Improve aesthetics
        add(t1, BorderLayout.NORTH);

        // Buttons for calculator
        btn = new Button[16];
        p1 = new Panel();
        p1.setLayout(new GridLayout(4, 4, 10, 10)); // Adjust spacing

        for (int i = 0; i < 16; i++) {
            btn[i] = new Button(cap[i]);
            btn[i].addActionListener(this);
            p1.add(btn[i]);
        }

        add(p1, BorderLayout.CENTER);

        // Window close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        s = "";
        setSize(400, 400);
        setVisible(true);
    }

    void comp() {
        
            switch (opr) {
                case '+':
                    res = v1 + v2;
                    break;
                case '-':
                    res = v1 - v2;
                    break;
                case '*':
                    res = v1 * v2;
                    break;
                case '/':
                    if (v2 == 0) {
                        t1.setText("Error: Divide by 0");
                        return;
                    }
                    res = v1 / v2;
                    break;
            }
        
    }

    public void actionPerformed(ActionEvent e) {
        ch = (e.getActionCommand()).charAt(0);

        if (ch == 'C') {
            s = "";
            t1.setText("");
            flg = 0;
            return;
        }

        if (ch == '=') {
            if (flg == 1) {
                try {
                    v2 = Integer.parseInt(t1.getText());
                } catch (Exception e1) {
                    t1.setText("Invalid Input");
                    return;
                }
                comp();
                t1.setText("" + res);
                flg = 0;
                s = "";
                return;
            }
        }

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            if (flg == 0) {
                try {
                    v1 = Integer.parseInt(t1.getText());
                } catch (Exception e1) {
                    t1.setText("Invalid Input");
                    return;
                }
                opr = ch;
                s = "";
                flg = 1;
            } else {
                try {
                    v2 = Integer.parseInt(t1.getText());
                } catch (Exception e1) {
                    t1.setText("Invalid Input");
                    return;
                }
                comp();
                t1.setText("" + res);
                v1 = res;
                opr = ch;
                s = "";
            }
            return;
        }

        // Append the pressed button to the current input
        s = s + ch;
        t1.setText(s);
    }

    public static void main(String[] args) {
        AWT27 a = new AWT27();
    }
}
