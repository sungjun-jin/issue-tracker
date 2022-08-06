package com.study.sungjun.issue.domain.entity.enums

/**
 * 이슈 타입 : BUG, TASK (default)
 */
enum class IssueType {

    BUG,
    TASK;

    companion object {
        operator fun invoke(type: String) = valueOf(type.uppercase()) //IssueType("BUG") 이렇게 사용 가능
    }
}
