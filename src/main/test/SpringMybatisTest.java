import com.zjut.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMybatisTest {
    @Autowired
    @Qualifier(value = "accountDao")
    private AccountDao accountDao;

    @Test
    public void springMybatisTest(){
        System.out.println(accountDao.findAll());
    }
}
