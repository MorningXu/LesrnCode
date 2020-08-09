package cn.MoringXu.game;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame{

    @Override
    public void paint(Graphics g){
        Color c = g.getColor();

        g.setColor(Color.RED);

        g.drawLine(20,20,100,100);
        g.drawRect(50,50,100,100);
        g.drawOval(60,60,300,200);
        g.setColor(c);
        g.drawString("Do you want to play game?",200,200);
    }




    public void launchFrame(){
        setTitle("MyGame");//设置标题
        setSize(500,500);
        setVisible(true);
        setLocation(300,300);
        //增加关闭窗口监听
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
