package work.jianhang.seckill.validator;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Data
public class ValidationResult {

    // 校验结果是否有错
    private boolean hasErrors = Boolean.FALSE;
    // 存放错误信息的map
    private Map<String, String> errorMsgMap = new HashMap<>();

    // 实现通用的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg() {
        return Strings.join(errorMsgMap.values().iterator(), ',');
    }

}
