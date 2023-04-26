package com.blog.api.module.essential.constants;

public enum FileType {

    THUMBNAIL("THUMBNAIL", "썸네일"),
    ARTICLE("ARTICLE", "게시글 첨부파일");


    private String type;
    private String description;

    FileType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
