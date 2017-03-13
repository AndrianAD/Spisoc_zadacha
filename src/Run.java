public  class Run {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(18);
        list.delete(3);
        int a = list.get(2);
        System.out.println(a);
    }

    static class LinkedList {
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
            if (index > (size - 1) || index < 0) {
                return false;
            }
            if (index == 0){
                head = head.getNext();
            }
            int tempsize=size-1;
            if(index==tempsize){
                for (int j=0;j<tempsize; j++){
                    delNode=delNode.getNext();
                    tail=delNode;
                    }
                size--;
            }
            return true;
        }
    }
}





