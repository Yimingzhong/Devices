package controller.maintenanceReportManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.RepairRecord;
import service.RepairRecordService;
import util.json.RestResult;
import util.json.ResultCode;

import java.util.List;

@RestController
public class GetMaintenanceReport {

    @Autowired
    RepairRecordService repairRecordService;

    @RequestMapping("/getMaintenanceReport")
    public String get(String phone){
        return repairRecordService.getRecord(phone);
    }
}
