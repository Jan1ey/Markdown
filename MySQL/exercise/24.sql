select 
	e.ename, e.sal
from
	emp as e
join
	(select e.sal from emp as e where e.deptno = 30) as t
on
	e.sal = t.sal and e.deptno != 30
;