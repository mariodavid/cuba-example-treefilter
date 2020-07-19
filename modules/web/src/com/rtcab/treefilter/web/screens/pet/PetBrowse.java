package com.rtcab.treefilter.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.treefilter.entity.Pet;

@UiController("treefilter_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {
}