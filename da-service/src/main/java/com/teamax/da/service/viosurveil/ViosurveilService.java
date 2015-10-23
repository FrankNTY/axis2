package com.teamax.da.service.viosurveil;

import com.teamax.da.entities.Viosurveil;

/**
 * Created by Frank on 15/10/23.
 */
public interface ViosurveilService {

    /**
     * 判断是否重复
     * @param viosurveil
     * @return
     */
    boolean checkRepeatEvicence(Viosurveil viosurveil);
}
