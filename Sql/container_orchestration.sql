create table if not exists container_orchestration(
apt_get_code varchar(255) not null,
apt_get_url varchar(255) null,
apt_mark varchar(255) null,
default_container varchar(255) null,
container_runtime varchar(255) null,
core_dns varchar(255) null,
kube_virt varchar(255) null,
application_interface Integer null,
calico varchar(255) null,
pods_list varchar(255) null,
status varchar(255) null,
constraint container_orchestration_pk primary key(apt_get_code));