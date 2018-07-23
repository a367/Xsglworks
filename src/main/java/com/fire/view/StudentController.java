package com.fire.view;
import com.fire.util.Page;
import com.fire.service.mysql.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/student",name = "学生查询")
public class StudentController {
    @Autowired
    StudentsService studentsService;
    @GetMapping(value = "/query",name = "全部学生")
    public Page studentquery(Integer page, Integer limit){
        return studentsService.selectStudent(page,limit);
    }

//    @GetMapping(value = "/some",name = "该咨询师的学生")
//    public Page studentByAskID(Integer page,Integer limit,String askerId){
//        System.out.println(askerId);
//        return studentsService.studentByAskID(page,limit,askerId);
//    }

    @GetMapping("/deletestu")
    public Integer deletestu(Integer id){
        return studentsService.deletestu(id);
    }
}
