import java.applet.*;
import java.awt.*;
public class Welcome extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawString(" Welcome to the World of Applet ",40,60);
	}
}

/*
<applet code= "Welcome.class" width=400  height=200 >
</applet>
*/