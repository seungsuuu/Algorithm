-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where NAME Like '%EL%' and ANIMAL_TYPE = 'Dog'
order by NAME