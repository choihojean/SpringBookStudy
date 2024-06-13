package com.demo;


import com.demo.dto.PostDto;
import com.demo.dto.ReviewDto;
import com.spring.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MovieServiceImpl implements  MovieService{

    int i = 9;

    private ArrayList<MovieDto> db = new ArrayList<>();

    private ArrayList<PostDto> post = new ArrayList<>();

    private ArrayList<ReviewDto> review = new ArrayList<>();

    public MovieServiceImpl() {
        System.out.println("MovieServiceImpl 객체 생성");
        db.add(new MovieDto(5, "선다운", "movie5.jpg", "영화 내용 \n선다운"));
        db.add(new MovieDto(6, "노스맨", "movie6.jpg", "영화 내용 \n노스맨"));
        db.add(new MovieDto(7,  "콘서트", "movie7.jpg", "영화 내용 \n콘서트"));
        db.add(new MovieDto(8, "K클래식", "movie8.jpg", "영화 내용 \nK클래식"));
        post.add(new PostDto(1, "1984", "book1.jpg", "책 소개 \n『동물농장』과 함께 조지 오웰을 대표하는 작품으로, 전제주의라는 거대한 지배 시스템 앞에 놓인 한 개인이 어떻게 저항하다가 어떻게 파멸해 가는지, 그 과정과 양상, 그리고 배후를 적나라하게 보여주는 디스토피아 소설이다. 작품의 무대인 오세아니아는 전체주의의 극한적인 양상을 띠고 있는 나라. 오세아니아의 정치 통제 기구인 당은 허구적 인물인 빅 브라더를 내세워 독재 권력의 극대화를 꾀하는 한편, 정치 체제를 항구적으로 유지하기 위해 텔레스크린, 사상경찰, 마이크로폰, 헬리콥터 등을 이용하여 당원들의 사생활을 철저하게 감시한다. 당의 정당성을 획득하는 것과 동시에 당원들의 사상적인 통제를 위해 과거의 사실을 끊임없이 날조하고, 새로운 언어인 신어를 창조하여 생각과 행동을 속박함은 물론, 인간의 기본적인 욕구인 성욕까지 통제한다.\n" +
                "\n" +
                "주인공 윈스턴 스미스는 이런 당의 통제에 반발을 느끼고 저항을 꾀하지만, 오히려 함정에 빠져 사상경찰에 체포되고, 혹독한 고문 끝에 존재하지도 않는 인물 '골드스타인'을 만났다고 자백하고, 결국 당이 원하는 것을 아무런 저항 없이 받아들이는 무기력한 인간으로 전락한다.",
                13320, "choi", "소설") );
        post.add(new PostDto(2, "그리고 아무도 없었다", "book2.jpg", "책 소개 \n열 개의 인디언 인형이 사라진다!\n" +
                "인디언 섬에 초대받은 여덟명의 손님과 그곳에 있는 하인부부. 모두들 떳떳치 못한 그들이 한명씩 죽을때마다 식탁위의 '열 명의 인디언 소년' 인형이 하나씩 사라진다. 한 명 한 명씩 차례로 모두가 죽어가는 상황. 과연 범인은 누구일까?\n" +
                "\n" +
                "추리소설보다는 공포소설에 가까울 정도로 보는이의 가슴을 죄는 애거서 크리스티의 걸작 추리소설로 단서는 열 개의 인디언 인형에 있다.",
                9000, "hwang", "소설"));
        post.add(new PostDto(3, "코스모스", "book3.jpg", "책 소개 \n전 세계 60개국에 방송되어 6억 시청자를 감동시킨 텔레비전 교양 프로그램을 책으로 옮긴 칼 세이건(Carl Sagan)의 『코스모스(Cosmos)』. 현대 천문학을 대표하는 저명한 과학자인 칼 세이건은 이 책에서 사람들의 상상력을 사로잡고, 난해한 개념을 명쾌하게 해설하는 놀라운 능력을 마음껏 발휘한다. 그는 에라토스테네스, 데모크리토스, 히파티아, 케플러, 갈릴레오, 뉴턴, 다윈 같은 과학의 탐험가들이 개척해 놓은 길을 따라가며 과거, 현재, 미래의 과학이 이뤘고, 이루고 있으며, 앞으로 이룰 성과들을 알기 쉽게 풀이해 들려준다.\n" +
                "\n" +
                "이 책은 모두 13개장으로 구성되어 있다. 칼 세이건은 이 책에서 10조 개의 별들을 품고 있는 은하가 10조 개 있는 광막한 대우주의 세계에서 은하수 은하의 변방, 자그마한 노란색 별 태양이 이끄는 태양계의 한구석에서 창백하게 빛나는 지구에 이르기까지 코스모스에 대해 우리 인류가 알게 된 것들, 알게 된 과정들, 그리고 알아 갈 것들을 소개하고 그것이 궁극적으로 우리 자신을 알기 위한 것임을 설득력 있게 보여 준다. 코스모스 특별판은 수록 이미지가 흑백으로 실려 있다.",
                17910, "kim","과학"));
        post.add(new PostDto(4, "동물농장", "book4.jpg", "책 소개 \n“모든 동물은 평등하다.\n그러나 어떤 동물은 다른 동물들보다 더 평등하다.“\n\n20세기 영미 문학의 가장 중요한 작가 조지 오웰\n정치권력을 부패시키는 근본적 위험과 모순에 대한 빼어난 우화\n문학의 사회 비판적 역할에 대한 고민이 담긴 위대한 풍자소설\n\n우화 형식으로 당대의 정치적 현실을 날카롭게 묘파한 『동물농장』은 『1984』, 『카탈로니아 찬가』와 함께 조지 오웰이 47세의 나이로 갑작스레 사망하기 전 짧은 작가 생활 동안 남긴 영국 문학의 위대한 결실이다. 이 작품이 영국에서 처음 출간된 것은 2차 세계 대전이 갓 끝난 1945년이었다. 소련과 사회주의에 민감하던 세계 정치적 분위기에서 이 작품은 처음엔 거의 모든 출판사에서 출판을 거절할 정도로 홀대받았으나, 그의 전작 『카탈로니아 찬가』를 출간했던 섹커 앤드 와버그 출판사의 결정으로 겨우 출간에 이를 수 있었다. 사실상 전시(戰時)나 다름없던 무렵 『동물농장』은 출간되자마자 초판 4500부가 매진되고 재쇄를 거듭한 끝에 영국과 미국 모두에서 베스트셀러가 되었다. 그 이후 70여 년이 훌쩍 지난 지금까지 『동물농장』의 판매량은 세계적으로 1천만 부 이상을 넘은 것으로 알려져 있다.\n\n" +
                "조지 오웰은 『동물농장』에서 인간의 속박에서 벗어나 혁명을 이루고 이상 사회를 건설한 동물 공동체가 변질되는 모습을 통해 구소련의 역사를 재현하며 스탈린 독재 체제를 강도 높게 비판한다. 작중 여러 등장인물 중 인간 주인인 존즈는 러시아 황제 니콜라스 2세를, 혁명을 호소하는 늙은 메이저는 마르크스를, 독재자 나폴레옹은 스탈린을, 나폴레옹에게 축출당하는 스노볼은 트로츠키를 상징한다. 또한 이야기 속에 등장하는 ‘동물학살’과 ‘외양간 전투’ 역시 각기 스탈린 시대의 대숙청과 연합군 침공 등으로 연결된다. 혁명이 성공한 후에 어떻게 변질되고, 권력을 잡은 지도자들이 어떻게 국민을 속이고 핍박하는지를 면밀히 그린 이 우화는 특정한 시대에만 한정되어 읽히지 않는다. 이 작품은 인류가 사회를 이루고 살 때부터 벌어진 ‘독재’를 함축적인 등장인물과 사건을 통해 그려내어 지금까지도 유효한 풍자를 담고 있으며, 그렇기에 조지 오웰이 지닌 사회비판적 문학의 역량이 여실히 드러나는 작품이다. ",
                7200, "han", "소설"));
        post.add(new PostDto(5, "데미안", "book5.jpg", "책 소개\n참다운 어른이 되어 가는 소년 싱클레어의 이야기\n" +
                "데미안을 통해 참다운 어른이 되어 가는 소년 싱클레어의 이야기.\n" +
                "한 폭의 수채화같이 아름답고 유려한 문체로 전세계인의 사랑을 받고 있는 작품. 감수성이 풍부한 주인공 싱클레어가 소년기에서 청년기를 거쳐 어른으로 자라가는 과정이 세밀하고 지적인 문장으로 그려져 있습니다. 진정한 삶에 대해 고민하고 올바르게 살기 위해 노력하는 데미안과 싱클레어의 깊이 있는 이야기.",
                7200, "choi", "소설"));
        post.add(new PostDto(6, "인간 실격", "book6.jpg", "책 소개\n“너무도 부끄러운 생을 살아왔습니다.”\n" +
                "영혼을 두드리는 한 인간의 절규이자 유서로 남아버린 자화상\n" +
                "다자이 오사무 문학의 결정판, 『인간 실격』을 만나다\n" +
                "\n" +
                "누구보다 세상과 인간을 동경했으나 나약함과 순수함으로 인해 세상에서 버려지고 인간으로서의 자격마저 잃은 채 파멸되어가는 인물을 그려내며, 전 세계 독자들에게 많은 사랑을 받았던 다자이 오사무의 대표작 『인간 실격』. 인간의 내면 가장 깊숙한 곳의 존재 그 자체를 풀어낸 희유의 작품이라 평가받으며 오랫동안 세대와 국적을 뛰어넘으며 사랑받아온 이 책을, 코너스톤에서 1948년 오리지널 초판본 표지를 새롭게 재해석한 리커버 디자인에 고급 벨벳 양장본으로 제작하여 소장 가치를 높여 출간했다.\n" +
                "\n" +
                "『인간 실격』은 다자이 오사무의 정신적 자서전이라 할 수 있는 작품으로, 우리 또한 어쩌면 내면 한편에 품고 있을지도 모를 불안정한 자폐성과 소외된 고독감 등을 적나라하게 표현해내어 다자이 오사무 문학의 최고봉이라 일컬어지고 있다. 특히 이 책은 한없이 나약하고 순수한, 그래서 상처받고 슬플 수밖에 없는 주인공을 통해 신과 인간, 삶과 죽음, 죄와 벌, 인간이라는 존재에 대한 근원적 물음을 끝없이 던진다. 서른아홉의 나이에 자살로 생을 마감한 다자이 오사무, 그리고 그가 유서처럼 남겨놓은 『인간 실격』. 70년이 넘는 세월 동안 전 세계 청춘들의 필독서가 되어온 『인간 실격』을 지금 만나보자.",
                8550, "hwang", "소설"));
        post.add(new PostDto(7, "꾸뻬씨의 행복여행", "book7.jpg", "책 소개\n마음의 병을 앓고 있는 사람들을 치료하던 정신과 의사가 행복의 참된 의미를 찾아 여행을 떠난다는 소설이다. 이 소설의 주인공처럼 저자는 정신과 의사이다. 늘 불안한 심리 상태로 살아가는 사람들을 지켜보면서 어떤 심리학적 설명보다 한 편의 이야기가 더 사람의 마음을 움직일 수 있다고 생각했고, 자신의 환자들을 진료하며 얻은 경험과 생각들을 바탕으로 소설을 썼다. 현재 12개국의 언어로 번역되어 현대인의 복잡한 심리의 핵심을 짚어내면서 누구나 공감할 수 있는 이야기로 사람들의 마음을 움직이고 있다.",
                13500, "kim", "소설"));
        post.add(new PostDto(8, "베로니카 죽기로 결심하다", "book8.jpg", "책 소개\n주목받는 브라질 작가 파울로 코엘료가 1998년 발표한 소설. 자살을 기도했다가 정신병원에 갇히게 된 20대 젊은 여성 베로니카의 십일간의 이야기를 다뤘다. 코엘료 자신이 10대 후반에 여러 차례 정신병원에 드나든 경험이 있기 때문에 이 소재에는 특별히 그의 감정이 깊이 개입된 듯 읽힌다.\n" +
                "\n" +
                "움베르토 에코가 \"내 마음에 꼭 드는 작품이다. 깊은 감동을 느꼈다\"라고 평한 이 소설은 프랑스에서 베스트셀러 1위에 오르며 500만 부 이상 팔려나갔다. 죽음과 광기가 소재이지만 사실 삶과 열정에 대해 말하는 소설. 마지막의 반전이 짓궂은 웃음을 짓게 한다.",
                7200, "han", "소설"));
        post.add(new PostDto(9,"다빈치 코드","book9.jpg","책 소개\n더 이상 설명이 필요없는 베스트셀러, 『다빈치 코드』!\n" +
                "최신 완역판으로 새롭게 태어나다!\n" +
                "\n" +
                "레오나르도 다빈치의 작품 속에 교묘하게 숨겨진 암호들. 유럽의 성당과 성채를 넘나드는 숨 막히는 추격전. 수백 년 동안 숨겨온 놀라운 진실이 드디어 베일을 벗는다. 암호해독관인 소피는 한눈에 할아버지가 자신만 알 수 있는 암호를 남겼다는 걸 깨닫는다. 랭던과 함께 두 사람이 다빈치가 그림에 숨겨놓은 암호를 풀어나가는 사이 기독교의 어둠에 묻힌 역사가 드러나기 시작하는데……\n" +
                "\n" +
                "이 책으로 인해 2005년에 『타임』지의 「세계에서 가장 영향력 있는 인물 100인」 ‘예술가와 연예인’ 항목에 선정되기도 했던 저자 댄 브라운은 놀라운 속도감, 치밀한 자료 조사를 통한 지적이고 흥미진진한 복선으로 첫 페이지에서 마지막 페이지에 이르기까지 우리를 숨막히게 몰아칠 것이다.",
                10800,"choi","소설"));
        review.add(new ReviewDto(5, "평가 내용 <br>평가자 A", 4, "평가자 A", "hwang"));
        review.add(new ReviewDto(6, "평가 내용 <br>평가자 B", 2, "평가자 B", "kim"));
        review.add(new ReviewDto(7,  "평가 내용 <br>평가자 C", 4, "평가자 C", "han"));
        review.add(new ReviewDto(8, "평가 내용 <br>평가자 D", 5, "평가자 D", "choi"));
        review.add(new ReviewDto(9, "평가 내용 <br>평가자 E", 3, "평가자 E", "hwang"));
        review.add(new ReviewDto(10, "평가 내용 <br>평가자 F", 5, "평가자 F", "kim"));
        review.add(new ReviewDto(11,  "평가 내용 <br>평가자 G", 1, "평가자 G", "han"));
        review.add(new ReviewDto(12, "평가 내용 <br>평가자 H", 2, "평가자 H", "choi"));
    }

    @Override
    public ArrayList<MovieDto>  select() {
        return db;
    };

    public MovieDto  read(int idx) {
        MovieDto ret = db.stream().filter(m -> m.getIdx() == idx).findAny().get() ;
        return ret;
    }
    @Override
    public int count() {
        return db.size();
    }

    @Override
    public int countPost() {
        return post.size();
    }

    @Override //게시글 업로드 비즈니스 로직 구현
    public void upload(String title, String image, String content, int price, String seller, String genre) {
        if(image.equals("")){
            image="book.png";
        }
        i++;
        PostDto postDto = new PostDto(i, title, image, content, price, seller, genre);
        post.add(postDto);
        System.out.println(post.get(post.size()-1));
    }

    @Override
    public void update(int idx, String title, String image, String content, int price, String seller, String genre){
        if(image.equals("")){
            image="book.png";
        }
        PostDto temp = post.stream().filter(m -> m.getIdx() == idx).findAny().get();
        temp.setContent(content);
        temp.setGenre(genre);
        temp.setImage(image);
        temp.setPrice(price);
        temp.setSeller(seller);
        temp.setTitle(title);
        System.out.println(post.stream().filter(m -> m.getIdx() == idx).findAny().get());
    }

    @Override
    public void delete(int idx){
        post.remove(post.stream().filter(m -> m.getIdx() == idx).findAny().get());
    }

    @Override
    public List<PostDto> selectPost() {
        return post;
    }

    public PostDto  readPost(int idx) {
        PostDto ret = post.stream().filter(m -> m.getIdx() == idx).findAny().get() ;
        return ret;
    }

    @Override
    public ArrayList<ReviewDto> selectReview() {
        return review;
    };

    @Override
    public int avgRating(String seller) {
        int avgRating = 0;
        int count = 0;
        for (ReviewDto reviewDto : review) {
            if (reviewDto.getSeller().equals(seller)){
                avgRating += reviewDto.getRating();
                count += 1;
            }
        }
        avgRating /= count;
        return avgRating;
    }


}
