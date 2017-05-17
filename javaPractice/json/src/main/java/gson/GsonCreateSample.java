package gson;

import bean.Wangxiaoer;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

import java.lang.reflect.Field;

/**
 * Created by admin on 2017/5/16.
 */
public class GsonCreateSample {

    public static void main(String[] args) {
        Wangxiaoer wangxiaoer = new Wangxiaoer();
        wangxiaoer.setName("王小二");
        wangxiaoer.setAge(25.2);
        wangxiaoer.setBirthday("1990-01-01");
        wangxiaoer.setScholl("蓝翔");
        wangxiaoer.setMajor(new String[] { "理发", "挖掘机" });
        wangxiaoer.setHas_girlfriend(false);
        wangxiaoer.setCar(null);
        wangxiaoer.setHouse(null);
        wangxiaoer.setComment("这是一个注释");
        wangxiaoer.setIgnore("忽略");

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            public String translateName(Field field) {
                if (field.getName().equals("name"))
                    return "NAMEEE";
                return field.getName();
            }
        });
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(wangxiaoer));
    }

}
