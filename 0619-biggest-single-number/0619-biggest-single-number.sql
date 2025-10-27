SELECT MAX(num) as num 
FROM (SELECT num FROM MyNumbers group by num having count(num)=1) as unique_