package org.alljet.gua64;

public class Constants {

    public final static String[] GUA_NAME = {"否","姤","无妄","同人","讼","遯","履","泰","升","复","明夷","师","谦","临","小畜","观","益","家人","涣","渐","中孚","大壮","豫","恒","丰","解","小过","归妹",
            "大有","晋","鼎","噬嗑","未济","旅","暌","需","比","井","屯","既济","蹇","节","大畜","剥","蛊","颐","贲","蒙","损","夬","萃","大过","随","革","困","咸"};

    public final static String[] GUA_YAO = {"天地","天风","天雷","天火","天水","天山","天泽","地天","地风","地雷","地火","地水","地山","地泽","风天","风地","风雷","风火","风水","风山","风泽",
            "雷天","雷地","雷风","雷火","雷水","雷山","雷泽","火天","火地","火风","火雷","火水","火山","火泽","水天","水地","水风","水雷","水火","水山","水泽","山天","山地","山风","山雷","山火","山水","山泽","泽天","泽地","泽风","泽雷","泽火","泽水","泽山"};

    public static int questionCount = Integer.valueOf(PropertyUtil.getProperty("question_count"));

    public static int fullScore = Integer.valueOf(PropertyUtil.getProperty("full_score"));

}
