package lec12interface.p2;

/**
 * final 修饰类，表示该类是最终类(不可派生子类)
 *
 * @author Administrator
 */
final class ChessBord {
    int data[][] = new int[64][64];
}

class ChineseChessBoard// extends ChessBord {// The type ChineseChessBoard cannot
        // subclass the final class ChessBord
{
}

public class FinalClassDemo {

}
