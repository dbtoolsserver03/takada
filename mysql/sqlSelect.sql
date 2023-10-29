
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




