select * from users;
select * from tab;
drop table users purge;

--primary key : unique + not null
create table users(
id varchar2(10) primary key,
pwd varchar2(10) not null,
name varchar2(20) not null,
point number(7,2));  

insert into users(id,pwd,name,point) values('admin','1111','어드민',35.34);
insert into users(id,pwd,name,point) values('abcd','1111','테스트',65.78);
commit

SELECT * FROM USERS;
-------------------------------------------------
create table emp(
eno number(6) primary key,   --사원번호
ename varchar2(10)not null,  --사원이름
phone varchar2(15),          --연락처
dept varchar2(20));          --부서명

--시퀀스만들기
create sequence seq_eno increment by 1 start with 1
nocycle nocache;

drop sequence seq_eno; --시퀀스 삭제

select * from tab;      --테이블목록확인
drop table emp purge;   --휴지통에 넣지 않고 바로 삭제
drop table emp;         --emp테이블 삭제 
drop table dept;
purge recyclebin;       --휴지통비우기

select * from emp;

DELETE FROM EMP WHERE ENAME='진달래';


















