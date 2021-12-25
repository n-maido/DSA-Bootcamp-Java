# search a string for a particular char

my_string = "Hi my name is Nhi"
target = 'o'

# return true of found
def search_string(string, target):
    if string.find(target) != -1:
        return True
    else:
        return False

print(search_string(my_string, target))
