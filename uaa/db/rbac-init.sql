/* RBAC权限模型初始化测试数据（仅用于开发环境、测试环境） */

INSERT INTO `tb_user` (
	`id`,
	`username`,
	`password`,
	`phone`,
	`email`,
	`created`,
	`updated`
)
VALUES
	(
		37,
		'admin',
		'$2a$10$9ZhDOBp.sRKat4l14ygu/.LscxrMUcDAfeVOEPiYwbcRkoB09gCmi',
		'18034466591',
		'iamwanglibing@qq.com',
		'2019-08-21 09:11:30',
		'2019-08-21 09:11:30'
	);



INSERT INTO `tb_role` (
	`id`,
	`parent_id`,
	`name`,
	`enname`,
	`description`,
	`created`,
	`updated`
)
VALUES
	(
		37,
		0,
		'超级管理员',
		'admin',
		NULL,
		'2019-08-21 09:11:30',
		'2019-08-21 09:11:30'
	);


insert  into `tb_permission`(`id`,`parent_id`,`name`,`enname`,`url`,`description`,`created`,`updated`) values
(37,0,'系统管理','System','/',NULL,'2019-04-04 23:22:54','2019-04-04 23:22:56'),
(38,37,'用户管理','SystemUser','/users/',NULL,'2019-08-21 09:11:30','2019-08-21 09:11:30'),
(39,38,'查看用户','SystemUserView','',NULL,'2019-08-21 09:11:30','2019-04-04 15:30:43'),
(40,38,'新增用户','SystemUserInsert','',NULL,'2019-08-21 09:11:30','2019-08-21 09:11:30'),
(41,38,'编辑用户','SystemUserUpdate','',NULL,'2019-08-21 09:11:30','2019-08-21 09:11:30'),
(42,38,'删除用户','SystemUserDelete','',NULL,'2019-08-21 09:11:30','2019-08-21 09:11:30');


insert  into `tb_user_role`(`id`,`user_id`,`role_id`) values
(37,37,37);


insert  into `tb_role_permission`(`id`,`role_id`,`permission_id`) values
(37,37,37),
(38,37,38),
(39,37,39),
(40,37,40),
(41,37,41),
(42,37,42);