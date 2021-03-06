package duke.command;

import duke.other.DukeException;
import duke.other.Ui;
import duke.task.TaskList;

public class DoneCommand extends Command {
    private String instruction;
    private String[] replyArr;

    public DoneCommand(String instruction, String[] replyArr) {
        this.instruction = instruction;
        this.replyArr = replyArr;
    }

    public String execute(TaskList taskList, Ui ui)  {
        return taskList.markTaskAsDone(replyArr);
    }

}
