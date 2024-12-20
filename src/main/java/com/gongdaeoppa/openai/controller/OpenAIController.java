package com.gongdaeoppa.openai.controller;

import com.gongdaeoppa.openai.service.OpenAIService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/openai")
public class OpenAIController {
    
    private final OpenAIService openAIService;
    
    @GetMapping("/chat")
    public String chatWithAI(@RequestParam(value = "prompt", defaultValue = "Tell me a joke") String prompt) {
        return openAIService.getAIResponse(prompt);
    }
}
