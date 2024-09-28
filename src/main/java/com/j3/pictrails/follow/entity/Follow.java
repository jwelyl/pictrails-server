package com.j3.pictrails.follow.entity;

import com.j3.pictrails.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FOLLOW")
public class Follow {
  @Id
  private Long followId;
  @ManyToOne
  @JoinColumn(name = "from_member_id")
  private Member fromMember;
  @ManyToOne
  @JoinColumn(name = "to_member_id")
  private Member toMember;
}
