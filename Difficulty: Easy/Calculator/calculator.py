class Solution:
    def utility(self, a, b, opr):
        # code here
        if opr == 1:
            res = a+b
            print(str(res))
        elif opr == 2:
            res = a-b
            print(str(res))
        elif opr == 3:
            res = a*b
            print(str(res))
        else:
            print("Invalid Input")
        