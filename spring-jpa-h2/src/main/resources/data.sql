--ONE TO ONE
INSERT INTO EMPLOYEE (id, first_name, last_name,email, account_id) VALUES
  (1, 'Gupta', 'Charan','abc@gmail.com',1),
  (2, 'Vu', 'Hunt','xyz@email.com',2),
  (3, 'American', 'Eagle', 'cap@marvel.com',3);

INSERT INTO ACCOUNT(id, acc_number) values
(20,'234567'),
(55,'876545'),
(66,'999878');

--ONE TO MANY
INSERT INTO STUDENT (id, name, email, account_id) VALUES
  (1, 'Gupta', 'abc@gmail.com',20),
  (2, 'Vu', 'xyz@email.com',55),
  (3, 'America', 'cap@marvel.com',66);

INSERT INTO STUDENT_PHONE (student_id, phone_id) VALUES
  (1, 299),
  (1, 400),
  (1, 399);

INSERT INTO PHONE (id, type, number) VALUES
  (299, 'House', '111-222-3456'),
  (400, 'Office', '111-666-3456'),
  (399, 'Mobile', '222-344-8977');

-- select stud.* , phon.* from Student stud
-- join student_phone sp on stud.id = sp.student_id
-- join phone phon on sp.phone_id = phon.id


-- Many TO Many
INSERT INTO STUDENT_COURSE (student_id, course_id) VALUES
  (1, 1),
  (1, 2),
  (1, 3),
  (2, 1),
  (2, 2),
  (3, 1);

INSERT INTO Course (id, name) VALUES
  (1, 'Java'),
  (2, 'Machine Learning'),
  (3, 'Python');


-- Many To Many
insert into SUBSCRIPTION(id, name) values
(1,'Sports'),
(2,'Politics'),
(3,'Jokes');

insert into reader(id, email,first_name,last_name) values
(1,'1@email.com','1','1-last'),
(2,'2@email.com','2','2-last'),
(3,'3@email.com','3','3-last');

insert into READER_SUBSCRIPTION(reader_id, subscription_id) values
(1,1),
(1,2),
(1,3),

(2,1),
(2,3),

(3,3),
(3,2);