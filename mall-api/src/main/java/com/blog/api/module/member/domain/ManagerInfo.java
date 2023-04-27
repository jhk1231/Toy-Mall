package com.blog.api.module.member.domain;

import com.blog.api.module.model.BaseStatusModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 관리자 Table
 */
@Entity
@Table(name = "manager_info")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ManagerInfo extends BaseStatusModel {
}
