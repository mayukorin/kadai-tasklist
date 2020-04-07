package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.task;

public class TaskValidator {



    public static List<String> validate(task t) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    public static String _validateContent(String content) {
        if (content == null|| content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }

}
