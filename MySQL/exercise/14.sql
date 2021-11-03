select 
	e.ename, ifnull(t.ename, '无上级') as mname
from
 	emp as e
left join
	emp as t
on
	e.mgr = t.empno
;

