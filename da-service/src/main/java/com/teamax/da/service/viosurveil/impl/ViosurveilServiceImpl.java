package com.teamax.da.service.viosurveil.impl;

import com.teamax.da.entities.Viosurveil;
import com.teamax.da.service.viosurveil.ViosurveilService;
import org.springframework.stereotype.Service;

/**
 * Created by Frank on 15/10/23.
 */
@Service
public class ViosurveilServiceImpl implements ViosurveilService {

    public boolean checkRepeatEvicence(Viosurveil viosurveil) {
        return false;
    }
}
