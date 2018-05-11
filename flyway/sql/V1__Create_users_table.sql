create table  if not exists USERS   (
    ID serial,
    USER_NAME varchar(100) NOT NULL,
    first_name varchar(150) NOT NULL,
    last_name varchar(150) NOT NULL
);
