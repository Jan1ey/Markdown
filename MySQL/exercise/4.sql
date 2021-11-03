select 
	e.sal
from
	(select * from emp order by sal desc) as e
limit
	0, 1
;