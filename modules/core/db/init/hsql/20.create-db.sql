-- begin TREEFILTER_PET
alter table TREEFILTER_PET add constraint FK_TREEFILTER_PET_ON_TOP_LEVEL_PARENT foreign key (TOP_LEVEL_PARENT_ID) references TREEFILTER_PET(ID)^
alter table TREEFILTER_PET add constraint FK_TREEFILTER_PET_ON_PARENT foreign key (PARENT_ID) references TREEFILTER_PET(ID)^
create index IDX_TREEFILTER_PET_ON_TOP_LEVEL_PARENT on TREEFILTER_PET (TOP_LEVEL_PARENT_ID)^
create index IDX_TREEFILTER_PET_ON_PARENT on TREEFILTER_PET (PARENT_ID)^
-- end TREEFILTER_PET