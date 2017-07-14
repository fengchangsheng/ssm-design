package com.lugi.common.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.lugi.common.dao.AbstractMapperDao;
import com.lugi.common.model.AbstractCriteria;
import com.lugi.common.model.AbstractModel;
import com.lugi.common.service.GenericService;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * 通用的Service实现操作类
 */
@SuppressWarnings("serial")
public abstract class GenericServiceImpl<Model extends AbstractModel, Criteria extends AbstractCriteria, PK extends java.io.Serializable> implements GenericService<Model, Criteria, PK>, InitializingBean {

	public static Logger logger = LoggerFactory.getLogger(GenericServiceImpl.class);

	private AbstractMapperDao<Model, Criteria, PK> abstractMapperDao;

	public void setAbstractMapperDao(AbstractMapperDao<Model, Criteria, PK> abstractMapperDao) {
		this.abstractMapperDao = abstractMapperDao;
	}

	@Override
	public int countByExample(Criteria example) {
		return abstractMapperDao.countByExample(example);
	}

	@Override
	public int deleteByExample(Criteria example) {
		return abstractMapperDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(PK sid) {
		return abstractMapperDao.deleteByPrimaryKey(sid);
	}

	@Override
	public int insert(Model record) {
		return this.abstractMapperDao.insert(record);
	}

	@Override
	public int insertSelective(Model record) {
		return this.abstractMapperDao.insertSelective(record);
	}

	@Override
	public PageList<Model> selectByExampleWithRowbounds(Criteria example, RowBounds rowBounds) {
		List<Model> list = this.abstractMapperDao.selectByExampleWithRowbounds(example, rowBounds);
		if (list != null && list instanceof PageList) {
			PageList<Model> pageList = (PageList<Model>) list;
			return pageList;
		}
		return null;
	}

	@Override
	public List<Model> selectByExample(Criteria example) {
		return this.abstractMapperDao.selectByExample(example);
	}

	@Override
	public Model selectByPrimaryKey(PK sid) {
		return this.abstractMapperDao.selectByPrimaryKey(sid);
	}

	@Override
	public int updateByExampleSelective(Model record, Criteria example) {
		return this.abstractMapperDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Model record, Criteria example) {
		return this.abstractMapperDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Model record) {
		return this.abstractMapperDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Model record) {
		return this.abstractMapperDao.updateByPrimaryKey(record);
	}
}