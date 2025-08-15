SELECT t1.firstName as firstName, t1.lastName as lastName, t2.city as city, t2.state as state
FROM Person As t1
LEFT JOIN Address as t2 ON t1.personId=t2.personId
;