package com.example.account_service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AccountDTO {
    private Long id;
    private String name;
    private String password;
    private String username;
    private Set<String> roles;
}
