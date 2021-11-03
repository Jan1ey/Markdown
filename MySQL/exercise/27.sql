select 
	e.ename, d.dname, e.sal
from
	emp as e
join
	dept as d
on
	e.deptno = d.deptno
;