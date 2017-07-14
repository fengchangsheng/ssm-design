package com.lugi.common.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.lugi.common.model.AbstractCriteria;
import com.lugi.common.model.AbstractModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 抽象的Service操作
 */
public interface GenericService<Model extends AbstractModel, Criteria extends AbstractCriteria, PK extends java.io.Serializable> extends java.io.Serializable {

	public abstract int countByExample(Criteria example);

	public abstract int deleteByExample(Criteria example);

	public abstract int deleteByPrimaryKey(PK sid);

	public abstract int insert(Model record);

	public abstract int insertSelective(Model record);

	public abstract PageList<Model> selectByExampleWithRowbounds(Criteria example, RowBounds rowBounds);

	public abstract List<Model> selectByExample(Criteria example);

	public abstract Model selectByPrimaryKey(PK sid);

	public abstract int updateByExampleSelective(@Param("record") Model record, @Param("example") Criteria example);

	public abstract int updateByExample(@Param("record") Model record, @Param("example") Criteria example);

	public abstract int updateByPrimaryKeySelective(Model record);

	public abstract int updateByPrimaryKey(Model record);
}
