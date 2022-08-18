-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hulk_store_dev
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `hulk_store_dev` ;

-- -----------------------------------------------------
-- Schema hulk_store_dev
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hulk_store_dev` DEFAULT CHARACTER SET utf8mb3 ;
USE `hulk_store_dev` ;

-- -----------------------------------------------------
-- Table `hulk_store_dev`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`users` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`users` (
  `id_user` BIGINT NOT NULL AUTO_INCREMENT,
  `nick_name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hulk_store_dev`.`invoices`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`invoices` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`invoices` (
  `id_invoice` BIGINT NOT NULL AUTO_INCREMENT,
  `reference` VARCHAR(255) NOT NULL,
  `is_selling` TINYINT NULL DEFAULT 0,
  `buyer` BIGINT NOT NULL,
  `seller` BIGINT NOT NULL,
  PRIMARY KEY (`id_invoice`),
  INDEX `fk_invoices_users1_idx` (`buyer` ASC) VISIBLE,
  INDEX `fk_invoices_users2_idx` (`seller` ASC) VISIBLE,
  CONSTRAINT `fk_invoices_users1`
    FOREIGN KEY (`buyer`)
    REFERENCES `hulk_store_dev`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoices_users2`
    FOREIGN KEY (`seller`)
    REFERENCES `hulk_store_dev`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hulk_store_dev`.`persons`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`persons` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`persons` (
  `id_person` BIGINT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `identification` VARCHAR(45) NOT NULL,
  `id_user` BIGINT NOT NULL,
  PRIMARY KEY (`id_person`),
  INDEX `fk_persons_users1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_persons_users1`
    FOREIGN KEY (`id_user`)
    REFERENCES `hulk_store_dev`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hulk_store_dev`.`products`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`products` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`products` (
  `id_product` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `reference` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_product`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hulk_store_dev`.`payments`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`payments` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`payments` (
  `id_payment` BIGINT NOT NULL AUTO_INCREMENT,
  `number` VARCHAR(255) NOT NULL,
  `cvc` VARCHAR(255) NOT NULL,
  `id_user` BIGINT NOT NULL,
  PRIMARY KEY (`id_payment`),
  INDEX `fk_payments_users1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_payments_users1`
    FOREIGN KEY (`id_user`)
    REFERENCES `hulk_store_dev`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hulk_store_dev`.`invoices_has_products`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hulk_store_dev`.`invoices_has_products` ;

CREATE TABLE IF NOT EXISTS `hulk_store_dev`.`invoices_has_products` (
  `id_invoice` BIGINT NOT NULL,
  `id_product` BIGINT NOT NULL,
  `count` INT NOT NULL,
  `selled` INT NULL,
  `value` DECIMAL(32,2) NOT NULL,
  PRIMARY KEY (`id_invoice`, `id_product`),
  INDEX `fk_invoices_has_products_products1_idx` (`id_product` ASC) VISIBLE,
  INDEX `fk_invoices_has_products_invoices1_idx` (`id_invoice` ASC) VISIBLE,
  CONSTRAINT `fk_invoices_has_products_invoices1`
    FOREIGN KEY (`id_invoice`)
    REFERENCES `hulk_store_dev`.`invoices` (`id_invoice`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoices_has_products_products1`
    FOREIGN KEY (`id_product`)
    REFERENCES `hulk_store_dev`.`products` (`id_product`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
