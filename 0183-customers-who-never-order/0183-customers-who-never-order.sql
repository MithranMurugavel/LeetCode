# Write your MySQL query statement below
SELECT cos.name as Customers FROM Customers as cos
LEFT JOIN Orders as od ON  od.customerId=cos.id
WHERE od.customerId IS NULL;

