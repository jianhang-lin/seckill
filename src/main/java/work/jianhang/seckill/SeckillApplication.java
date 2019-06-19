package work.jianhang.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.jianhang.seckill.dao.UserDOMapper;
import work.jianhang.seckill.dataobject.UserDO;

@SpringBootApplication(scanBasePackages = {"work.jianhang.seckill"})
@RestController
@MapperScan("work.jianhang.seckill.dao")
public class SeckillApplication {

    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null) {
            return "用户对象不存在.";
        } else {
            return "Hello World.";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }

}
