select
    d.dname, e.*
from
    dept as d
left join
    emp as e
on
    d.deptno = e.deptno
order by
    d.dname
;