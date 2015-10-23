package com.teamax.da.service;

import com.google.gson.Gson;
import com.teamax.da.entities.Viosurveil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 服务接口类
 * Created by Frank on 15/10/23.
 */
public class ZjlrMgr {



    /**
     * 同步入口
     * @param jkxlh 接口序列号
     * @param sjly  服务商
     * @param json  原始证据json
     * @return
     */
    public String syncZJ(String jkxlh, String sjly, String json){
        //验证厂家序列号
        if(true){

        }
        Gson gson = new Gson();
        boolean flag = true;
        Viosurveil v = gson.fromJson(json, Viosurveil.class);
        // 1、检验数据的完整性

        // 2、检查数据的时效性
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Calendar cl1 = Calendar.getInstance();
        Calendar cl2 = Calendar.getInstance();
        try {
            cl1.setTime(sf.parse(v.getWfsj()));
            cl2.setTime(new Date());
            cl2.set(Calendar.DATE, cl2.get(Calendar.DATE) - 2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int result = cl1.compareTo(cl2);
        if (result >= 0) {
            flag = false;
        }
        // 3、设备状态校验
//        flag = checkSbStatus(v.getSbbh());
        // 4、红名单校验
//        flag = checkRedList(v);
        if (flag) {
//            Service.getService().batchInsert(v);
            return "1";
        }
        return "0";

    }
}
