import com.nofat.controller.UserController;
import com.nofat.entity.DO.UserDO;
import org.junit.Test;

/**
 * Created by user on 2020/5/16.
 */

public class RankTest {
    @Test
    public void test1() {

//        // 加载配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-controller.xml");
//
//        // 获取service对象
//        IRankTypeService rankTypeService  = (RankTypeServiceImpl)applicationContext.getBean("rankTypeService");
//
//        // 执行方法
//        List<RankType> result =  rankTypeService.findAll();

//        IRankTypeService service = new RankTypeServiceImpl();

//        service.findAll();

    }

    @Test
    public void test2() {
        UserController userController = new UserController();
        UserDO userDO = new UserDO();

        userDO.setName("张三");
        userDO.setPassword("123456");

        userController.saveUser(userDO);
    }
}
