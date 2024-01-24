-- 코드를 입력하세요
SELECT i.flavor
from ICECREAM_INFO as i
where INGREDIENT_TYPE = 'fruit_based' and i.flavor = any (select f.flavor from first_half as f where total_order > 3000);