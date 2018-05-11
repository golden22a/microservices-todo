CREATE TABLE if not exists todos  (
  ID serial,
  title varchar(120) NOT NULL,
  done boolean default FALSE
);
