select
    e.ename, e.sal, e.deptno
from
    (select deptno, max(sal) maxsal from emp group by deptno) as t
join
    emp as e
on
    e.deptno = t.deptno
and
    e.sal = t.maxsal
;