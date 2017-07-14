package com.lugi.common.dao;

import com.lugi.common.model.AbstractCriteria;
import com.lugi.common.model.AbstractModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 抽象的Dao操作
 */
public interface AbstractMapperDao<Model extends AbstractModel, Criteria extends AbstractCriteria, PK extends java.io.Serializable> extends java.io.Serializable {

    int countByExample(Criteria example);

    int deleteByExample(Criteria example);

    int deleteByPrimaryKey(PK sid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExampleWithRowbounds(Criteria example, RowBounds rowBounds);

    List<Model> selectByExample(Criteria example);

    Model selectByPrimaryKey(PK sid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") Criteria example);

    int updateByExample(@Param("record") Model record, @Param("example") Criteria example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}