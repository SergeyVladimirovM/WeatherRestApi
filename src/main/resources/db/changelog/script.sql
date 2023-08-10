create table weather (
                         id serial primary key,
                         country varchar(255),
                         city varchar(255),
                         temperature int,
                         created_at timestamp
)