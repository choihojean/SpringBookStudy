package com.demo.dto;

public class ReviewDto {
    private int idx;
    private String text;
    private int rating;
    private String writer;
    private String seller;

    public ReviewDto(int idx, String text, int rating, String writer, String seller) {
        this.idx = idx;
        this.text = text;
        this.rating = rating;
        this.writer = writer;
        this.seller = seller;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }


    @Override
    public String toString() {
        return "ReviewDto{" +
                "idx=" + idx +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", writer='" + writer + '\'' +
                ", seller='" + seller + '\'' +
                '}';
    }
}
