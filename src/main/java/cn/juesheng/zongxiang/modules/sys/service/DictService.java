package cn.juesheng.zongxiang.modules.sys.service;

import cn.juesheng.zongxiang.common.service.CrudService;
import cn.juesheng.zongxiang.common.utils.CacheUtils;
import cn.juesheng.zongxiang.modules.sys.dao.DictDao;
import cn.juesheng.zongxiang.modules.sys.entity.Dict;
import cn.juesheng.zongxiang.modules.sys.utils.DictUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述：字典service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
    /**
     * 查询字段类型列表
     * @return
     */
    public List<String> findTypeList(){
        return dao.findTypeList(new Dict());
    }

    @Transactional(readOnly = false)
    public void save(Dict dict) {
        super.save(dict);
        CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
    }

    @Transactional(readOnly = false)
    public void delete(Dict dict) {
        super.delete(dict);
        CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
    }
}
