package com.j3.pictrails.picture.entity;

import com.j3.pictrails.post.entity.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "PICTURE")
public class Picture {
  @Id
  private Long pictureId;
  @ManyToOne
  @JoinColumn(name = "post_id")
  private Post post;
  private Double latitude;
  private Double longitude;
  private String pictureContent;
  @NotNull
  private String url;
  @NotNull
  private String thumbnailUrl;
}
