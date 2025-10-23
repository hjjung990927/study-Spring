drop table tbl_member;

delete from tbl_member
where id = 1;

create table tbl_member (
    id bigint unsigned auto_increment primary key,
    member_email varchar(255) not null unique,
    member_password varchar(255) not null,
    member_name varchar(255),
    member_status enum('active', 'inactive') default 'active',
    member_gender enum('man', 'woman', 'none') default 'none',
    created_date datetime default current_timestamp,
    updated_date datetime default current_timestamp
);

# 실행: ctrl + Enter
select * from tbl_member;

drop table tbl_product;

