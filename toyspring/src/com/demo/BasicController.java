package com.demo;


import com.demo.dto.PostDto;
import com.demo.dto.ReviewDto;
import com.spring.Autowired;
import com.spring.Controller;
import com.spring.RequestMapping;
import com.spring.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BasicController {

    @Autowired
    private MovieService service;

    public BasicController() {
        System.out.println("BasicController 객체 생성");
    }

    @RequestMapping("/count")
    @ResponseBody
    public String count(Map<String, String> param, Map<String, Object> model) {
        return  "count=" + service.count();
    }

    @RequestMapping("/list")
    public String list(Map<String, String> param, Map<String, Object> model) {
        List<MovieDto> movies = service.select();
        for(int i = 0; i < movies.size(); i++) {
            model.put("idx" + i, movies.get(i).getIdx());
            model.put("title" + i, movies.get(i).getTitle());
            model.put("image" + i, movies.get(i).getImage());
        }
        return  "list";
    }

    @RequestMapping("/read")
    public String read(Map<String, String> param, Map<String, Object> model) {
        int idx = Integer.parseInt(param.get("idx"));


        MovieDto movie = service.read(idx);

        model.put("idx", movie.getIdx());
        model.put("title", movie.getTitle());
        model.put("image", movie.getImage());
        model.put("content", movie.getContent());
        return  "read";
    }

    @RequestMapping("/uploading")
    public String uploading(Map<String, String> param, Map<String, Object> model){

        service.upload(param.get("title"), param.get("image"), param.get("content"), Integer.parseInt(param.get("price")), param.get("seller"), param.get("genre"));

        model.put("count", service.countPost());
        List<PostDto> posts = service.selectPost(); //<PostDto>.posts 로 변경
        for(int i = 0; i < posts.size(); i++) {
            model.put("idx" + i, posts.get(i).getIdx());
            model.put("title" + i, posts.get(i).getTitle());
            model.put("image" + i, posts.get(i).getImage());
        }
        return "shop";
    }

    @RequestMapping("/update")
    public String update(Map<String, String> param, Map<String, Object> model){

        model.put("idx", param.get("idx"));
//        model.put("title", param.get("title"));
//        model.put("image", param.get("image"));
//        model.put("content", param.get("content"));
//        model.put("price", param.get("price"));
//        model.put("seller", param.get("seller"));
//        model.put("genre", param.get("genre"));

        return "update";
    }

    @RequestMapping("/updating")
    public String updating(Map<String, String> param, Map<String, Object> model){

        service.update(Integer.parseInt(param.get("idx")), param.get("title"), param.get("image"), param.get("content"), Integer.parseInt(param.get("price")), param.get("seller"), param.get("genre"));

        model.put("count", service.countPost());
        List<PostDto> posts = service.selectPost(); //<PostDto>.posts 로 변경
        for(int i = 0; i < posts.size(); i++) {
            model.put("idx" + i, posts.get(i).getIdx());
            model.put("title" + i, posts.get(i).getTitle());
            model.put("image" + i, posts.get(i).getImage());
        }
        return "shop";
    }

    @RequestMapping("/delete")
    public String delete(Map<String, String> param, Map<String, Object> model){
        service.delete(Integer.parseInt(param.get("idx")));
        model.put("count", service.countPost());
        List<PostDto> posts = service.selectPost(); //<PostDto>.posts 로 변경
        for(int i = 0; i < posts.size(); i++) {
            model.put("idx" + i, posts.get(i).getIdx());
            model.put("title" + i, posts.get(i).getTitle());
            model.put("image" + i, posts.get(i).getImage());
        }

        return "shop";
    }

    @RequestMapping("/shop")
    public String shop(Map<String, String> param, Map<String, Object> model) {
        model.put("count", service.countPost());
        List<PostDto> posts = service.selectPost(); //<PostDto>.posts 로 변경
        for(int i = 0; i < posts.size(); i++) {
            model.put("idx" + i, posts.get(i).getIdx());
            model.put("title" + i, posts.get(i).getTitle());
            model.put("image" + i, posts.get(i).getImage());
        }

        return  "shop";
    }

    @RequestMapping("/post")
    public String post(Map<String, String> param, Map<String, Object> model) {
        int idx = Integer.parseInt(param.get("idx"));


        PostDto post = service.readPost(idx);

        model.put("idx", post.getIdx());
        model.put("title", post.getTitle());
        model.put("image", post.getImage());
        model.put("content", post.getContent());
        model.put("price", post.getPrice());
        model.put("seller",post.getSeller());
        model.put("genre",post.getGenre());
        return  "post";
    }

    @RequestMapping("/review")
    public String review(Map<String, String> param, Map<String, Object> model) {
        String seller = param.get("seller");    // seller
        int count = 0;

        List<ReviewDto> reviews = service.selectReview();
        for (int i = 0; i < reviews.size(); i++)    // seller idx 에 부합하는 리뷰 본문
            if (reviews.get(i).getSeller().equals(seller)) {
                model.put("writer" + count, reviews.get(i).getWriter());
                model.put("rating" + count, reviews.get(i).getRating());
                model.put("text" + count, reviews.get(i).getText());
                count++;
            }

        model.put("seller", seller);   // 판매자 번호
        model.put("avgRating", service.avgRating(seller));   // 평균 별점
        model.put("count", count);  // 리뷰 개수

        return "review";
    }
}