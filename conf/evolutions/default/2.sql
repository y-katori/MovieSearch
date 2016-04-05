# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

CREATE TABLE IF NOT EXISTS `ranking` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `rank` INT(11) DEFAULT 0,
  `title` VARCHAR(255),
  `thumbnail_url` TEXT,
  `distribution` VARCHAR(255),
  `del_flg` TINYINT NOT NULL DEFAULT 0,
  `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB
COMMENT = 'ランキング';

# --- !Downs

drop table ranking;