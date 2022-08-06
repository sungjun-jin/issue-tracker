package com.study.sungjun.issue.domain.entity

import com.study.sungjun.issue.domain.entity.enums.IssueStatus
import com.study.sungjun.issue.domain.entity.enums.IssueType
import com.study.sungjun.issue.domain.entity.enums.PriorityType
import javax.persistence.*

/**
 * 이슈 테이블 설계
    - 제목
    - 이슈 타입 : BUG, TASK (default)
    - 이슈 진행상태 : 할일 (default), 진행중, 완료
    - 우선순위 : 낮음, 보통, 높음
    - 내용
    - 리포터
    - 접수일시
- 수정일시
**/

@Entity
@Table(name = "issue")
class Issue: BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(name = "user_id")
    val userId: Long? = null

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    val type: String = IssueType.BUG.name

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    val status: String = IssueStatus.TODO.name

    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    val priority: String = PriorityType.LOW.name

    @Column(name = "description")
    val description: String? = null

}