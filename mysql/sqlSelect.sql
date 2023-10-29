
--SQL 执行先后顺序

--step3 :   select * 
            
--step1 :   from    employee 
--step2 :   where   salary > 1 
--step4 :   order by name
--step5 :   limit 1,2


select
    * 
from
    employee 
where
    salary > 1 
order by name

limit 1,2

------------------------------------

--取表里工资最多的员工名
select
    name 
from
    employee 
where
    salary = (select min(salary) from employee)
    
-------------------------------------

-- 检索表里的工资（去重复）
select
  distinct t.salary as '工资'
  from employee t
--------------------------------------

select 1 as 'no'

-------------------------------
select 1 as 'no'
union all
select 1 as 'no'
---------------------------

select distinct no from 
(
select 1 as 'no'
union all
select 1 as 'no'
) t

--------------------------

----------  union 只是比union all 多了去重复功能 ---------
select 1 as 'no'
union
select 1 as 'no'

--------------------------------

-------- 检索 工资>100的记录  （SQL的写法决定了SQL检索性能） ---------

select * from employee where salary > 100     --推荐写法
  

 --不推荐写法  如果检索条件是索引的话，会丢失索引
 -- 数据库里所有记录的salary字段先减100 之后和 0对比， 有运算操作
select * from employee where salary -100 > 0  


---------------



-- SQL多表查询 要用inner join(内连接) 或left join(外连接)
--- 取员工的人名，工资，性别 

-- 多表联合查询时，如果不加检索条件，会出现迪卡尔积现象
select e.name,e.salary,u.gender
from employee e, user u



-- 写法可以，但不推荐
select e.name,e.salary,u.gender
from employee e, user u
where e.name = u.username


-- 多表联合查询 推荐的写法
select e.name,e.salary,u.gender
from employee e inner join user u on e.name = u.username


--- 取员工的人名，工资，性别 (找不到相关记录性别为空)
select e.name,e.salary,u.gender
from employee e left join user u on e.name = u.username
 

-- right join  不要用 
select e.name,e.salary,u.gender
from employee e right join user u on e.name = u.username
 


