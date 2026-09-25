/* Write your PL/SQL query statement below */
SELECT c.name as "Customers"
from Customers c
LEFT JOIN Orders o ON o.customerID = c.id
WHERE o.customerID IS NULL;