create database if not exists rede_livraria;

-- -----------------------------------------------------
-- Table `rede_livraria`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rede_livraria`.`autor` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `rede_livraria`.`editora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rede_livraria`.`editora` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `rede_livraria`.`livraria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rede_livraria`.`livraria` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idLivraria_UNIQUE` (`id` ASC) VISIBLE);


-- -----------------------------------------------------
-- Table `rede_livraria`.`livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rede_livraria`.`livro` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `avaliacao` INT NULL DEFAULT NULL,
  `idLivraria` INT UNSIGNED NOT NULL,
  `idEditora` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`, `idLivraria`, `idEditora`),
  UNIQUE INDEX `idLivro_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_Livro_Livraria_idx` (`idLivraria` ASC) VISIBLE,
  INDEX `fk_livro_editora1_idx` (`idEditora` ASC) VISIBLE,
  CONSTRAINT `fk_Livro_Livraria`
    FOREIGN KEY (`idLivraria`)
    REFERENCES `rede_livraria`.`livraria` (`id`),
  CONSTRAINT `fk_livro_editora1`
    FOREIGN KEY (`idEditora`)
    REFERENCES `rede_livraria`.`editora` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `rede_livraria`.`livro_has_autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rede_livraria`.`livro_has_autor` (
  `idLivro` INT UNSIGNED NOT NULL,
  `idAutor` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idLivro`, `idAutor`),
  INDEX `fk_Livro_has_Autor_Autor1_idx` (`idAutor` ASC) VISIBLE,
  INDEX `fk_Livro_has_Autor_Livro1_idx` (`idLivro` ASC) VISIBLE,
  CONSTRAINT `fk_Livro_has_Autor_Autor1`
    FOREIGN KEY (`idAutor`)
    REFERENCES `rede_livraria`.`autor` (`id`),
  CONSTRAINT `fk_Livro_has_Autor_Livro1`
    FOREIGN KEY (`idLivro`)
    REFERENCES `rede_livraria`.`livro` (`id`));
