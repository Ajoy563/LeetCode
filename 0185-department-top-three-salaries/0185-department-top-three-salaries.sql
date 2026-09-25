/* Write your PL/SQL query statement below */
SELECT 
    d.name as "Department",
    e.name as "Employee",
    e.salary as "Salary"
From Employee e 
JOIN Department d ON e.departmentID = d.id
where 3 > (
    select COUNT(DISTINCT e2.salary)
    from Employee e2
    where e2.departmentID = e.departmentID
    AND e2.salary > e.salary
);