package com.j3.pictrails.member.entity;

import com.j3.pictrails.follow.entity.Follow;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
@Getter
@Setter
public class Member {
  @Id
  private Long memberId;
  @Column(unique = true)
  private String userId;
  private String password;
  @Column(unique = true)
  private String nickname;  //  일단 고유하게 설정, Hash로 구분 등 추가 논의
  private String profileImageUrl; //  S3 url
  @NotNull
  private Integer followerCount = 0;  //  나를 팔로우한 사람 수
  @NotNull
  private Integer followingCount = 0; //  내가 팔로우한 사람 수
  @OneToMany(mappedBy = "fromMember")
  private List<Follow> followings = new ArrayList<>();
  @OneToMany(mappedBy = "toMember")
  private List<Follow> followers = new ArrayList<>();
}
