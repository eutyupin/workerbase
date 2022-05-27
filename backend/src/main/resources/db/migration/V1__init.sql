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