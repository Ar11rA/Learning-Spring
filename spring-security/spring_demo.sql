create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
create table auth (id bigint not null auto_increment, password varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), username varchar(255), primary key (id)) engine=InnoDB
create table users_roles (user_id bigint not null, role_id bigint not null) engine=InnoDB
alter table auth add constraint UK_5re8bghl4sqkib3pcehhi4src unique (username)
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users_roles add constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)
alter table users_roles add constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)
