package com.study.sungjun.issue.domain.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {

    @CreatedDate // Entity가 생성이 될 때 자동으로 값을 넣어줌
    var createdAt: LocalDateTime? = null

    @LastModifiedDate // 수정될 때 마다 수정시간이 저장된다
    var updatedAt: LocalDateTime? = null
}