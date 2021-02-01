def fun(numrat, nderto):
	if(numrat):
		for char in ["+","","-"]:
			tmp = nderto + char + numrat[0]
			fun(numrat[1:], tmp)
	elif(eval(nderto) == 100):
		print(nderto + "=100")
		
def shtypnumrat():
	fun("23456789","1")

shtypnumrat()
