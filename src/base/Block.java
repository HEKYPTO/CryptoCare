package base;

import util.HashGenerator;

public class Block {
    protected String data;
    protected String prevHash;
    protected String hash;
    protected long timestamp;
    protected long nonce;

    public Block(String data, String prevHash) {
        this.data = data;
        this.prevHash = prevHash;
        this.timestamp = System.currentTimeMillis();
        this.nonce = 0L;
        this.hash = calculateHash();
    }

    protected String calculateHash() {
        return HashGenerator.hash(prevHash + data + timestamp + nonce);
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while(!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }

        System.out.println("Block Mined: " + hash);
    }

    public String getData() {
        return data;
    }

    public String getHash() {
        return hash;
    }
}
