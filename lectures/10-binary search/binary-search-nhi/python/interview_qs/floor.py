# Given a sorted array, find the largest element >= the target

def main():
    arr = [2, 3, 5, 9, 14, 16, 18]
    target = 15
    print(floor(arr, target))

# copy past ceiling
# return end instead of start   
def floor(arr, target):
    # check if target > biggest # in array
    if target > arr[len(arr) - 1]:
        return -1

    start = 0
    end = len(arr) - 1

    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if target < arr[mid]:
            # check left side
            end = mid - 1
        elif target > arr[mid]:
            # check right side
            start = mid + 1
        else:
            # target = mid
            return mid

    return end