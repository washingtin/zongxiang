package cn.juesheng.zongxiang.modules.sys.service;

import cn.juesheng.zongxiang.common.persistence.Page;
import cn.juesheng.zongxiang.common.service.CrudService;
import cn.juesheng.zongxiang.common.utils.DateUtils;
import cn.juesheng.zongxiang.modules.sys.dao.LogDao;
import cn.juesheng.zongxiang.modules.sys.entity.Log;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述：日志service
 * @author jeenet
 */
@Service
@Transactional(readOnly = true)
public class LogService extends CrudService<LogDao, Log> {
    public Page<Log> findPage(Page<Log> page, Log log) {

        // 设置默认时间范围，默认当前月
        if (log.getBeginDate() == null){
            log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
        }
        if (log.getEndDate() == null){
            log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
        }

        return super.findPage(page, log);

    }
}
