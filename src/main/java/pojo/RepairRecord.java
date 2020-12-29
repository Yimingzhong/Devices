package pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 报修记录表
 * </p>
 *
 * @author 560
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RepairRecord implements Serializable {

    public static final long serialVersionUID = 1L;
    public static final int INPROCESS = 1;
    public static final int FINISHED = 2;
    public static final int REVOKE = 3;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer customerId;

    @TableField(exist = false)
    private Customer customer;

    private Date repairTime;

    private Date expectedTime;

    private Integer status;

    @TableField(exist = false)
    private Device device;
}
