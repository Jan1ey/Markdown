select 
	d.dname
from
	(select deptno, avg(sal) as avgsal from emp group by deptno order by avgsal) as e
left join
	dept as d
on 
	d.deptno = e.deptno
limit
	0, 1
;