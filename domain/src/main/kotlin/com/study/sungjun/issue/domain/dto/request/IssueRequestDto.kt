package com.study.sungjun.issue.domain.dto.request

import com.study.sungjun.issue.domain.entity.enums.IssueStatus
import com.study.sungjun.issue.domain.entity.enums.IssueType
import com.study.sungjun.issue.domain.entity.enums.PriorityType

data class IssueRequestDto(

    val userId: Long,

    val type: IssueType,

    val status: IssueStatus,

    val priority: PriorityType,

    val description: String? = null,

    )
