package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static Properties prop;


    public void loadXpathProperties(String fileName){
        try {
            String filePath="./src/test/java/pages/"+fileName+".properties";
            FileInputStream input = new FileInputStream(filePath);
            System.out.println("file Path: " + filePath);

            assert input !=null;
            prop =new Properties();
            prop.load(input);
            input.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }

     public String getProperty(String key){
          return prop.getProperty(key);
}

}
