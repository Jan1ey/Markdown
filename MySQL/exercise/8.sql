select distinct mgr from emp where mgr is not null;

select max(sal) from emp where empno not in (select distinct mgr from emp where mgr is not null);

select 
	e.ename, e.sal
from 
	emp as e
where 
	e.empno in (select distinct mgr from emp where mgr is not null) and e.sal > (select max(sal) from emp where empno not in (select distinct mgr from emp where mgr is not null))
;
