create database wisdomFarm;

use  wisdomFarm;

DROP TABLE IF EXISTS `environment_record`;
CREATE TABLE `environment_record` (
    `timeStamp` DATETIME NOT NULL,
    `temperature` DOUBLE NOT NULL,
    `humidity` DOUBLE NOT NULL,
    `carbonDioxide` DOUBLE NOT NULL,
    `illuminance` DOUBLE NOT NULL,
    `soilTempe` DOUBLE NOT NULL,
    `soilHumid` DOUBLE NOT NULL,
    PRIMARY KEY (`timeStamp`)
)  CHARACTER SET=UTF8;
