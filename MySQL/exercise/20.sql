select 
	e.job, count(e.empno) 
from 
	emp as e
group by
	e.job
having
	min(e.sal) > 1500
;
