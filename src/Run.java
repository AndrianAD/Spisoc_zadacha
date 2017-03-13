public  class Run {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.delete(0);
        int a =list.get(0);
        System.out.println(a);
        list.size();

    }

   public static class LinkedList {
            private Node head;
            private Node tail;
            int size;


            public LinkedList() {
                head = null;
                tail = null;
                size = 0;

            }

            public void add(Integer data) {
                Node newNode = new Node();
                newNode.setData(data);
                if (tail == null) {
                    tail = newNode;
                    head = newNode;
                    size++;
                } else {
                    tail.setNext(newNode);
                    tail = newNode;
                    size++;
                }
            }

            public Integer get(int index) {
                Node findNode = head;
                if (findNode == null || index > (size - 1) || index < 0) {
                    return null;
                }
                for (int i = 0; i < index; i++) {
                    findNode = findNode.getNext();
                }
                return findNode.getData();
            }


            public boolean delete(int index) {
                Node delNode = head;
                Node curNode = head;
                Node prevNode = head;
                int tempsize = size - 1;

                if (index > (size - 1) || index < 0) {
                    return false;
                }

                if (head == tail) {
                    tail = null;
                    head = null;
                    size--;
                    return true;
                 }

                if (index == 0) {
                    head = head.getNext();
                    size--;
                    return true;
                   }

                    if (index == tempsize) {
                        for (int j = 0; j < tempsize; j++) {
                            delNode = delNode.getNext();
                            tail = delNode;
                        }
                        size--;
                        return true;

                    }


                else    {
                    while (curNode != null) {
                        curNode = curNode.getNext();
                        for (int i = 0; i < (index-1); i++) {
                            prevNode = curNode;
                            curNode = curNode.getNext();
                        }
                        prevNode.setNext(curNode.getNext());
                        size--;
                        return true;

                    }
                }
               return true;
            }

            public int size() {
                if (size<=0)
                    return 0;
                else
                    return size;

            }

    }
}
