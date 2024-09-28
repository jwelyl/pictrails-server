package com.j3.pictrails.post.entity;

import com.j3.pictrails.comment.entity.Comment;
import com.j3.pictrails.member.entity.Member;
import com.j3.pictrails.picture.entity.Picture;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "POST")
@Getter
@Setter
public class Post {
  @Id
  private Long postId;
  @ManyToOne
  @JoinColumn(name = "member_id")
  private Member member;
  @Column(length = 10_000)
  private String postContent;
  private Double repLatitude;
  private Double repLongitude;
  @NotNull
  private Long repPictureId;
  @OneToMany(mappedBy = "post")
  private List<Picture> pictures = new ArrayList<>();
  @OneToMany(mappedBy = "post")
  private List<Comment> comments = new ArrayList<>();

}
