import java.util.ArrayList;
/** ADT
 * 
 */
public class IntegerSet {

    ArrayList<Integer> Numbers ; //Rep

    // Rep Invariant (RI):
    //  - ห้ามมี null
    //  - ห้าม มีตัวเลขซ้ำ
    //
    // Abstraction Function (AF):
    //  - Numbers คือเซตของตัวเลขจำนวนเต็มใดๆ ที่เรียงลำดับจากน้อยไปมาก

    public IntegerSet(){
        Numbers = new ArrayList<>();
    }

    private void CheckRep(){

    }

    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param n ตัวอักษรที่ต้องการเพิ่ม
     */

    public void add(Integer x){
        Numbers.add(x);
        if (x != null) {
            for( int i = 0 ; i <  Numbers.size(); i++){
                
            }
        }
        CheckRep();
    
    }




    public String toString(){
        return Numbers.toString();
    }


}