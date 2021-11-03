select 
	e.ename, t.ename
from
	emp as e
join
	emp as t
on
	e.mgr = t.empno and t.sal > 3000
;