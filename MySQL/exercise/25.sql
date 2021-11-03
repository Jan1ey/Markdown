select 
	e.ename, e.sal, d.dname
from
	emp as e
join
	dept as d
on
	e.sal > (select max(e.sal) from emp as e where e.deptno = 30) and d.deptno = e.deptno
;