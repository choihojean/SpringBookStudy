package com.demo.dto;

public class PostDto {
    private int idx;

    private String title;

    private String image;

    private String content;

    private int price;

    private String seller;

    private String genre;

    public PostDto(int idx, String title, String image, String content, int price, String seller, String genre) {
        this.idx = idx;
        this.title = title;
        this.image = image;
        this.content = content;
        this.price = price;
        this.seller = seller;
        this.genre = genre;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", seller='" + seller + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
