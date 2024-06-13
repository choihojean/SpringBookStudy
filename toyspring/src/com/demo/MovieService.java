package com.demo;

import com.demo.dto.PostDto;
import com.demo.dto.ReviewDto;
import com.spring.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface MovieService {
    public ArrayList<MovieDto> select();
    public MovieDto  read(int idx);
    public int count();
    public void upload(String title, String image, String content, int price, String seller, String genre);
    public void update(int idx, String title, String image, String content, int price, String seller, String genre);
    public void delete(int idx);
    public List<PostDto> selectPost();
    public PostDto readPost(int idx);
    public int countPost();
    public ArrayList<ReviewDto> selectReview();
    public int avgRating(String seller);
}
