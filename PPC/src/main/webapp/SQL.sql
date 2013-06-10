insert into usuario (usu_st_login, usu_bl_ativo, usu_st_senha)
values ('TESTE', true, 'a');

delete from usuario where usu_st_login = 'teste';

update usuario set usu_st_login = 'RICARDO' where  usu_st_login = 'ricardo';
update usuario set usu_st_empresa = 'OMNI' where  usu_st_login = 'RICARDO';
update usuario set usu_st_empresa = 'LAVOISIER' where  usu_st_login = 'TESTE';

alter table usuario add empresa varchar;
alter table usuario drop column empresa;
alter table usuario add usu_st_empresa varchar;

select * from usuario;
