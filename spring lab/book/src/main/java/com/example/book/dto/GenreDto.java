package com.example.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GenreDto {
    private UUID id;
    private String name;
}
