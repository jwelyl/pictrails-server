package com.j3.pictrails.comment.entity;

import com.j3.pictrails.member.entity.Member;
import com.j3.pictrails.post.entity.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "COMMENT")
public class Comment {
  @Id
  private Long commentId;
  @ManyToOne
  @JoinColumn(name = "member_id")
  private Member member;
  @ManyToOne
  @JoinColumn(name = "post_id")
  private Post post;
  @NotNull
  private String commentContent;
}
