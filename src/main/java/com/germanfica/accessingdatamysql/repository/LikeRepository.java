package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.manytomany.Like;
import com.germanfica.accessingdatamysql.embeddable.LikeId;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LikeRepository extends CrudRepository<Like, LikeId>{
//    @Query("select p.id from #{#user} p")
//    Iterable<Like> findAllWithIdOnly(User user);
    Iterable<Like> findAllByIdIn(List<LikeId> ids);

    Iterable<Object> findAllByUserId(Integer userId);

}
