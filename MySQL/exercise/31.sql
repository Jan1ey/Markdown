select 
	(e.sal + ifnull(e.comm, 0)) * 12 as yearsal
from
	emp as e
order by
	yearsal
;