package cn.ac.iie.stu.utils;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回格式化工具类
 * @author Jack
 * @version 1.0
 * @date 2018-5-4
 */
public class ReturnFormat {

    public static String success(Object o) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", true);
        jsonObject.put("result", o);
        return jsonObject.toJSONString();
    }

    /**
     * 失败返回
     * @param msg 调用失败信息
     */
    public static String failed(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", false);
        jsonObject.put("msg", msg);
        return jsonObject.toJSONString();
    }

    public static String result(Object o, String msg) {
        if (o != null) {
            if (o instanceof String && ((String) o).trim().isEmpty()) {
                return failed(msg);
            }
            if (o instanceof List && ((List)o).isEmpty()){
                return failed(msg);
            }
            if (o instanceof Boolean && (!(Boolean)o)){
                return failed(msg);
            }
            return success(o);
        } else {
            return failed(msg);
        }
    }
}

