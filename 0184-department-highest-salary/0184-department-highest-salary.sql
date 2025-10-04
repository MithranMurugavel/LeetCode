# Write your MySQL query statement below
SELECT dp.name Department, ep.name Employee, ep.salary Salary
FROM Employee as ep 
JOIN Department as dp on dp.id = ep.departmentId
WHERE ep.salary = (SELECT MAX(salary) FROM Employee e WHERE ep.departmentId=departmentId)