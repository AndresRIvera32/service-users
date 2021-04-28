INSERT INTO users (username, password, enabled, name, lastname, email) VALUES('andres', '$2a$10$m9ZHVr1j2Dja4H/wP6yk7ejAqM3ACrFGQItb366JWtS6elDgC6Tau', true, 'Andres', 'Rivera', 'andres@outlook.com');
INSERT INTO users (username, password, enabled, name, lastname, email) VALUES('admin', '$2a$10$4ywjK4Eb2MsLWtfvaQq5vOg5wkwUAAWN1DwYKGyy2d.XD1t0/tr5C', true, 'Admin', 'garcia', 'paco@outlook.com');

INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES (1,1);
INSERT INTO users_roles (user_id, role_id) VALUES (2,2);
INSERT INTO users_roles (user_id, role_id) VALUES (2,1);