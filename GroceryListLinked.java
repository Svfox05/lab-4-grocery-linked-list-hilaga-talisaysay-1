class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  // item -> boolean
  // add a given item at the top of the list
  /* Fields:
   * head -- GroceryNode
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * GroceryNode(Fields)
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * GroceryItem(Methods)
   * equals(Object)
   * toString()
   * addQuantity(int)
   * isBoughtTrue()
   * 
   */
  public boolean add(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
    head = newNode;
    return true;
  }
  // String -> boolean
  // returns true if the removal of the item with the given name is successful
  
  /* Fields:
   * head -- GroceryNode
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * GroceryNode(Fields)
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * GroceryItem(Methods)
   * equals(Object)
   * toString()
   * addQuantity(int)
   * isBoughtTrue()
   * 
   */
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
  // name -> boolean
  // returns true if the marking of the item with the given name is successful
  /* Fields:
   * head -- GroceryNode
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * GroceryNode(Fields)
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * GroceryItem(Methods)
   * equals(Object)
   * toString()
   * addQuantity(int)
   * isBoughtTrue()
   * 
   */
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
  //  -> void
  // returns nothing but prints all the elements in the Linked List
  /* Fields:
   * head -- GroceryNode
   * 
   * Methods:
   * add()
   * remove()
   * markAsBought()
   * display()
   * 
   * GroceryNode(Fields)
   * data -- GroceryItem
   * next -- GroceryNode
   * 
   * GroceryItem(Methods)
   * equals(Object)
   * toString()
   * addQuantity(int)
   * isBoughtTrue()
   * 
   */
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
