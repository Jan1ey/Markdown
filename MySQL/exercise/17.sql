select 
	d.dname, count(e.empno)
from
	dept as d
left join
	emp as e
on
	d.deptno = e.deptno
group by
	d.dname
having
	count(e.empno) >= 5
;