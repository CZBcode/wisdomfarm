package com.ecnu.wisdomfarm.service.impl;

import com.ecnu.wisdomfarm.entity.envInfo;
import com.ecnu.wisdomfarm.mapper.envInfoMapper;
import com.ecnu.wisdomfarm.service.IenvInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class envInfoServiceImpl implements IenvInfoService {

    @Autowired
    envInfoMapper envInfoMapper;

    @Override
    public List<envInfo> findAllEnv() {
        return envInfoMapper.findAllEnv();
    }
}
