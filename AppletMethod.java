import java.awt.*;
import java.applet.*;
public class AppletMethod extends Applet 
{
	public void init()
	{
		System.out.println("Java Applet Initialised .");
	}
	public void start()
	{
		System.out.println("Java Applet Started .");
	}
	public void paint(Graphics g)
	{
		g.drawString("Demonstration of all Applet Methods",50,30);
	}
	public void stop()
	{
		System.out.println("Applet process stoped .");
	}
	public void destroy()
	{
		System.out.println("Java Applet Destroyed Successfully .");
	}
}
/*
<applet code = "AppletMethod.class" width =300 height = 200>
</applet>
*/