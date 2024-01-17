package top.crazypang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.crazypang.model.SystemUser;

import java.util.List;

/**
 * @description:
 * @author: crazyPang
 * @date: 2024/1/16 23:08
**/
@Mapper
public interface SystemUserMapper {
    public List<SystemUser> selectSystemUser(@Param("userId") String userId);
}
