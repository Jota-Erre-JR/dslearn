INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp Web Developer', 'C:\ws-bootcampds\dslearn\assets\img\full-stack-web-developer.png', 'C:\ws-bootcampds\dslearn\assets\img\full-stack-web-developer-gray.png')

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITHOUT TIME ZONE '2020-11-20T00:00:00', TIMESTAMP WITHOUT TIME ZONE '2021-11-20T00:00:00', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITHOUT TIME ZONE '2021-11-20T00:00:00', TIMESTAMP WITHOUT TIME ZONE '2022-11-20T00:00:00', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha WEB', 'Trilha Principal do Curso', 1, 'C:\ws-bootcampds\dslearn\assets\img\rocket.png', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Fórum', 'Tire suas dúvidas.', 2, 'C:\ws-bootcampds\dslearn\assets\img\suport.png', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives Exclusivas', 3, 'C:\ws-bootcampds\dslearn\assets\img\community.png', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 1', 'Introdução HTML', 1, 'C:\ws-bootcampds\dslearn\assets\img\html-css.png', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 2', 'Introdução CSS', 2, 'C:\ws-bootcampds\dslearn\assets\img\html-css.png', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 3', 'Tópicos Especiais', 3, 'C:\ws-bootcampds\dslearn\assets\img\html-css.png', 1, 2);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 4', 'Projeto Final', 4, 'C:\ws-bootcampds\dslearn\assets\img\html-css.png', 1, 3);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) Values (1, 1, TIMESTAMP WITHOUT TIME ZONE '2020-11-20T10:00:00', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) Values (2, 1, TIMESTAMP WITHOUT TIME ZONE '2020-11-20T18:42:00', null, true, false);
