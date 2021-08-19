package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.manytomany.Like;
import com.germanfica.accessingdatamysql.embeddable.LikeId;
import org.springframework.data.repository.CrudRepository;

public interface LikeRepository extends CrudRepository<Like, LikeId>{

}
