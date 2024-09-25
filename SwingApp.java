import javax.swing.*;
public class SwingApp {
SwingApp()
{
    JFrame f=new JFrame();
    JLabel Fn=new JLabel("First Name : ");
    Fn.setBounds(20,50,80,20);
    JLabel Ln=new JLabel("Last Name : ");
    Ln.setBounds(20,80,80,20);
    JLabel dob=new JLabel("Date of birth : ");
    dob.setBounds(20,110,80,20);

    JTextField FnTf=new JTextField();
    FnTf.setBounds(120,50,100,20);
    JTextField LnTf=new JTextField();
    LnTf.setBounds(120,80,100,20);
    JTextField dobTf=new JTextField();
    dobTf.setBounds(120,110,100,20);

    JButton sub=new JButton("Submit");
    sub.setBounds(20,160,100,30);
    JButton rst=new JButton("Reset");
    rst.setBounds(130,160,100,30);

    f.add(Fn);
    f.add(Ln);
    f.add(dob);
    f.add(FnTf);
    f.add(LnTf);
    f.add(dobTf);
    f.add(sub);
    f.add(rst);

    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
}  

public static void main(String[] args)
{
    SwingApp sa=new SwingApp();
}
}
