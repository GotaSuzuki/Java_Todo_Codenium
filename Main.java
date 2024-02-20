import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    TodoList TodoList = new TodoList();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("------------------------------");
      System.out.println("操作を選択してください:");
      System.out.println("0. タスクを追加");
      System.out.println("1. タスクを削除");
      System.out.println("2. タスクを表示");
      System.out.println("3. タスクを編集");
      System.out.println("4. 終了");
      System.out.print(">>>");

      int choiceNum = scanner.nextInt();
      scanner.nextLine();


      switch (choiceNum) {
        case 0:
          System.out.print("新しいタスクを入力して下さい:");
          String todo = scanner.nextLine();
          TodoList.addItem(todo);
          break;

        case 1:
          System.out.print("削除するタスクのIDを入力して下さい:");
          String id = scanner.nextLine();
          TodoList.deleteItem(id);
          break;

        case 2:
          TodoList.displayTodo();
          break;

        case 3:
          System.out.print("編集するタスクのIDを入力して下さい:");
          String editId = scanner.nextLine();
          System.out.print("編集後のタスクを入力して下さい:");
          String editTodo = scanner.nextLine();
          TodoList.editItem(editId, editTodo);
          break;

        case 4:
          System.out.println("アプリケーションを終了します");
          scanner.close();
          System.exit(0);
          break;
        default:
          System.out.println("無効な選択です。もう一度試して下さい");
      }
    }
  }
}