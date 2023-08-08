create table weather (
                         id serial primary key,
                         country varchar(255),
                         city varchar(255),
                         temperature double precision,
                         created_at timestamp
)