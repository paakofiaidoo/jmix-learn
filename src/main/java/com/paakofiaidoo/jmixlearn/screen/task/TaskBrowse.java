package com.paakofiaidoo.jmixlearn.screen.task;

import io.jmix.ui.screen.*;
import com.paakofiaidoo.jmixlearn.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}