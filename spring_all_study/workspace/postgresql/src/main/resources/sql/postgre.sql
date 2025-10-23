set timezone = 'Asia/Seoul';
select now();

select to_char(now(), 'YYYY년 MM월 DD일') 현재시간;
select to_date('2025년 09월 22일', 'YYYY년 MM월 DD일');
select 'a' || 'b';

create type status as enum('active', 'inactive');

create table tbl_member(
    id bigint generated always as identity primary key,
    member_email varchar(255) not null unique,
    member_password varchar(255) not null,
    member_name varchar(255),
    member_status status default 'active',
    created_date timestamp default now(),
    updated_date timestamp default now()
);

select * from tbl_member;

create table tbl_post(
    id bigint generated always as identity primary key,
    post_status status default('active'),
    member_id bigint not null,
    constraint fk_post_member foreign key(member_id)
        references tbl_member(id)
);

select * from tbl_member;