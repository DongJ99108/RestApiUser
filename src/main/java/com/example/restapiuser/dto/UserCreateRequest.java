package com.example.restapiuser.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// record는 생성자를 만들어준다.
//          getUserid() -> user() 를 만든다. : getter 역할 수행
//          setter는 안만들어준다.
public record UserCreateRequest(
        @NotBlank(message = "아이디는 필수입니다.")
        @Size(max = 50, message = "아이디는 최대 50자입니다.")
        String userid,

        @NotBlank(message = "비밀번호도 필수입니다.")
        @Size(max = 100, message = "비밀번호는 최대 100자입니다.")
        String passwd,

        @NotBlank(message = "이름도 필수입니다. 제발 적어주세요")
        @Size(max = 100, message = "이메일은 최대 100자입니다.")
        String username,

        @Email(message = "이메일 형식이 올바르지 않습니다.")
        @Size(max = 200, message = "이메일은 최대 200자입니다.")
        String email
) {}
