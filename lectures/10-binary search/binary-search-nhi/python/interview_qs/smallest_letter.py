# Given a sorted array of chars, find the smallest char > the target
# If no elem exists, return the 1st elem
# https://leetcode.com/problems/find-smallest-letter-greater-than-target/

def main():
    letters = ['c', 'f', 'j']
    target = 'k'
    print(nextGreatestLetter(letters, target))

# copy past BS
# return start instead of mid  
def nextGreatestLetter(letters, target): 
    start = 0
    end = len(letters) - 1

    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if target < letters[mid]:
            # check left side
            end = mid - 1
        else:
            # check right side
            start = mid + 1

    return letters[start % len(letters)]
    
    

