package json;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by admin on 2017/5/16.
 */
public class ReadJsonSample {

    public static void main(String[] args) throws IOException, JSONException {
        File file = new File(ReadJsonSample.class.getResource("wangxiaoer.json").getFile());
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);
        System.out.println("姓名是："+jsonObject.getString("name"));
        System.out.println("年龄是："+jsonObject.getString("age"));
    }

}
