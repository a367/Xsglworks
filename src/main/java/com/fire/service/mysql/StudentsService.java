package com.fire.service.mysql;
import com.fire.util.Page;
import com.fire.bean.Students;
import com.fire.dao.StudentsMapper;
import com.fire.util.SystemMethodLog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;
    @SystemMethodLog(describe = "学生查询")
    public Page selectStudent(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<Students> students=studentsMapper.selectStudent();
        PageInfo pageInfo=new PageInfo(students);
        return new Page(pageInfo);
    }
    public Integer deletestu(Integer id){
        return studentsMapper.deletestu(id);
    }
    /**
     * 查询学生,导出excel
     * @return
     */
    public List<Students> downloadForExcel() {
        return studentsMapper.selectStudent();
    }
    public Page batchStudents(List<Students> students) {
        boolean flag = true;
        for (Students s : students){
            Integer count = studentsMapper.insertSelective(s);
            if(count<1) {
                flag = false;
            }
        }
        Page page = flag ? new Page(200):new Page(500);
        return page;
    }
    public Integer insertSelective(Students record){
        return  studentsMapper.insertSelective(record);
    }
}
