# douban-spider
````
豆瓣的API接口封装



V2版API权限分3类:

-公开（对应Required Scope URI ：movie_basic_r, movie_basic_w）- 
所有开发者均可申请，审核通过。限定40次请求/分钟。开放基本数据接口，一般的个人爱好者自建网站或应用都会满足。

-高级（对应Required Scope URI ：movie_advance_r, movie_advance_w） - 
在运行过一段时间之后，如果这个非商业网站（例如非盈利性质的图书馆，学校，公益组织等）的确出众，且价值观符合Douban，无版权问题，又不和豆瓣电影有正面的商业竞争，可以申请高级权限。开放基本上所有的接口。

-商务（对应Required Scope URI ：movie_premium_r, movie_premium_w）- 
应用于商务合作，不限制次数，开放有限接口。已经商业化网站请使用此接口。 移植到V2之后，只要满足我们的API规定要求（见后），即可开通。


＊高级scope暂时还没有开放申请
＊如果需要提高限制次数的权限，可以发邮件给 api-master（at）douban.com申请
````

##电影条目
1. 电影条目信息【OK】
````
需要接口权限 movie_basic_r
https://api.douban.com/v2/movie/subject/26787574
````
2. 电影条目剧照
````
需要权限 movie_advance_r
https://api.douban.com/v2/movie/subject/26787574/photos
````
3. 电影条目长评
````
需要权限 movie_advance_r
https://api.douban.com/v2/movie/subject/26787574/reviews
````
4. 电影条目短评
````
需要高级接口权限 movie_advance_r
````

##影人条目
1. 影人条目信息【OK】
````
https://api.douban.com/v2/movie/celebrity/1054395
````
2. 影人剧照
````
需要接口权限  movie_advance_r
````
3. 影人作品
````
需要接口权限 movie_advance_r
````


##搜索
1. 电影搜索【OK】
````
按艺人查找
https://api.douban.com/v2/movie/search?q=张艺谋


按分类查找
https://api.douban.com/v2/movie/search?tag=黑帮
具体分类可以再下面链接找到
https://movie.douban.com/tag/#/
````



##榜单
1. 正在热映
````
需要接口权限  movie_premium_r
````
2. 即将上映
````
需要接口权限  movie_premium_r
````
3. Top250【OK】
````
https://api.douban.com/v2/movie/top250
````
4. 口碑榜
````
需要接口权限  movie_advance_r
````
5. 北美票房榜【OK】
````
https://api.douban.com/v2/movie/us_box
````
6. 新片榜
````
需要接口权限  movie_advance_r
````
