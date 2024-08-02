package site.lawmate.admin.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import site.lawmate.admin.domain.dto.LoginDTO;
import site.lawmate.admin.domain.dto.PrincipalUserDetails;
import site.lawmate.admin.service.LoginService;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final LoginService loginService;

    @PostMapping("/login")
    public Mono<PrincipalUserDetails> login(@RequestBody LoginDTO admin) {
        log.info("admin: {}", admin.getEmail());
        return loginService.login(admin);
    }
}
