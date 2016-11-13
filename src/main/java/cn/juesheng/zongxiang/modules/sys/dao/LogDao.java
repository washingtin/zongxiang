package cn.juesheng.zongxiang.modules.sys.dao;

import cn.juesheng.zongxiang.common.persistence.CrudDao;
import cn.juesheng.zongxiang.common.persistence.annotation.MyBatisDao;
import cn.juesheng.zongxiang.modules.sys.entity.Log;

/**
 * 描述：日志DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log>{

}
