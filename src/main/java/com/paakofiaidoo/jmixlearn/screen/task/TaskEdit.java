package com.paakofiaidoo.jmixlearn.screen.task;

import io.jmix.ui.screen.*;
import com.paakofiaidoo.jmixlearn.entity.Task;

@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
}