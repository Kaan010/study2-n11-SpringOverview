package com.example.kkalanhw2.dto;

public class CategoryDto {

    private Long id;
    private String name;
    private Long level;
    private Long parentLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getParentLevel() {
        return parentLevel;
    }

    public void setParentLevel(Long parentLevel) {
        this.parentLevel = parentLevel;
    }
}
