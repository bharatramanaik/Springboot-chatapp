package com.chat.chatapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private Long Id;
    private String sender;
    private String content;
}
