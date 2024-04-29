print("what")

class GameItem:
    def __init__(self, x, y):
        self.xLoc = x
        self.yLoc = y

    def __str__(self):
        return "("+str(self.xLoc)+","+str(self.yLoc)+")"
    def move(self,x,y):
        self.xLoc+=x
        self.yLoc+=y
class HealthPotion(GameItem):
    def __init__(self, x,y,heal):
        super().__init__(x, y)
        self.heal = heal
    def __str__(self):
        temp=super().__str__()
        return temp+" heal: "+str(self.heal)
    def getHeal(self):
        return self.heal
gi=GameItem(2,3)
print(gi)
gi.move(1,2)
print(gi)
gi2=HealthPotion(1,2,3)
print(gi2)
aList=[gi,gi2,GameItem(3,4),HealthPotion(5,6,7)]
for item in aList:
    item.move(10,10)
    print(" "+str(item))
    item.getHeal()
