class Solution:
    def totalNumbers(self, a: List[int]) -> int:
        return len({p for p in permutations(a,3)if~p[2]%2*p[0]})