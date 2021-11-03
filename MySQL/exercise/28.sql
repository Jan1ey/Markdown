select
	d.deptno, d.dname, d.loc, count(e.empno)
from
	dept as d
left join 
	emp as e
on
	e.deptno = d.deptno
group by
	d.dname
;