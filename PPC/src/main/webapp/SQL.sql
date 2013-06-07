insert into usuario (usu_st_login, usu_bl_ativo, usu_st_senha)
values ('TESTE', true, 'a');

delete from usuario where usu_st_login = 'teste';

update usuario set usu_st_login = 'RICARDO' where  usu_st_login = 'ricardo';

select * from usuario;
