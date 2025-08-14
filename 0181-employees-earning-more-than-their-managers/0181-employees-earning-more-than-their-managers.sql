SELECT e2.name AS Employee FROM Employee as e2
INNER JOIN Employee as e1 ON e1.id=e2.managerId
WHERE e2.salary>e1.salary;
