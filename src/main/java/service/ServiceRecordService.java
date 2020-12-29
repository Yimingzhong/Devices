package service;

import pojo.RepairRecord;
import pojo.ServiceRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 560
 * @since 2020-12-23
 */
public interface ServiceRecordService extends IService<ServiceRecord> {
    public List<ServiceRecord> selectUndispatchedTask(Integer status);
    public void updateTask(ServiceRecord serviceRecord);
    public String getServiceRecord(HttpServletRequest request);
}
