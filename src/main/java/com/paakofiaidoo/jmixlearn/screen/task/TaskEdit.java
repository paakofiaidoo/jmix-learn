package com.paakofiaidoo.jmixlearn.screen.task;

import com.paakofiaidoo.jmixlearn.TaskService;
import io.jmix.ui.screen.*;
import com.paakofiaidoo.jmixlearn.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
    @Autowired
    private TaskService taskService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Task> event) {
        event.getEntity().setAssignee(taskService.findLeastBusyUser());
    }
}