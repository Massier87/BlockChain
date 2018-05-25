import java.util.ArrayList;

/***
 *
 * Simple example for demonstrating the block chain concept.
 *
 */
public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"Miguel sent Theo 10000 bitcoins", "Victor sent Hector 20 bitcoins"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Theo sent Miguel 10 bitcoins", "Theo sent 10 bitcoins to PizzaHut"};
        Block block2 = new Block(genesisBlock.getBlockHash(),block2Transactions);

        String[] block3Transactions = {"Theo sent 10 bitcoins to Dominos"};
        Block block3 = new Block(block2.getBlockHash(),block2Transactions);

        System.out.println(genesisBlock.getBlockHash());
        System.out.println(block2.getBlockHash());
        System.out.println(block3.getBlockHash());
    }
}
