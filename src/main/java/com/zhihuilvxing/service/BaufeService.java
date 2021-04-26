package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Baufe;

import java.util.List;

public interface BaufeService {
    List<Baufe> selectBaufe();

    List<Baufe> selectBaufeByfk(Integer cityid);
    List<Baufe> selectBaufeByf(Integer modeid);
}
