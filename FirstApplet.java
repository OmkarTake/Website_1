import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawString("Hello Java",40,60);
	}
}

/*
<applet code= "FirstApplet.class" width=200  height=200 >
</applet>
*/