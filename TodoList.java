import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

class Todo{
  String todo;
  String randomId;

  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }
}

public class TodoList {
  Map<String, Todo> list = new LinkedHashMap<>();

  public void addItem(String todo) {
    Todo newTodo = new Todo();
    newTodo.setTodo(todo);
    newTodo.randomId = UUID.randomUUID().toString();
    list.put(newTodo.randomId, newTodo);
  }

  public void displayTodo() {
    for (Todo todo : list.values()) {
      System.out.print(todo.randomId + ": ");
      System.out.println(todo.getTodo());
    }
  }

  public void deleteItem(String id) {
    list.remove(id);
  }

  public void editItem(String id, String todo) {
    list.get(id).setTodo(todo);
  }
}
