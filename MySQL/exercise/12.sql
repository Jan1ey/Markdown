select s.grade, e.ename from emp as e join salgrade as s on e.sal between s.losal and s.hisal;

select
	t.grade, count(t.ename)
from 
	(select s.grade, e.ename from emp as e join salgrade as s on e.sal between s.losal and s.hisal) as t
group by
	grade
order by
	grade
;