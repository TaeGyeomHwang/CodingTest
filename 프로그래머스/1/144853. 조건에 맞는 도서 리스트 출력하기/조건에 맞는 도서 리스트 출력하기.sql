-- 코드를 입력하세요
SELECT book_id, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
from book
where PUBLISHED_DATE > '2020.12.31' and PUBLISHED_DATE<'2022.01.01' and category = '인문'
order by PUBLISHED_DATE;