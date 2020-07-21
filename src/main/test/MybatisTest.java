import com.zjut.dao.AccountDao;
import com.zjut.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class MybatisTest {
    @Test
    public void mybatisTest() throws IOException {
        //创建工厂
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SQLMapConfig.xml"));
        //获取SqlSession
        SqlSession sqlSession = ssf.openSession();
        //通过动态代理获取AccountDao
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //测试方法
        System.out.println(dao.findAll());

/*        Account account = new Account();
        account.setName("小王");
        account.setMoney(100);
        dao.save(account);
        sqlSession.commit();*/

        sqlSession.close();
    }
}
