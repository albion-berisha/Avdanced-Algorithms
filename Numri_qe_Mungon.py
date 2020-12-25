def lexo_tjetrin(s, i, gjatesia, i_pritur):
    for L in range(2):
        b = int(s[i:i+gjatesia + L])
        if b in (i_pritur, i_pritur + 1):
            return b, i + gjatesia + L
    return False
     
def numri_munges(s):
    n = len(s)
    for gjatesia in range(1, 6):
        akt = int(s[:gjatesia])
        i = gjatesia
        cand = None
        while i < n:
            rn = lexo_tjetrin(s, i, gjatesia, akt + 1)
            if not rn:
                break
            alternativa = akt + 2
            akt, i = rn
            if akt == alternativa:
                if cand:
                    break
                cand = akt - 1
        if cand and i >= n:
            return cand
 
vazhdo = True
while(vazhdo):
    stringu_im=input("Shenoni vargun e numrave si String: ")
    print(numri_munges(stringu_im))
    vazhdoni = input("A deshironi te beni ndonje gjetje tjeter?(Po/Jo) ")
    if(vazhdoni !="Po"):
        vazhdo = False