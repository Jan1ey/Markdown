select 
	d.dname, sum(e.sal), count(e.empno)
from
	dept as d
join
	emp as e
on
	d.dname like '%S%'
group by
	d.dname
;