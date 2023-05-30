package ru.netology.javaqa;

public class Meeting extends Task {
    String topic;
    String project;
    String start;


    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.project = project;
        this.topic = topic;
        this.start = start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }
}
