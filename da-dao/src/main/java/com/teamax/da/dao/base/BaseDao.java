package com.teamax.da.dao.base;

import java.util.List;

/**
 * 基础DAO
 * Created by Frank on 15/10/23.
 */
public interface BaseDao {
    /**
     * 根据sqlid与param查询列表
     * @param sqlId sqlid
     * @param param 参数
     * @return list
     */
    List getListByParam(String sqlId,Object param);
}
