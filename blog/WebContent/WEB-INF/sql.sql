DROP TABLE if exists blogtype;
CREATE TABLE blogtype (
 blog_id int(11) NOT NULL AUTO_INCREMENT COMMENT '博客ID',
 typename varchar(30) NOT NULL COMMENT '博客类别',
 ordernum varchar(30) NOT NULL COMMENT '博客排序',
 PRIMARY KEY (blog_id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ;