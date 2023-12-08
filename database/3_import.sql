INSERT INTO kaob.role (id, name) VALUES (default, 'admin');
INSERT INTO kaob.role (id, name) VALUES (default, 'customer');
INSERT INTO kaob.role (id, name) VALUES (default, 'friend');


INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 1, 'admin', '123', 'A');
INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 2, 'ana', '123', 'A');
INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 2, 'kaia', '123', 'A');
INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 2, 'oliver', '123', 'A');
INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 2, 'mitteAktiivne', '123', 'D');
INSERT INTO kaob."user" (id, role_id, email, password, status) VALUES (default, 3, 'friend', '123', 'D');

