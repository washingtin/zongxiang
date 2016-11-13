package cn.juesheng.zongxiang.modules.sys.service;

import cn.juesheng.zongxiang.common.service.TreeService;
import cn.juesheng.zongxiang.modules.sys.dao.AreaDao;
import cn.juesheng.zongxiang.modules.sys.entity.Area;
import cn.juesheng.zongxiang.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述：区域Service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {
    public List<Area> findAll(){
        return UserUtils.getAreaList();
    }

    @Transactional(readOnly = false)
    public void save(Area area) {
        super.save(area);
        UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
    }

    @Transactional(readOnly = false)
    public void delete(Area area) {
        super.delete(area);
        UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
    }
}
