class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
    
  public boolean add(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
    head = newNode;
    return true;
  }
  
  public boolean remove(String name) {
    GroceryNode current = head;
    GroceryNode previous = current;
    if (current == null){
      return false;
    }
    else {
      while (current != null){
        if (name.equals(current.data.name)){
          previous.next = current.next;
          current.next = null;
          
          return true;
        }
        previous = current;
        current = current.next;
      }
    }
    return false;
  }
  
public boolean markAsBought(String name) {
    GroceryNode current = head;
    
    while (current != null) {
      if (current.data.equals(new GroceryItem(name, 0))) {
        current.data.isBoughtTrue();
        return true;
      }
      current = current.next;
    }
    return false;
  }
  
  public void display() {
    GroceryNode current = head;

    while(current != null){
      System.out.println(current.data);
      current = current.next;
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}
