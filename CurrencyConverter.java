import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class CurrencyConverter extends JFrame implements ActionListener
{
    JLabel froml,tol,amountl,resultl,resultd;
    JComboBox<String> fromc,toc;
    JTextField amountfd;
    JButton convertb;

    double USDtoI=83.25;
    double EURtoI=88.70;
    double GBPtoI=101.25;

    public CurrencyConverter()
    {
          setTitle("Currency Converter ");
          setSize(400,300);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLayout(new FlowLayout());
          setLayout(new GridLayout(5,1,15,15));

          froml=new JLabel("From Currency : ");
          tol=new JLabel("To Currency : ");
          amountl=new JLabel("Amount : ");
          resultl=new JLabel("Converted Amount : ");
          
          String[] curr={"USD","INR","EUR","GBP"};
          fromc=new JComboBox<>(curr);
          toc=new JComboBox<>(curr);

          amountfd=new JTextField();

          convertb=new JButton("Convert");
          convertb.addActionListener(this);

          resultd=new JLabel("0.0");

          add(froml);
          add(fromc);
          add(tol);
          add(toc);
          add(amountl);
          add(amountfd);
          add(resultl);
          add(resultd);
          add(new JLabel());
          add(convertb);

          setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String f=fromc.getSelectedItem().toString();
        String t=toc.getSelectedItem().toString();
        double a=Double.parseDouble(amountfd.getText());
        double r=convertc(f,t,a);

        resultd.setText(String.format("%.2f",r));
    }

    public double convertc(String f,String t, double a)
    {
        double inINR=0.0;
         switch(f)
         {
            case "USD":
            inINR=a*USDtoI;
            break;
            case "EUR":
            inINR=a*EURtoI;
            break;
            case "GBP":
            inINR=a*GBPtoI;
            break;
            case "INR":
            inINR=a;
            break;
         }
         switch(t)
         {
            case "USD":
            return inINR/USDtoI;
            
            case "EUR":
            return inINR/EURtoI;
            
            case "GBP":
            return inINR/GBPtoI;
            
            case "INR":
            return inINR;
            
         }
         return 0.0;
    }
    public static void main(String args[])
    {
        new CurrencyConverter();
    }
    
}