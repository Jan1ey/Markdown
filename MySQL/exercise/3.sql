select 
	e.deptno, avg(s.grade) 
from 
	(select deptno, sal from emp) as e 
join 
	salgrade as s 
on 
	e.sal <= s.hisal and e.sal >= s.losal 
group by 
	e.deptno
;