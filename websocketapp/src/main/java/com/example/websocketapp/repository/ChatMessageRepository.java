package com.example.websocketapp.repository;

import com.example.websocketapp.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
}
