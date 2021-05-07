package com.ecnu.wisdomfarm.mapper;

import com.ecnu.wisdomfarm.entity.envInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface envInfoMapper {

    List<envInfo> findAllEnv();
}
