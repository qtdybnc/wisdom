package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Baufe;

import java.util.List;

public interface BaufeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Baufe record);

    int insertSelective(Baufe record);

    Baufe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Baufe record);

    int updateByPrimaryKey(Baufe record);

    List<Baufe> selectBaufe();

    List<Baufe> selectBaufeByfk(Integer cityid);

    List<Baufe> selectBaufeByf(Integer modeid);
}