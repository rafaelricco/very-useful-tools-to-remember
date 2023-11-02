CREATE SCHEMA IF NOT EXISTS very_useful_tools;

create table IF NOT EXISTS very_useful_tools.very_useful_tools
(
    id serial not null,
    title text not null,
    link text not null,
    description text not null,
    tags text not null,
    constraint id_pkey primary key(id)
)