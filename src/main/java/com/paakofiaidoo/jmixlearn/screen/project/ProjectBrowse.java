package com.paakofiaidoo.jmixlearn.screen.project;

import io.jmix.ui.screen.*;
import com.paakofiaidoo.jmixlearn.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}