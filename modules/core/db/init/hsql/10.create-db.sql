-- begin TREEFILTER_PET
create table TREEFILTER_PET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOP_LEVEL_PARENT_ID varchar(36),
    PARENT_ID varchar(36),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TREEFILTER_PET
