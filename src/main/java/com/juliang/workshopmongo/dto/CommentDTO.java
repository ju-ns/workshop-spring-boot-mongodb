package com.juliang.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CommentDTO implements Serializable {
    private String text;
    private Date date;
    private AuthorDTO authorDTO;


    public CommentDTO() {
    }

    public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
        this.text = text;
        this.date = date;
        this.authorDTO = authorDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }
}
