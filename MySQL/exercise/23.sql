select 
	e.ename, d.dname
from
	emp as e
join
	dept as d
on
	e.job = (select e.job from emp as e where e.ename = 'SCOTT') and e.deptno = d.deptno and e.ename != 'SCOTT'
;