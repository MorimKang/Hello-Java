select * from tab;

create table member(
name varchar2(10),
age number,
score number(7,2));

select * from member;

desc member; --구조확인(이클립스에서는 실행안됨, 콘솔에서 확인)

--추가하기
insert into member(name,age,score) values('가나다',20,75.3);
insert into member values('마바사',25,90.5);

--삭제하기
delete from member where name='마바사';
delete from member; --모든행(row)삭제

--트랜잭션 처리(인서트 딜리트 업데이트 // 셀렉트는 안됨), 롤백, 커밋

--수정하기 
--가나다의 나이를 27로 변경, 점수를 80.5로 변경
update member set age=27, score=80.5 where name='가나다';
--commit // 오라클 status가 auto commit으로 되어있기때문에 따로 commit 안해도 자동으로 해준것.

--------------------------------------------------
--primary key = unique + not null //기본키

create table dept(
dno number primary key,
dname varchar2(16) not null);

create table emp(
eno number primary key,
ename varchar2(16) not null,
dno number,
foreign key(dno) references dept);

select * from tab;
--drop table dept; 자식 테이블이 있기 때문에 지울 수 없다.



insert into dept(dno,dname) values(10,'개발부');
insert into dept(dno,dname) values(20,'영업부');
insert into dept(dno,dname) values(30,'홍보부');
insert into dept(dno,dname) values(40,'관리부');
commit
select * from dept;

insert into emp(eno,ename,dno) values(101,'kim',10);
insert into emp(eno,ename,dno) values(102,'lee',20);
insert into emp(eno,ename,dno) values(103,'park',10);
insert into emp(eno,ename,dno) values(104,'hong',30);
insert into emp(eno,ename) values(105,'kang');
insert into emp(eno,ename,dno) values(106,'hwang',50);
insert into emp(eno,ename,dno) values(107,'oh',60);
--무결성 제약조건(SCOTT.SYS_C003998)이 위배되었습니다- 부모 키가 없습니다
select * from emp;

insert into emp(eno,ename,dno) values(106,'hwang',30);
insert into emp(eno,ename,dno) values(107,'oh',20);


select * from emp;

--emp의 dno의 값을 모두 40으로 수정
update emp 
set dno=40;
select * from emp;

--emp의  101번, 103번 사원의 부서번호를 10으로 수정
update emp 
set dno=10 
where eno=101 and eno=103;
select * from emp;

--emp의 사원명이 h로 시작하는 사원의 부서를 30으로 수정
update emp 
set dno=30 
where ename like 'h%';
select * from emp;

--emp의 lee사원의 부서를 20으로 수정
update emp 
set dno=20 
where ename='lee';
select * from emp;

--emp의  30번 부서의 사원을 삭제
delete from emp 
where dno=30;
select * from emp;

--emp의  모든 사원을 삭제
delete from emp;
select * from emp;

--emp테이블 삭제
drop table emp;

--dept테이블 삭제
drop table dept;
select * from dept;

--테이블 목록 확인하기
select * from tab;

purge recyclebin; --휴지통 비우기.//테이블 삭제했는데 뭔가 쓰레기 값이 남았다면..







