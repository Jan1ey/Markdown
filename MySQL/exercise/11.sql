select 
	e.ename, e.hiredate
from 
	emp as e
order by
	hiredate desc
limit
	0, 5
;