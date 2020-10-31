
public class Stringbuffer {
    
    public static void main(String[] args){

        // constructors 

        // StringBuffer s=new StringBuffer();
        // it reserves room for 16 characters 

        // StringBuffer s=new StringBuffer(20);
        // we can explicitly specify the capacity 

        // StringBuffer s=new StringBuffer("GeeksforGeeks");
        // It can take string as input and save room for 16 more characters 

        StringBuffer s = new StringBuffer("GeeksforGeeks");
        System.out.println("length = " + s.length() + " capacity = " + s.capacity());

        // append 

        // StringBuffer append(String str)
        // StringBuffer append(int num)        

        s = new StringBuffer("Geeks");
        s.append("forGeeks");
        s.append(6);
        System.out.println(s);

        // insert   
        // StringBuffer insert(int index, String str)
        // StringBuffer insert(int index, char ch)

        s.insert(2,"Yellow");
        s.insert(1,'h');
        System.out.println(s);

        // reverse() - It reverses the original string buffer also returns the reversed string buffer 

        // delete() and deleteCharAt()
        
        // StringBuffer delete(int startIndex, int endIndex)
        // StringBuffer deleteCharAt(int loc)

        s = new StringBuffer("Geeksforgeeks");
        s.delete(0,5);
        s.deleteCharAt(7);
        System.out.println(s);

        // replace
        // StringBuffer replace(int startIndex, int endIndex, String str)

        s = new StringBuffer("Geeksforgeeks");
        s.replace(5,8,"are");
        System.out.println(s);

        // It also supports charAt , substring , indexOf and any methods of strings
    }
}