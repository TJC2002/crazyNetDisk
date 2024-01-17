package top.crazypang.mapperTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.crazypang.SystemApplicationApi;
import top.crazypang.mapper.SystemUserMapper;

import javax.annotation.Resource;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.mapperTest
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  23:49
 * @Description: TODO
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SystemApplicationApi.class)
public class SystemUserMapperTest {

    @Resource
    SystemUserMapper systemUserMapper;
    @Test
    public void selectSystemUser(){
        System.out.println(systemUserMapper.selectSystemUser("1"));
    }
}
