package com.paakofiaidoo.jmixlearn.screen.project;

import io.jmix.ui.screen.*;
import com.paakofiaidoo.jmixlearn.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}