class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < deck.length; i++) {
            queue.offer(i);
        }

        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            
            result[queue.poll()] = deck[i];

            if (!queue.isEmpty())
                queue.offer(queue.poll());
            else break;
            
        }

        return result;
    }
}