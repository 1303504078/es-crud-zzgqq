package com.jk.dao;

import com.jk.pojo.UserBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
public interface EsDao extends ElasticsearchRepository< UserBean,Integer > {
}
