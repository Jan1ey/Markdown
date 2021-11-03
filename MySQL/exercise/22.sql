select
	e.ename, d.dname, ifnull(t.ename, '无'), s.grade
from
	emp as e
join
	dept as d
on
	e.sal > (select avg(e.sal) from emp as e) and e.deptno = d.deptno
join
	salgrade as s
on
	e.sal between s.losal and s.hisal
left join
	emp as t
on
	e.mgr = t.empno
;
