SELECT * FROM TAB;   --���̺� ���Ȯ��

SELECT EMPLOYEE_ID, LAST_NAME, EMAIL 
FROM EMPLOYEES;

--100�� ���� 200�� �̸��� ����� �����ȣ,�̸�(LAST_NAME)���
SELECT EMPLOYEE_ID, LAST_NAME 
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 100 and 200;
--between and �����ڴ� �̻��̳� ���Ͽ����� ���. �ʰ��� �̸��� ����� �� ����.
--WHERE EMPLOYEE_ID >= 100 AND EMPLOYEE_ID < 200;

--�μ���ȣ(department_id)��  30���̰ų� 90���μ��� �����
--�̸�(last_name),�Ի���(hire_date),�μ���ȣ(department_id)�� 
--����Ͻÿ�  
SELECT LAST_NAME, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 OR DEPARTMENT_ID = 90;
--WHERE DEPARTMENT_ID IN(30,90);

--King����� ��� �÷� ǥ��
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME='King';
--' ' �ȿ� �ִ� ���ڴ� �� �ҹ��ڸ� �����Ѵ�.

SELECT *
FROM EMPLOYEES
WHERE LOWER(LAST_NAME)='king';
--last_name�� ���� �ҹ��ڷ� �ٲ۵� 'king'�� ��, ���� �� ã��

SELECT *
FROM EMPLOYEES
WHERE UPPER(LAST_NAME)='KING';

--�μ���ȣ�� 30,90���̸鼭 �޿��� 10000�̻� �޴� ������� 
--�����ȣ(employee_id),�̸�(last_name),�޿�(salary), 
--�μ���ȣ(department_id)�� ����Ͻÿ�
SELECT EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (30,90) AND SALARY > 10000;
--WHERE (DEPARTMENT_ID = 30 OR DEPARTMENT_ID = 90) AND SALARY > 10000;


--�̸�(last_name)�߿� n���� ������ ������� 
--�̸�(last_name),�޿�(salary)�� ����Ͻÿ�(like)
--                  '%n'     ==> n���� ������
--                  'n%;     ==> n���� �����ϴ�
--                  '%st%'  ==> st�� ���ԵǾ��ִ�
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%n';

select *
from employees
where last_name like '%so%';

--��ü ������� �ο����� ���Ͻÿ�
select count(*)
from employees;

--���� ���� �޿��� ���Ͻÿ�
select max(salary)
from employees;

--��������
SELECT FIRST_NAME ||' '||LAST_NAME as "�̸�"
FROM EMPLOYEES
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES);

--��ü ����� �޿��հ踦 ���Ͻÿ�
select sum(salary)
from employees;


--100�� ���� 200�� �̸��� ����� �����ȣ,�̸�(LAST_NAME)���
--�����ȣ�� �������� �����Ͻÿ� --asc(��������. ��������), desc(��������)
SELECT EMPLOYEE_ID AS "���", LAST_NAME AS "��"
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 100 AND 200
ORDER BY 2, 1;
--ORDER BY 2, 1; --> 2�� last_name���� �����ϴٰ� ���� �̸��� �ִ� ��쿡�� 1�ڸ��� employee_id�� ����.
--ORDER BY employee_id desc;
--employee_id�� ù���� ����Ʈ�ڸ��� �����ϱ� 1�� employee_id�� �ǹ�.
--WHERE EMPLOYEE_ID >= 100 AND EMPLOYEE_ID <200;













