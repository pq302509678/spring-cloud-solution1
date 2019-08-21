package com.wanglibing.uaa.mapper;

import com.wanglibing.uaa.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {

    /**
     * 根据userId获取用户的权限
     * @param userId
     * @return
     */
    @Select("SELECT\n" +
            "\tp.*\n" +
            "FROM\n" +
            "\ttb_user AS u\n" +
            "LEFT JOIN tb_user_role AS ur ON u.id = ur.user_id\n" +
            "LEFT JOIN tb_role AS r ON r.id = ur.role_id\n" +
            "LEFT JOIN tb_role_permission rp ON rp.role_id = r.id\n" +
            "LEFT JOIN tb_permission p ON p.id = rp.permission_id\n" +
            "WHERE\n" +
            "\tu.id = #{userId}")
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}