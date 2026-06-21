# Write your MySQL query statement below
select d.name as Department,e1.name as Employee,e1.salary as Salary
from Department d
join Employee e1
on d.id=e1.departmentId
where e1.salary=(
    select max(e2.salary)
    from Employee e2
    where e1.departmentId=e2.departmentId
);