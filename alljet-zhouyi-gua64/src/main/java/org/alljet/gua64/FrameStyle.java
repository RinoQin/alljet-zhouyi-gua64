package org.alljet.gua64;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.io.FileInputStream;
import java.io.IOException;

public class FrameStyle {

    public void getFrame(){
        Zhouyi64Gua frame = new Zhouyi64Gua();
        JFrame jFrame = new JFrame("六十四卦记忆我帮忙");

        jFrame.add(frame.$$$getRootComponent$$$());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        //设置窗体左上角与显示屏左上角的坐标，离显示屏上边缘300像素，离显示屏左边缘300像素
        jFrame.setLocation(300, 300);
        //f.setLocationRelativeTo(null);本语句实现窗口居屏幕中央
        jFrame.setSize(400,400);
        //设置窗体的大小为300*200像素大小
        jFrame.setResizable(false);
        try {
            //File file = new File(this.getClass().getResource("/20190930102808.png").getPath());
            Image image = ImageIO.read(new FileInputStream(this.getClass().getResource("/20190930102808.png").getPath()));
            jFrame.setIconImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
