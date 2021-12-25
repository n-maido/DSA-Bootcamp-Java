# the basic implementation of linear search

my_list = [23, 45, 1, 2, 3, 8, 19, -3, 16, -11, 28]
target = 19

# return index of target
def linear_search(list, target):
    if len(list) == 0:
        return -1
    
    for i in range(len(list)):
        if list[i] == target:
            return i
    
    return -1

print(linear_search(my_list, target)) 
    