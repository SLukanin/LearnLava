package Lesson19.Praktica;

import Lesson19.FileCopyFailedException;
import Lesson19.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask{

    private String from;
    private String to;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl(){

    }

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException("Что-то пошло не так, не получается скопировать");
        }

    }
}
