package org.example;

import java.io.IOException;

/**
 * 测试Javadoc
 *
 * @author Tian
 * @since  2023/12/04 20:16
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        // String userProfile = System.getProperty("user.home");
        // System.out.println(userProfile);

        String result = HTTPUtils.Get("http://localhost:8088/cobot/system/getSystemInfo");
        System.out.println(result);

        /* String data = "{\"name\":\"Tom\",\"age\":20}";
        result = HTTPUtils.Post("http://localhost:8080/user", data);
        System.out.println(result); */
    }
}
