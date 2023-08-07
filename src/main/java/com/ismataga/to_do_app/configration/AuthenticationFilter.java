package com.ismataga.to_do_app.configration;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthenticationFilter  extends UsernamePasswordAuthenticationFilter {
//   @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response){
//       String username = this.obtainUsername(request);
//       username = username != null ? username.trim() : "";
//       String password = this.obtainPassword(request);
//       password = password != null ? password : "";
//
//       //TODO loadUserByUsername
//       //TODO check user password
//       //TODO load permission
//       //TODO build JWT token
//       UsernamePasswordAuthenticationToken authRequest = UsernamePasswordAuthenticationToken.unauthenticated(username, password);
//
    }

