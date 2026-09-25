/* Write your PL/SQL query statement below */
Delete from Person p1
where p1.id > (
    select MIN(p2.id)
    from Person p2
    where p1.email = p2.email
);