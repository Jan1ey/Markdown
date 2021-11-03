select 
	d.deptno, d.dname, count(e.empno) as count
from
	dept as d
join 
	emp as e
on
	e.deptno = d.deptno
group by
	d.dname
;

select 
	e.ename, t.dname, t.count
from
	emp as e
join 
	(select d.deptno, d.dname, count(e.empno) as count from dept as d join emp as e on e.deptno = d.deptno group by d.dname) as t
on 
	e.deptno = t.deptno and e.job = 'CLERK'
;