package test;

import org.junit.Test;

import java.util.*;

public class Testpeople {
    @Test
    public void testpeople(){
      List set= new ArrayList();
        set.add("今天是");
        set.add("星期四");
        set.add("我已经");
        set.add(20);
        set.add("岁啦");
        people p1= new people("离家","男",45 );
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(p1);
    }
}
