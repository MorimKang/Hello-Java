SELECT * FROM TAB;   --테이블 목록확인

SELECT EMPLOYEE_ID, LAST_NAME, EMAIL 
FROM EMPLOYEES;

--100번 에서 200번 미만의 사원의 사원번호,이름(LAST_NAME)출력
SELECT EMPLOYEE_ID, LAST_NAME 
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 100 and 200;
--between and 연산자는 이상이나 이하에서만 사용. 초과나 미만은 사용할 수 없다.
--WHERE EMPLOYEE_ID >= 100 AND EMPLOYEE_ID < 200;

--부서번호(department_id)가  30번이거나 90번부서인 사원의
--이름(last_name),입사입(hire_date),부서번호(department_id)를 
--출력하시오  
SELECT LAST_NAME, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 OR DEPARTMENT_ID = 90;
--WHERE DEPARTMENT_ID IN(30,90);

--King사원의 모든 컬럼 표시
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME='King';
--' ' 안에 있는 글자는 대 소문자를 구분한다.

SELECT *
FROM EMPLOYEES
WHERE LOWER(LAST_NAME)='king';
--last_name을 전부 소문자로 바꾼뒤 'king'과 비교, 같은 걸 찾음

SELECT *
FROM EMPLOYEES
WHERE UPPER(LAST_NAME)='KING';

--부서번호가 30,90번이면서 급여를 10000이상 받는 사원들의 
--사원번호(employee_id),이름(last_name),급여(salary), 
--부서번호(department_id)를 출력하시오
SELECT EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (30,90) AND SALARY > 10000;
--WHERE (DEPARTMENT_ID = 30 OR DEPARTMENT_ID = 90) AND SALARY > 10000;


--이름(last_name)중에 n으로 끝나는 사원들의 
--이름(last_name),급여(salary)를 출력하시오(like)
--                  '%n'     ==> n으로 끝나는
--                  'n%;     ==> n으로 시작하는
--                  '%st%'  ==> st가 포함되어있는
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%n';

select *
from employees
where last_name like '%so%';

--전체 사원들의 인원수를 구하시오
select count(*)
from employees;

--가장 많은 급여를 구하시오
select max(salary)
from employees;

--서브쿼리
SELECT FIRST_NAME ||' '||LAST_NAME as "이름"
FROM EMPLOYEES
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES);

--전체 사원의 급여합계를 구하시오
select sum(salary)
from employees;


--100번 에서 200번 미만의 사원의 사원번호,이름(LAST_NAME)출력
--사원번호로 내림차순 정렬하시오 --asc(오름차순. 생략가능), desc(내림차순)
SELECT EMPLOYEE_ID AS "사번", LAST_NAME AS "성"
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 100 AND 200
ORDER BY 2, 1;
--ORDER BY 2, 1; --> 2인 last_name으로 정렬하다가 같은 이름이 있는 경우에는 1자리의 employee_id로 정렬.
--ORDER BY employee_id desc;
--employee_id가 첫번쨰 셀렉트자리에 있으니까 1은 employee_id를 의미.
--WHERE EMPLOYEE_ID >= 100 AND EMPLOYEE_ID <200;













