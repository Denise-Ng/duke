package duke.command;

import duke.other.Ui;
import duke.task.TaskList;

public class UnknownCommand extends Command {
    private String instruction;

    public UnknownCommand(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Handles the unknown command.
     * @param taskList Overall TaskList of all the Tasks
     * @param ui       Overall Ui handling the ui of Duke
     * @return Returns the response of the bot to this command
     */
    public String execute(TaskList taskList, Ui ui) {
        String msg = "    Sorry! I don't understand what is " + instruction + ". Try \"help\" to get started.";
        System.out.println(msg);
        return msg;
    }
}
