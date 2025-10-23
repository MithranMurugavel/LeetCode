SELECT Max(salary) as SecondHighestSalary FROM Employee 
where salary < (select max(salary) from employee)