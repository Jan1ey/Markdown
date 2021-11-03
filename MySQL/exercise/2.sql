select
	e.ename, e.sal
from
	emp as e
join
	(select deptno, avg(sal) as avgsal from emp group by deptno) as t
on
	e.deptno = t.deptno and e.sal >= t.avgsal
;