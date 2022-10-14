package ch8;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        String path = PropertiesEx.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "UTF-8"); // 경로에 한글이 있을경우 깨짐 방지를 위해 UTF-8로 변환
        properties.load(new FileReader(path)); // 파일의 내용을 읽어옴

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
