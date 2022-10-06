import com.tai.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) throws IOException {

        InputStream in=Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();

        //selectList
//        List<Flower> flowers=new ArrayList<>();
//        flowers=session.selectList("selAll");
//        for(Flower flower:flowers){
//            System.out.println(flower);
//        }

        //selectOne
        int count=session.selectOne("selId");
        System.out.println(count);

        session.close();
        in.close();
    }
}
