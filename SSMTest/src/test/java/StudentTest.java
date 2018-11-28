import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentTest extends BaseTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void testQueryById(){
        long id = 1000;
        Student student = studentDao.queryByid(id);
        System.out.println(student.getId()+" "+student.getName());
    }

    @Test
    public void testQueryAll(){
        List<Student> students = studentDao.queryAll();
        for(Student student:students){
            System.out.println(student.getId()+" "+student.getName());
        }
    }


    @Test
    public void testInsert(){
        long id = 1003;
        String name = "王六";
        int value= studentDao.insertStudent(id,name);
        testQueryAll();
    }

    @Test
    public void testUpdate(){
        long id = 1000;
        String name = "老一";
        int value= studentDao.updateStudent(id,name);
        testQueryAll();
    }

    @Test
        public void testDelete(){
        long id = 1003;
        int value = studentDao.deleteStudent(id);
        testQueryAll();
    }

}
