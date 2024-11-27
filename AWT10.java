import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class AWT10 extends Frame implements WindowListener,MouseListener,MouseMotionListener
{
    int x,y;
    String str;
    AWT10()
    {
        super("MOUSE");
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    
    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="PRESSED";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="RELEASED";
        repaint();
    }
    public void mouseClicked(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="CLICKED";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        x=100;
        y=100;
        str="ENTERED";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        x=100;
        y=100;
        str="EXITED";
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="MOVED";
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="DRAGGED";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(str,x , y);
    }
    public static void main(String[] args) 
    {
        AWT10 a=new AWT10();
    }
}