package cn.juesheng.zongxiang.modules.sys.dao;

import cn.juesheng.zongxiang.common.persistence.TreeDao;
import cn.juesheng.zongxiang.common.persistence.annotation.MyBatisDao;
import cn.juesheng.zongxiang.modules.sys.entity.Office;

/**
 * 描述：机构DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office>{

}
