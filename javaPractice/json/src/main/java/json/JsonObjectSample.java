package json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/5/16.
 */
public class JsonObjectSample {

    public static void main(String[] args) {
//        jsonObject();
        createJsonByMap();
    }

    private static void jsonObject() {
        JSONObject wangxiaoer = new JSONObject();
        Object nullObje = null;
        try {
            wangxiaoer.put("name","王小二");
            wangxiaoer.put("age",25.2);
            wangxiaoer.put("birthday", "1990-01-01");
            wangxiaoer.put("school", "蓝翔");
            wangxiaoer.put("major", new String[]{"理发", "挖掘机"});
            wangxiaoer.put("has_girlfriend",false);
            wangxiaoer.put("car",nullObje);//有两个null的方法，直接写null是模棱两可的，java无法识别
            wangxiaoer.put("comment","这是一个注释");
            System.out.println(wangxiaoer.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void createJsonByMap(){
        Map<String,Object> wangxiaoer = new HashMap<String, Object>();
        Object nullObje = null;
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",25.2);
        wangxiaoer.put("birthday", "1990-01-01");
        wangxiaoer.put("school", "蓝翔");
        wangxiaoer.put("major", new String[]{"理发", "挖掘机"});
        wangxiaoer.put("has_girlfriend",false);
        wangxiaoer.put("car",nullObje);//有两个null的方法，直接写null是模棱两可的，java无法识别
        wangxiaoer.put("comment","这是一个注释");
        System.out.println(new JSONObject(wangxiaoer).toString());
    }

    private static void createJsonByJavaBean(){

    }

}
