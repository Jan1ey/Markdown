select
	e.*
from
	emp as e
join
	(select e.job, min(e.sal) as minsal from emp as e group by e.job) as t
on
	t.job = e.job and t.minsal = e.sal
;
