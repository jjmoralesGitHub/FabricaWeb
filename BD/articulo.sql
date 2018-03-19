--------------------------------------------------------
-- Archivo creado  - domingo-marzo-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ARTICULO
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ARTICULO" 
   (	"ID" NUMBER, 
	"NOMBRE" VARCHAR2(20 BYTE), 
	"DESCRIPCION" VARCHAR2(20 BYTE), 
	"VALOR" NUMBER, 
	"IDTIPOROPA" NUMBER, 
	"URLFOTO" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.ARTICULO
SET DEFINE OFF;
