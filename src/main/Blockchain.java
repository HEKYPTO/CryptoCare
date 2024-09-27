package main;

import base.Block;

import java.util.ArrayList;

public class Blockchain {
    private final ArrayList<Block> chain;
    private final int difficulty;

    public Blockchain(int difficulty) {
        chain = new ArrayList<>();
        this.difficulty = difficulty;

        chain.add(new Block("Genesis Block", "0"));
    }

    public void addBlock(Block newBlock) {
        newBlock.mineBlock(difficulty);
        chain.add(newBlock);
    }

    public Block getLatestBlock() {
        return chain.getLast();
    }

    public ArrayList<Block> getChain() {
        return new ArrayList<>(chain);
    }
}
