import dto.StudentDto;
import entity.StudentEntity;
import service.StudentService;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        StudentDto dto = new StudentDto("Stu 1", "Addrss 1", "HP", "ProBook", 1);
        StudentService studentService  = new StudentService();
        String resp = studentService.saveStudent(dto);
        System.out.println(resp);
    }
}
