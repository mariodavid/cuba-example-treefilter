package com.rtcab.treefilter.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.treefilter.entity.Pet;

@UiController("treefilter_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {

    @Subscribe
    protected void onBeforeCommitChanges(BeforeCommitChangesEvent event) {

        if (getEditedEntity().getParent() != null) {
            getEditedEntity().setTopLevelParent(getEditedEntity().getParent().getTopLevelParent());
        }
        else {
            getEditedEntity().setTopLevelParent(getEditedEntity());
        }
    }


}