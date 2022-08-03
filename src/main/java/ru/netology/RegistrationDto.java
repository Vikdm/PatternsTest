package ru.netology;

import lombok.Data;

@Data
    public class RegistrationDto {
        private final String name;
        private final String password;
        private final String status;
    }
