public class AppLinkd {
    public static void main(String[] args){
        JLInked <Integer> Node = new JLInked<>();
        Node.addNode(11);
        Node.addNode(1);
        Node.addNode(15);
        Node.deleteNode(14);

        Node.display();
    }
}
