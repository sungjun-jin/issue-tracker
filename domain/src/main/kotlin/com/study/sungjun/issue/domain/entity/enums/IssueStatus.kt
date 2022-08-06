package com.study.sungjun.issue.domain.entity.enums

/**
 * 이슈 진행상태 : 할일 (default), 진행중, 완료
 */
enum class IssueStatus {
    TODO,
    IN_PROGRESS,
    RESOLVED;

    companion object {

        operator fun invoke(type: String) = valueOf(type.uppercase())

    }
}
