INSERT INTO user_info (id, user_id, password, nickname, status, registration_date, pause_reason, pause_date, created_at, updated_at) VALUES('6dd7dddbe24242ab89e45869ba5f6dfa', 'test1234', 'password', 'Hoon', 'ACTIVE', '2023-04-27', NULL, NULL, '2023-04-27 14:33:40.807', '2023-04-27 14:33:40.807');
INSERT INTO user_info (id, user_id, password, nickname, status, registration_date, pause_reason, pause_date, created_at, updated_at) VALUES('a6ea265b283946c89aecf56da229f595', 'test1234', 'password', 'Hoon', 'ACTIVE', '2023-04-27', NULL, NULL, '2023-04-27 16:30:16.618', '2023-04-27 16:30:16.618');

INSERT INTO board_info (id, name, `order`, status, created_at, updated_at) VALUES('2dv7cdqle24242ab89e45869ba5f6q33', 'study', 0, 'ACTIVE', '2023-04-27 14:33:40.807', '2023-04-27 14:33:40.807');


INSERT INTO article_info (id, subject, content, issue_at, status, board_info, created_at, updated_at) VALUES('74e04805cff544e6879562a852088b96', '[스프링 부트/Spring Boot] JAVA 게시판 만들기', '글 내용 미리보기2', '20230421', 'ACTIVE', '2dv7cdqle24242ab89e45869ba5f6q33', '2023-04-27 16:43:09.000', '2023-04-27 16:43:09.000');
INSERT INTO article_info (id, subject, content, issue_at, status, board_info, created_at, updated_at) VALUES('7e4dffe6023a480cb8e13c3d7d63a43a', '[스프링 부트/Spring Boot] 스프링 게시판 만들기', '글 내용 미리보기1', '20230425', 'ACTIVE', '2dv7cdqle24242ab89e45869ba5f6q33', '2023-04-27 16:43:09.000', '2023-04-27 16:43:09.000');
INSERT INTO article_info (id, subject, content, issue_at, status, board_info, created_at, updated_at) VALUES('b277e693d5814a24ab304237c0de9aa5', '[스프링 부트/Spring Boot] Hello 게시판 만들기', '글 내용 미리보기3', '20230411', 'ACTIVE', '2dv7cdqle24242ab89e45869ba5f6q33', '2023-04-27 16:43:09.000', '2023-04-27 16:43:09.000');
