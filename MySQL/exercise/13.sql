1.
select sc.sno, sc.cno from sc join c on c.cno = sc.cno and c.cteacher = '黎明';

select 
	s.sname
from 
	s
where
	s.sno not in (select sc.sno from sc join c on c.cno = sc.cno and c.cteacher = '黎明')
;

2.
select sc.sno, sc.cno from sc where sc.scgrade < 60;
select sc.sno, count(sc.cno) as count, avg(sc.scgrade) as grade from sc where sc.scgrade < 60 group by sno;
select
	s.sname, avg(sc.scgrade)
from
	s
join
	(select sc.sno, count(sc.cno) as count, avg(sc.scgrade) as grade from sc where sc.scgrade < 60 group by sno) as t
on
	s.sno = t.sno and count >= 2
join 
	sc
on 
	sc.sno = t.sno
;

3.
select sc.sno from sc where sc.cno = 1;

select
	s.sname
from
	sc
join
	(select sc.sno from sc where sc.cno = 1) as t
on
	sc.cno = 2 and sc.cno = t.sno
join
	s
on
	s.sno = sc.sno
;