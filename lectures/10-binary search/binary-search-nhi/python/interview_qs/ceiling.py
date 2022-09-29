# Given a sorted array, find the smallest element >= the target
def main():
    arr = [2, 3, 5, 9, 14, 16, 18]
    target = 15
    print(ceiling(arr, target))

# copy past BS
# return start instead of mid   
def ceiling(arr, target):
    # check if target > biggest # in array
    if target > arr[len(arr) - 1]:
        return -1

    startIndex = 0
    endIndex = len(arr) - 1

    while startIndex <= endIndex:
        # find middle index
        midIndex = round(startIndex + (endIndex - startIndex) / 2)
        print(f"middle: {midIndex}")

        if target < arr[midIndex]:
            # check left side
            endIndex = midIndex - 1
        elif target > arr[midIndex]:
            # check right side
            startIndex = midIndex + 1
        else:
            # target = mid
            return arr[midIndex]

    return arr[startIndex]
    
if __name__ == "__main__":
    main()
