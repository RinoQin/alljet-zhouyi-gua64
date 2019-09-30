package org.alljet.gua64;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
    private static final Properties props;

    static {
        props = new Properties();
        InputStream in = null;
        try {
            // <!--第一种，通过类加载器进行获取properties文件流-->
            in = PropertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
            // <!--第二种，通过类进行获取properties文件流-->
            // in = org.alljet.gua64.PropertyUtil.class.getResourceAsStream("/jdbc.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String name){
       return props.getProperty(name);
    }

}
