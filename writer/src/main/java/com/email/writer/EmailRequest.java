package com.email.writer;


import lombok.Data;

@Data
public class EmailRequest {
    private String content;

    private String tone;
}
