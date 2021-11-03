select 
	e.deptno
from
	(select deptno, avg(sal) avgsal from emp group by deptno order by avgsal desc) as e
limit
	0, 1
;