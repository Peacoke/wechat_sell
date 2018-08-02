package com.work;

import com.work.pojo.Girl;
import com.work.service.GirlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Peacoke on 2018/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlSericeTest {

    private GirlService girlService = new GirlService() ;
    @Test
    public void findOneTest(){
       girlService.finOne(1001);

    }

}
