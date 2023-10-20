CREATE SCHEMA IF NOT EXISTS very_useful_tools;

create table IF NOT EXISTS very_useful_tools.very_useful_tools
(
    id serial not null,
    title varchar not null,
    link varchar not null,
    description varchar not null,
    tags varchar not null
    constraint id_pkey primary_key(id)
)