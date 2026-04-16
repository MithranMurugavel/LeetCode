SELECT cus.name as Customers FROM Customers as cus
LEFT JOIN Orders od ON cus.id = od.customerId WHERE od.customerId is NULL; 