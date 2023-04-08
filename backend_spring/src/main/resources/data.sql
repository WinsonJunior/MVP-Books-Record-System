-- Clear all previous data (for testing purposes only)
TRUNCATE authors, books, people, author_books, book_rents;

-- For performance testing purposes
INSERT INTO books (id, name, "created_at", "updated_at")
VALUES (generate_series(1,20), md5(random()::text), '20120618', NOW() + (random() * (NOW()+'90 days' - NOW())) + '30 days');

INSERT INTO authors (id, name, "created_at", "updated_at")
VALUES (generate_series(1,20), md5(random()::text), '20120618', NOW() + (random() * (NOW()+'90 days' - NOW())) + '30 days');

INSERT INTO people (id, name, "created_at", "updated_at", country_id)
VALUES (generate_series(1,100), md5(random()::text), '20120618', NOW() + (random() * (NOW()+'90 days' - NOW())) + '30 days', 4);

INSERT INTO author_books (author_id, book_id, "created_at", "updated_at")
VALUES (generate_series(1,20), generate_series(1,20), '2020-07-01 19:10:25', '2020-07-01 19:10:25');


do'
BEGIN
    for r in 1..100000 loop
            INSERT INTO book_rents (book_id, people_id, "created_at", "updated_at") VALUES (floor(random() * 20 + 1)::int, floor(random() * 100 + 1), ''2020-07-01 19:10:25'' , ''2020-07-01 19:10:25'');
        end loop;
END;
'
