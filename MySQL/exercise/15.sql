select 
	e.empno, e.ename, d.dname
from
	emp as e
join
	emp as t
on
	e.mgr = t.empno and e.hiredate < t.hiredate
join
	dept as d
on
	e.deptno = d.deptno
;