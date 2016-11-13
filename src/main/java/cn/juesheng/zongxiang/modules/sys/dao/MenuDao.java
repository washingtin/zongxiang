package cn.juesheng.zongxiang.modules.sys.dao;

import cn.juesheng.zongxiang.common.persistence.CrudDao;
import cn.juesheng.zongxiang.common.persistence.annotation.MyBatisDao;
import cn.juesheng.zongxiang.modules.sys.entity.Menu;

import java.util.List;

/**
 * 描述：菜单DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {
    public List<Menu> findByParentIdsLike(Menu menu);

    public List<Menu> findByUserId(Menu menu);

    public int updateParentIds(Menu menu);

    public int updateSort(Menu menu);
}
