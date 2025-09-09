class Solution {
    public int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);
        List<Integer> arl=new ArrayList<>();
        for(int i=0;i<mices.length;i++){
            arl.add(Math.abs(mices[i] - holes[i]));
        }
        return Collections.max(arl);
    }
};