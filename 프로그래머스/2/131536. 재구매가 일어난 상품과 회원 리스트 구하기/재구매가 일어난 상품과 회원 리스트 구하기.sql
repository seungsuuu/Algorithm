-- 코드를 입력하세요
SELECT user_id, product_id
FROM ONLINE_SALE o1
GROUP BY user_id, product_id
HAVING COUNT(*) >= 2
ORDER BY 1, 2 DESC
