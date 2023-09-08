
package com.prodapt.learningspring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prodapt.learningspring.entity.Comments;

public interface commentCRUDRepository extends CrudRepository<Comments, Integer>{
	

	  @Query(value = "select count(*) from CommentRecord c where c.commentId.post.id = ?1", nativeQuery=true)
	  Integer countByPostId(Integer postId);
	  
}
