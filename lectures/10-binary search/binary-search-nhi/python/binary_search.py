# basic implementation of binary search

def main():
    arr = [2, 3, 5, 7, 19, 89]
    target = 5
    ans = binary_search(arr, target)
    print(ans)

    arr2 = [89, 19, 7, 5, 3, 2]
    print(agnostic_bs(arr2, target))

# returns index of target, -1 elsewise
# takes an array sorted in ascending order
def binary_search(arr, target):
    start = 0
    end = len(arr) - 1

    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            # check left side
            end = mid - 1; 
        elif target > arr[mid]:
            # check right side
            start = mid + 1;
    return -1

# returns index of target, -1 elsewise
# takes an array sorted in any order
def agnostic_bs(arr, target):
    start = 0
    end = len(arr) - 1

    # determine sort order
    isAsc = arr[start] < arr[end]

    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if arr[mid] == target:
            return mid

        if isAsc:
            if target < arr[mid]:
                # check left side
                end = mid - 1; 
            elif target > arr[mid]:
                # check right side
                start = mid + 1;
        else:
            if target > arr[mid]:
                # check left side
                end = mid - 1; 
            elif target < arr[mid]:
                # check right side
                start = mid + 1;
    return -1



if __name__ == "__main__":
    main()