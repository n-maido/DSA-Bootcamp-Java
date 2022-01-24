# https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

def main():
    nums = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170]
    target = 10
    print(infinite_array(nums, target))

def infinite_array(nums, target):
    # find range
    # start with a box of size 2
    start = 0
    end = 1

    # determine range
    # condition for target to lie in range: target< end
    # if target < end, there's no point in finding start
    # find end 1st, then apply bs
    while target > nums[end]:
        newStart = end + 1
        # double the box size: old end + size of box * 2
        end = end + (end - start + 1) * 2
        start = newStart

    return binary_search(nums, target, start, end)

def binary_search(arr, target, start, end):
    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            # check left side
            end = mid - 1
        elif target > arr[mid]:
            # check right side
            start = mid + 1
    return -1

if __name__ == "__main__":
    main() 