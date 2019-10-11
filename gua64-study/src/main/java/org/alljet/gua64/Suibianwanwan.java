package org.alljet.gua64;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Suibianwanwan {


    private static int allitemCount = 56;
    private static int questionCount = 56;




    public static void main(String[] args)throws Exception{
        game();
    }


    public static void game(){

        int rightCount = 0,wrongCount = 0;
        StringBuilder wrongs = new StringBuilder();
        wrongs.append("以下为答错题目：\n");
        System.out.println("请选择模式：1/2（卦名问答/卦爻问答）");
        Scanner scan =new Scanner(System.in);
        String gameMod = scan.nextLine();

        String[] question,askans;
        if("1".equals(gameMod)){
            question = param2;
            askans = param;
        }else{
            question = param;
            askans = param2;
        }
        Random random = new Random();
        List<Integer> containIndex = new ArrayList<>(questionCount);
        for(int i=0;i<questionCount;i++) {
            int s = random.nextInt(allitemCount);
            boolean flag = true;
            while (flag) {
                if (containIndex.contains(s))
                    s = random.nextInt(allitemCount);
                else
                    flag=false;
            }
            containIndex.add(s);
            System.out.println("第"+(i+1)+"题:"+question[s]);
            String ansStr = askans[s];
            String scaString = scan.nextLine();
            if(scaString.equals(ansStr)){
                System.out.println("正确");
            }else{
                System.out.println("错误，正确答案是："+ansStr);
                wrongs.append("第"+(i+1)+"题:"+question[s]).append("，正确答案是："+ansStr+"\n");
            }
        }
        System.out.println(wrongs.toString());
        System.out.println("再来一遍Y/N？");
        String rePlay = scan.nextLine();
        if("Y".equals(rePlay.toUpperCase())){
            game();
        }
    }


























































    private static String[] param = {"否","姤","无妄","同人","讼","遯","履","泰","升","复","明夷","师","谦","临","小畜","观","益","家人","涣","渐","中孚","大壮","豫","恒","丰","解","小过","归妹",
            "大有","晋","鼎","噬嗑","未济","旅","暌","需","比","井","屯","既济","蹇","节","大畜","剥","蛊","颐","贲","蒙","损","夬","萃","大过","随","革","困","咸"};

    private static String[] param2 = {"天地","天风","天雷","天火","天水","天山","天泽","地天","地风","地雷","地火","地水","地山","地泽","风天","风地","风雷","风火","风水","风山","风泽",
            "雷天","雷地","雷风","雷火","雷水","雷山","雷泽","火天","火地","火风","火雷","火水","火山","火泽","水天","水地","水风","水雷","水火","水山","水泽","山天","山地","山风","山雷","山火","山水","山泽","泽天","泽地","泽风","泽雷","泽火","泽水","泽山"};

}
