package com.movieonline.Online.Movie.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

@AllArgsConstructor
@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/api/v1/onlinemovie/login"
                                        , "/api/v1/onlinemovie/register"
                                        , "/login"
                                        , "/register"
                                        , "/index"
                                        , "/asset/**"
                                        ,"/image/**"
                                        ,"/video/**").permitAll()
                                .anyRequest().authenticated()

                )
                .logout(logout -> logout.logoutUrl("/api/v1/onlinemovie/logout").logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler()));

        return http.build();
    }
}
