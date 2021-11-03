select 
	e.ename
from 
	emp as e
where 
	e.deptno = (select d.deptno from dept as d where d.dname = 'SALES')
;