package com.fire.service.mysql;
import com.fire.dao.AskersMapper;
import com.fire.util.SystemMethodLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AskersService {
    @Autowired
    private AskersMapper askersMapper;
    @SystemMethodLog(describe = "查找askID")
    public String queryByName(String loginname) {
        return askersMapper.queryByName(loginname);
    }
}
