package com.optum.memberdetails.repos;

import com.optum.memberdetails.entities.MemberG;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberG, Integer> {

    @Query("select count(m) from memberg m where m.membergroup.memgroupid = ?1")
    public long  findBysearchmemgroupid(int searchmemgroupid);
}

