--시퀀스: 자동값증가
--형식:
--create sequence 시퀀스명
--[increment by n] //증가값
--[start with n] //시작값

drop sequence seq_id; -- 시퀀스 삭제

create sequence seq_id increment by 2
start with 1 maxvalue 9 cycle nocache;

select seq_id.nextval from dual; --dual(가상의 테이블)

create sequence seq_id increment by 1 start with 1 nocycle nocache;
----------------------------------------------------------------------
create table user1(
num number(6) primary key,
name varchar2(16) not null,
phone varchar2(15));


insert into user1(num,name,phone) values(seq_id.nextval,'kim','010-1111-1111');
insert into user1(num,name,phone) values(seq_id.nextval,'lee','010-2222-1111');
insert into user1(num,name,phone) values(seq_id.nextval,'park','010-3333-1111');

select * from user1;
delete from user1;