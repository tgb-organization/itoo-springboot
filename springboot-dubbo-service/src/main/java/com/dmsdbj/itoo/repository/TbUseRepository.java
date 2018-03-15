package com.dmsdbj.itoo.repository;

import com.dmsdbj.itoo.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TbUseRepository extends JpaRepository<TbUser,Long> {


}
