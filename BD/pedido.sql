--------------------------------------------------------
-- Archivo creado  - domingo-marzo-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PEDIDO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."PEDIDO" 
   (	"ID" NUMBER, 
	"TIPOIDENTIFICACION_CLIENTE" NUMBER, 
	"NUMEROIDENTIFICACION_CLIENTE" VARCHAR2(20 BYTE), 
	"FECHAENTREGA" DATE, 
	"DIRECCIONENTREGA" VARCHAR2(20 BYTE), 
	"VALORPEDIDO" NUMBER
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.PEDIDO
SET DEFINE OFF;
