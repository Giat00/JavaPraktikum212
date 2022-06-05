/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  GIAT
 * Created: Jun 5, 2022
 */
CREATE TABLE `db_212praktek6a`.`pengguna` ( `id` INT NOT NULL AUTO_INCREMENT , `username` VARCHAR(255) NOT NULL , `password` VARCHAR(255) NOT NULL , `namaLengkap` VARCHAR(255) NOT NULL , `level` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

INSERT INTO `pengguna` (`id`, `username`, `password`, `namaLengkap`, `level`) VALUES
(NULL, 'admin', MD5('admin123'), 'Saya Admin', 'admin'),
(NULL, 'user1', MD5('user1'), 'Saya User 1', 'user');


