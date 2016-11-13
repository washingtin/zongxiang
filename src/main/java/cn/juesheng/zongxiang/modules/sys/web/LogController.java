package cn.juesheng.zongxiang.modules.sys.web;

import cn.juesheng.zongxiang.common.persistence.Page;
import cn.juesheng.zongxiang.common.web.BaseController;
import cn.juesheng.zongxiang.modules.sys.entity.Log;
import cn.juesheng.zongxiang.modules.sys.service.LogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述：日志控制器
 * @author jeenet
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/log")
public class LogController extends BaseController {
    @Autowired
    private LogService logService;

    @RequiresPermissions("sys:log:view")
    @RequestMapping(value = {"list", ""})
    public String list(Log log, HttpServletRequest request, HttpServletResponse response, Model model) {
        Page<Log> page = logService.findPage(new Page<Log>(request, response), log);
        model.addAttribute("page", page);
        return "modules/sys/logList";
    }
}
