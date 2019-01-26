package task.model;

import location.model.Location;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private int id;
    private String title;
    private String description;
    private String summary;
    private Status status;
    private boolean done;
    private LocalDate createDate;
    private LocalDate dueDate;
    private List<Skill> requiredSkills;
    private Priority priority;
    private Location location;
    private String createUserExternalId;
    private String assignedUserExternalId;

    public Task() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setRequiredSkills(List<Skill> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setCreateUserExternalId(String createUserExternalId) {
        this.createUserExternalId = createUserExternalId;
    }

    public void setAssignedUserExternalId(String assignedUserExternalId) {
        this.assignedUserExternalId = assignedUserExternalId;
    }

    public Task(int id, String title, String description, String summary, Status status, boolean done, LocalDate createDate, LocalDate dueDate, List<Skill> requiredSkills, Priority priority, Location location, String createUserExternalId, String assignedUserExternalId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.summary = summary;
        this.status = status;
        this.done = done;
        this.createDate = createDate;
        this.dueDate = dueDate;
        this.requiredSkills = requiredSkills;
        this.priority = priority;
        this.location = location;
        this.createUserExternalId = createUserExternalId;
        this.assignedUserExternalId = assignedUserExternalId;

    }

    public static class TaskBuilder {

        private int id;
        private String title;
        private String description;
        private String summary;
        private Status status;
        private boolean done;
        private LocalDate createDate;
        private LocalDate dueDate;
        private List<Skill> requiredSkills;
        private Priority priority;
        private Location location;
        private String createUserExternalId;
        private String assignedUserExternalId;

        public TaskBuilder() {

        }

        public TaskBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public TaskBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder withSummry(String summary) {
            this.summary = summary;
            return this;

        }

        public TaskBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public TaskBuilder withDone(boolean done) {
            this.done = done;
            return this;
        }

        public TaskBuilder withCreateDate(LocalDate createDate) {
            this.createDate = createDate;
            return this;
        }

        public TaskBuilder withDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }


        public TaskBuilder withRequiredSkills(List<Skill> requiredSkills) {
            this.requiredSkills = requiredSkills;
            return this;
        }

        public TaskBuilder withPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TaskBuilder withLocation(Location location) {
            this.location = location;
            return this;
        }

        public TaskBuilder withCreateUserExternalId(String createUserExternalId) {
            this.createUserExternalId = createUserExternalId;
            return this;
        }

        public TaskBuilder withAssignedUserExternalId(String assignedUserExternalId) {
            this.assignedUserExternalId = assignedUserExternalId;
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.id = this.id;
            task.title = this.title;
            task.description = this.description;
            task.summary = this.summary;
            task.assignedUserExternalId = this.assignedUserExternalId;
            task.createDate = this.createDate;
            task.createUserExternalId = this.createUserExternalId;
            task.done = this.done;
            task.dueDate = this.dueDate;
            task.location = this.location;
            task.priority = this.priority;
            task.requiredSkills = this.requiredSkills;
            task.status = this.status;

            return task;
        }

    }

}


