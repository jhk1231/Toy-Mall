package com.store.api.module.member.domain;

import com.store.api.module.model.BaseEntity;
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
public class ManagerInfo extends BaseEntity {
}
