package com.study.sungjun.issue.controller

import com.study.sungjun.issue.domain.dto.request.IssueRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class IssueController {

    @PostMapping(name = "/issue")
    fun createIssue(
        @RequestBody
        issueRequestDto: IssueRequestDto
    ) {

    }

}