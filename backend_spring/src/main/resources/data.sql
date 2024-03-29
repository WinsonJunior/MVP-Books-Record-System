-- Clear all previous data (for testing purposes only)
TRUNCATE authors, books, people, author_books, book_rents;

INSERT INTO books (id, name, "created_at", "updated_at") VALUES (1, 'Book 1', '20120618', '20120618');
INSERT INTO books (id, name, "created_at", "updated_at") VALUES (2, 'Book 2', '20120618', '20120618');
INSERT INTO books (id, name, "created_at", "updated_at") VALUES (3, 'Book 3', '20120618', '20120618');
INSERT INTO books (id, name, "created_at", "updated_at") VALUES (4, 'Book 4', '20120618', '20120618');
INSERT INTO books (id, name, "created_at", "updated_at") VALUES (5, 'Book 5', '20120618', '20120618');

INSERT INTO people (id, name, "created_at", "updated_at", country_id) VALUES (1, 'Person 1', '20120618', '20120618', 360);
INSERT INTO people (id, name, "created_at", "updated_at", country_id) VALUES (2, 'Person 2', '20120618', '20120618', 360);
INSERT INTO people (id, name, "created_at", "updated_at", country_id) VALUES (3, 'Person 3', '20120618', '20120618', 360);
INSERT INTO people (id, name, "created_at", "updated_at", country_id) VALUES (4, 'Person 4', '20120618', '20120618', 360);
INSERT INTO people (id, name, "created_at", "updated_at", country_id) VALUES (5, 'Person 5', '20120618', '20120618', 702);

INSERT INTO authors (id, name, "created_at", "updated_at") VALUES (1, 'Famous Author 1', '20120618', '20120618');
INSERT INTO authors (id, name, "created_at", "updated_at") VALUES (2, 'Famous Author 2', '20120618', '20120618');
INSERT INTO authors (id, name, "created_at", "updated_at") VALUES (3, 'Famous Author 3', '20120618', '20120618');
INSERT INTO authors (id, name, "created_at", "updated_at") VALUES (4, 'Famous Author 4', '20120618', '20120618');

INSERT INTO author_books (author_id, book_id, "created_at", "updated_at") VALUES (1, 1, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO author_books (author_id, book_id, "created_at", "updated_at") VALUES (2, 2, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO author_books (author_id, book_id, "created_at", "updated_at") VALUES (3, 3, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO author_books (author_id, book_id, "created_at", "updated_at") VALUES (4, 4, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO author_books (author_id, book_id, "created_at", "updated_at") VALUES (4, 5, '2020-07-01 19:10:25', '2020-07-01 19:10:25');

INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (1, 5, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (2, 5, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (2, 5, '2020-07-01 19:10:25', '2022-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (2, 5, '2020-07-01 19:10:25', '2021-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (3, 5, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (3, 5, '2020-07-01 19:10:25', '2021-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (4, 5, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (1, 2, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (4, 2, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (5, 4, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (5, 4, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (5, 4, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
INSERT INTO book_rents (people_id, book_id, "created_at", "updated_at") VALUES (1, 4, '2020-07-01 19:10:25', '2020-07-01 19:10:25');
