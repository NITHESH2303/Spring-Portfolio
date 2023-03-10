package com.example.nitheshportfolio.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.stream.Collectors;

public class CustomUserDetails {
    private String username;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;

    public CustomUserDetails(){

    }
    public CustomUserDetails(UserDetails userDetails){
        this.username = userDetails.getAuthDetail().getUsername();
        this.password = userDetails.getAuthDetail().getPassword();
        this.active = true;
        this.authorities = userDetails.getRoles().stream().map(
                (Roles role) -> new SimpleGrantedAuthority(role.toString())
                        .collect(Collectors.toList());
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return authorities;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return active;
    }
}
