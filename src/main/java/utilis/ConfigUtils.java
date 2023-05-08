package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUtils {

    static public Properties getsprop(String filename){
        Properties myProp = new Properties();
        try{
            File propFile = new File("C:\\Users\\Hassan\\testauto\\src\\test\\resources\\"+filename+".properties");
            if (propFile.exists())
                myProp.load(new FileInputStream(propFile));
            else
                System.out.println("File not found: " + filename);
        }
        catch (Exception e){
            e.printStackTrace();
            }
        return myProp;
    }
}
