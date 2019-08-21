/* 清空RBAC权限模型表中数据（仅用于开发环境、测试环境） */

TRUNCATE TABLE tb_user;

TRUNCATE TABLE tb_role;

TRUNCATE TABLE tb_permission;

TRUNCATE TABLE tb_user_role;

TRUNCATE TABLE tb_role_permission;