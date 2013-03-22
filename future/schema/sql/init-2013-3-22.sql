SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

SHOW WARNINGS;
CREATE SCHEMA IF NOT EXISTS `future` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
SHOW WARNINGS;
USE `future` ;

-- -----------------------------------------------------
-- Table `future`.`tb_tp_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `future`.`tb_tp_user` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `future`.`tb_tp_user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT ,
  `uid` BIGINT NOT NULL ,
  `tp_id` BIGINT NOT NULL ,
  `tp_identity` VARCHAR(100) NOT NULL ,
  `auth_info` VARCHAR(800) NOT NULL ,
  `create_time` DATETIME NOT NULL ,
  `last_modify_time` DATETIME NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

SHOW WARNINGS;
CREATE UNIQUE INDEX `uidx_uid_tpid` ON `future`.`tb_tp_user` (`uid` ASC, `tp_id` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `future`.`tb_thirdparty`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `future`.`tb_thirdparty` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `future`.`tb_thirdparty` (
  `id` BIGINT NOT NULL ,
  `name` VARCHAR(45) NOT NULL ,
  `app_id` VARCHAR(45) NOT NULL ,
  `app_key` VARCHAR(45) NOT NULL ,
  `app_secret` VARCHAR(45) NOT NULL ,
  `app_url` VARCHAR(100) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci, 
COMMENT = '第三方平台' ;

SHOW WARNINGS;
CREATE UNIQUE INDEX `uidx_name_jointype` ON `future`.`tb_thirdparty` (`name` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `future`.`tb_passport`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `future`.`tb_passport` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `future`.`tb_passport` (
  `id` BIGINT NOT NULL AUTO_INCREMENT ,
  `login_name` VARCHAR(100) NOT NULL ,
  `email` VARCHAR(100) NULL ,
  `email_active` TINYINT(1) NOT NULL DEFAULT 0 ,
  `password` VARCHAR(100) NOT NULL ,
  `admin` TINYINT(1) NOT NULL DEFAULT 0 ,
  `device_name` VARCHAR(20) NOT NULL DEFAULT 'browser' COMMENT '设备名字' ,
  `last_login_time` DATETIME NULL ,
  `create_time` DATETIME NOT NULL ,
  `last_modify_time` DATETIME NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci, 
COMMENT = '用户通行证' ;

SHOW WARNINGS;
CREATE UNIQUE INDEX `uidx_loginname` USING BTREE ON `future`.`tb_passport` (`login_name` ASC) ;

SHOW WARNINGS;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
