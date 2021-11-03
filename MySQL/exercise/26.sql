select 
	count(e.empno), ifnull(avg(e.sal), 0) as avgsal, ifnull(avg(timestampdiff(YEAR, e.hiredate, now())), 0) as avgservicetime
from
	emp as e
right join
	dept as d
on
	e.deptno = d.deptno
group by
	d.dname
;