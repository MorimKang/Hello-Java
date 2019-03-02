select * from tab;

create table member(
name varchar2(10),
age number,
score number(7,2));

select * from member;

desc member; --����Ȯ��(��Ŭ���������� ����ȵ�, �ֿܼ��� Ȯ��)

--�߰��ϱ�
insert into member(name,age,score) values('������',20,75.3);
insert into member values('���ٻ�',25,90.5);

--�����ϱ�
delete from member where name='���ٻ�';
delete from member; --�����(row)����

--Ʈ����� ó��(�μ�Ʈ ����Ʈ ������Ʈ // ����Ʈ�� �ȵ�), �ѹ�, Ŀ��

--�����ϱ� 
--�������� ���̸� 27�� ����, ������ 80.5�� ����
update member set age=27, score=80.5 where name='������';
--commit // ����Ŭ status�� auto commit���� �Ǿ��ֱ⶧���� ���� commit ���ص� �ڵ����� ���ذ�.

--------------------------------------------------
--primary key = unique + not null //�⺻Ű

create table dept(
dno number primary key,
dname varchar2(16) not null);

create table emp(
eno number primary key,
ename varchar2(16) not null,
dno number,
foreign key(dno) references dept);

select * from tab;
--drop table dept; �ڽ� ���̺��� �ֱ� ������ ���� �� ����.



insert into dept(dno,dname) values(10,'���ߺ�');
insert into dept(dno,dname) values(20,'������');
insert into dept(dno,dname) values(30,'ȫ����');
insert into dept(dno,dname) values(40,'������');
commit
select * from dept;

insert into emp(eno,ename,dno) values(101,'kim',10);
insert into emp(eno,ename,dno) values(102,'lee',20);
insert into emp(eno,ename,dno) values(103,'park',10);
insert into emp(eno,ename,dno) values(104,'hong',30);
insert into emp(eno,ename) values(105,'kang');
insert into emp(eno,ename,dno) values(106,'hwang',50);
insert into emp(eno,ename,dno) values(107,'oh',60);
--���Ἲ ��������(SCOTT.SYS_C003998)�� ����Ǿ����ϴ�- �θ� Ű�� �����ϴ�
select * from emp;

insert into emp(eno,ename,dno) values(106,'hwang',30);
insert into emp(eno,ename,dno) values(107,'oh',20);


select * from emp;

--emp�� dno�� ���� ��� 40���� ����
update emp 
set dno=40;
select * from emp;

--emp��  101��, 103�� ����� �μ���ȣ�� 10���� ����
update emp 
set dno=10 
where eno=101 and eno=103;
select * from emp;

--emp�� ������� h�� �����ϴ� ����� �μ��� 30���� ����
update emp 
set dno=30 
where ename like 'h%';
select * from emp;

--emp�� lee����� �μ��� 20���� ����
update emp 
set dno=20 
where ename='lee';
select * from emp;

--emp��  30�� �μ��� ����� ����
delete from emp 
where dno=30;
select * from emp;

--emp��  ��� ����� ����
delete from emp;
select * from emp;

--emp���̺� ����
drop table emp;

--dept���̺� ����
drop table dept;
select * from dept;

--���̺� ��� Ȯ���ϱ�
select * from tab;

purge recyclebin; --������ ����.//���̺� �����ߴµ� ���� ������ ���� ���Ҵٸ�..







