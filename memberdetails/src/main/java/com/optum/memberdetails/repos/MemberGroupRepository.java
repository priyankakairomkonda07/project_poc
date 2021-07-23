package com.optum.memberdetails.repos;

import com.optum.memberdetails.entities.MemberGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberGroupRepository extends JpaRepository<MemberGroup, Integer> {

//    @Query("select l from membergroup l,member m where l.memgroupid = m.memgroupid")
//    public List<MemberGroup> findBysearchid();

}