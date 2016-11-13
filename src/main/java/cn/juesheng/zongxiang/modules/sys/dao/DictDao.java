package cn.juesheng.zongxiang.modules.sys.dao;

import cn.juesheng.zongxiang.common.persistence.CrudDao;
import cn.juesheng.zongxiang.common.persistence.annotation.MyBatisDao;
import cn.juesheng.zongxiang.modules.sys.entity.Dict;

import java.util.List;

/**
 * 描述：字典DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict>{
    public List<String> findTypeList(Dict dict);
}
