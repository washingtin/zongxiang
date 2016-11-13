package cn.juesheng.zongxiang.modules.sys.dao;

import cn.juesheng.zongxiang.common.persistence.CrudDao;
import cn.juesheng.zongxiang.common.persistence.annotation.MyBatisDao;
import cn.juesheng.zongxiang.modules.sys.entity.Role;

/**
 * 描述：角色DAO接口
 * @author jeenet
 */
@MyBatisDao
public interface RoleDao extends CrudDao<Role>{
    public Role getByName(Role role);

    public Role getByEnname(Role role);

    /**
     * 维护角色与菜单权限关系
     * @param role
     * @return
     */
    public int deleteRoleMenu(Role role);

    public int insertRoleMenu(Role role);

    /**
     * 维护角色与公司部门关系
     * @param role
     * @return
     */
    public int deleteRoleOffice(Role role);

    public int insertRoleOffice(Role role);
}
