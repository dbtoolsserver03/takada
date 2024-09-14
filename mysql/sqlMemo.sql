


CREATE TABLE TEACHER( 
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'NO'
    , name VARCHAR (60) COMMENT '名前'
    , salary int COMMENT '月給'
    , birthday datetime COMMENT '誕生日'
    , sex char (2) COMMENT '性別'
) comment '先生テーブル'



CREATE TABLE example_table (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '主キーID',  -- 数字（整数）のカラムにコメントを追加
    name VARCHAR(100) COMMENT '商品名',                    -- 文字列カラムにコメントを追加
    price DECIMAL(10, 2) COMMENT '価格',                   -- 小数を扱うカラムにコメントを追加
    created_at DATE COMMENT '作成日',                      -- 日付カラムにコメントを追加
    image LONGBLOB COMMENT '商品画像'                      -- 画像を扱うカラムにコメントを追加
) COMMENT = '商品情報を格納するテーブル';                 -- テーブル自体にコメントを追加


--  検索SQL文
select
    salary 
from
    TEACHER 
where
    name = 'tanaka'

select
    * 
from
    TEACHER 
where
    name = 'tanaka' 


-- 曖昧検索
select
    * 
from
    TEACHER 
where
    name like 'sa%'  
    
select
    * 
from
    TEACHER 
where
    name like '_a%'  

--　from to
select
    name ,salary
from
    TEACHER 
where
    salary <= 300000  and salary >= 200000
    
select
    name,salary
from
    TEACHER 
where
    salary between 200000 and 300000  -- =含め
    
-- SQL実行順位
-- from,where,select

select
    name,salary
from
    TEACHER 
where
    salary between 200000 and 300000  -- =含め
order by salary,name desc

-- ３番目レコード取得したい場合　limit　利用
select
    name,salary
from
    TEACHER  
order by salary,name -- default 値　asc 昇順

limit 2,1

-- 分ページ
-- 1,2番目レコード取得したい場合
select
    name,salary
from
    TEACHER  
order by salary,name -- default 値　asc 昇順
limit 0,2

-- 3,4番目レコード取得したい場合
select
    name,salary
from
    TEACHER  
order by salary,name -- default 値　asc 昇順
limit 2,2

-- 月給を取得する。重複場合、一つ残ります
select distinct salary
from teacher

-- union all/ union

select salary from teacher where sex ='1'
union all 
select salary from teacher where sex ='0'

-- union 重複レコード削除できる
select salary from teacher where sex ='1'
union 
select salary from teacher where sex ='0'


-- 男性、女性　人数
select 
sex, count(*) cnt
from 
teacher
group by sex

-- 男性、女性　最大最小月給
select 
sex, max(salary) max_salary,min(salary) min_salary
from 
teacher
group by sex

-- case when then
select
    CASE 
        WHEN sex='1' THEN 'men'
        WHEN sex='0' THEN 'women'
        ELSE '未知'
    END AS sex
    , max(salary) max_salary
    , min(salary) min_salary 
from
    teacher 
group by
    sex


--  下記の書き方はだめ
select
    name,sex
    , count(*) 
from
    teacher 
group by
    sex


-- コツ：　select文のところに、分析関数以外の項目はgroup byに書かないといけない
select
    name,sex
    , count(*) 
from
    teacher 
group by
    name,sex


--  挿入SQL文
INSERT 
INTO `TEACHER`( 
     name                                      -- 名前
    , salary                                    -- 月給
    , birthday                                  -- 誕生日
    , sex                                       -- 性別
) 
VALUES ( 
    'user01'                                     -- 名前
    , 200000                                   -- 月給
    , '2020/01/01'                                 -- 誕生日
    , '1'                                      -- 性別
)

-- 更新SQL文(自分データ確認必要)
select * from  TEACHER where sex = '0'
update TEACHER set salary = salary + 1000 where sex = '0'

-- 削除SQL文(自分データ確認必要)
select * from  TEACHER where name = 'user01'
delete from  TEACHER where name = 'user01'

-- その他　データベース名前、テーブル名、項目名前には、半角スペースある場合、下記の書き方で解決できる
`TEACHER A`



CREATE TABLE `identify_card` (
  `name` varchar(60) not NULL COMMENT 'my name',
  `birthday` datetime DEFAULT NULL COMMENT 'my birthday',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB  COMMENT='在留カード money ';

CREATE TABLE `year_money` (
  `name` varchar(60) not null COMMENT 'my name',
  `money` int DEFAULT NULL COMMENT 'my salary',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB  COMMENT='国民年金year money talbe'


--　全員の年金状況を知りたい場合

-- ×
select name,money from year_money

-- ×　両テーブル条件満足が必要
select identify_card.name,money,identify_card.birthday from identify_card, year_money  where identify_card.name = year_money.name


-- 主テーブル　と　副テーブル
-- 主テーブルのレコード全部抽出すること
--　副テーブルがない場合、空で表示する
select
    i.name
    , y.money 
from
    identify_card i 
    left join year_money y 
        on i.name = y.name
        
---全員の年金状況を知りたい、年金55000より大きいレコード

select
    i.name
    , y.money 
from
    identify_card i 
    left join year_money y 
        on i.name = y.name and y.money>55000


-- where 条件に副テーブルの条件がありましたら、 left join は　inner joinに強制転換する
select
    i.name
    , y.money 
from
    identify_card i 
    left join year_money y 
        on i.name = y.name
where  y.money>55000

        