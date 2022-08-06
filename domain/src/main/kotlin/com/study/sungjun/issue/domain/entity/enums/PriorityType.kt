package com.study.sungjun.issue.domain.entity.enums

/**
 * 우선순위 : 낮음, 보통, 높음
 */
enum class PriorityType {
    LOW,
    MID,
    HIGH;

    companion object {

        operator fun invoke(type: String) = valueOf(type.uppercase())

    }
}
