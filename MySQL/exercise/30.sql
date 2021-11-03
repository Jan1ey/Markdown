select 
	e.deptno, min(e.sal)
from
	emp as e
where 
	e.job = 'MANAGER'
group by
	e.deptno
;