create table genders
(
    id              bigserial primary key,
    title           varchar(1)
);

create table categories
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table positions
(
    id              bigserial primary key,
    title           varchar(255) not null,
    category_id     bigint references categories(id)
);

create table employees
(
    id              bigserial primary key,
    fio             varchar(255) not null,
    gender_id       bigint references genders(id),
    age             numeric(3,0) not null,
    position_id     bigint references positions(id),
    address         varchar(255),
    created_at      timestamp default current_timestamp,
    updated_at      timestamp default current_timestamp
);

insert into genders (title)
values ('М'),
       ('Ж');

insert into categories (title)
    values ('рабочая специальность'),
           ('специалист'),
           ('служащий');

insert into positions (title, category_id)
values ('слесарь', 1),
       ('инженер-электроник', 2),
       ('мастер', 3);

insert into employees (fio, gender_id, age, position_id)
values ('Сергеев Сергей Сергеевич', 1, 27, 1),
       ('Иванов Иван Иванович', 1, 38, 2),
       ('Семенов Семен Семенович', 1, 43, 3),
       ('Привалова Надежда Сергеевна', 2, 56, 3),
       ('Старовойтова Светлана Ивановна', 2, 47, 2),
       ('Аникина Екатерина Викторовна', 2, 31, 3);


-- create table employees_genders
-- (
--     id                      bigserial primary key,
--     employee_id             bigint references employees (id),
--     gender_id               bigint references genders (id),
--     created_at              timestamp default current_timestamp,
--     updated_at              timestamp default current_timestamp
-- );
--
-- create table employees_positions
-- (
--     id                      bigserial primary key,
--     employee_id             bigint references employees (id),
--     position_id               bigint references positions (id),
--     created_at              timestamp default current_timestamp,
--     updated_at              timestamp default current_timestamp
-- );
--
-- create table positions_categories
-- (
--     id                      bigserial primary key,
--     position_id             bigint references positions (id),
--     category_id             bigint references categories (id),
--     created_at              timestamp default current_timestamp,
--     updated_at              timestamp default current_timestamp
-- );
--
-- insert into employees_genders (employee_id, gender_id)
-- values (1,1),
--        (2,1),
--        (3,1),
--        (4,2),
--        (5,2),
--        (6,2);
--
-- insert into employees_positions (employee_id, position_id)
-- values (1,1),
--        (2,2),
--        (3,3),
--        (4,3),
--        (5,2),
--        (6,2);
--
-- insert into positions_categories (position_id, category_id)
-- values (1,1),
--        (2,2),
--        (3,3);