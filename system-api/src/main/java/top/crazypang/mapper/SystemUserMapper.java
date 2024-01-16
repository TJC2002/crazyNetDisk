package top.crazypang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.crazypang.model.SystemUser;

/**
 * @description:
 * @author: crazyPang
 * @date: 2024/1/16 23:08
**/
@Mapper
public interface SystemUserMapper {
    public SystemUser selectSystemUser(@Param("userId") String userId);
}
