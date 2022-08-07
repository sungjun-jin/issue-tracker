package com.study.sungjun.issue.exception

import com.study.sungjun.issue.domain.dto.exception.ErrorResponseDto
import com.study.sungjun.issue.domain.exception.ServerException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ServerException::class)
    fun handleServerException(ex: ServerException): ErrorResponseDto {

        return ErrorResponseDto(ex.code, ex.message)
    }

    @ExceptionHandler(Exception::class)
    fun handleException(ex: ServerException): ErrorResponseDto {
        // return ErrorResponseDto(500, ex.message!!)
        // 500에러는 서버에서 발생한 stack trace를 그대로 노출시키면 보안에 취약할 수
        // 있기 때문에 정해진 메세지를 클라이언트에게 리턴해주도록 한다.

        return ErrorResponseDto(500, "Internal Server Error")
    }
}