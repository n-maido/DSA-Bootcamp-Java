# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

def main():
    print("hi")
    nums = [5,7,7,8,8,10]
    target = 8
    print(searchRange(nums, target))

def searchRange(nums, target):
    ans = [-1, -1]

    # iteration 1: find 1st occurence; keep going left
    ans[0] = search(nums, target, True)

    if ans[0] != -1:
        # iteration 2: find last occurence
        ans[1] = search(nums, target, False)
    return ans


def search(nums, target, findStartIndex):
    ans = -1
    start = 0
    end = len(nums) - 1

    while start <= end:
        # find middle index
        mid = round(start + (end - start) / 2)

        if target < nums[mid]:
            # check left side
            end = mid - 1
        elif target > nums[mid]:
            # check right side
            start = mid + 1
        else:
            # ans found
            ans = mid
            if findStartIndex:
                end = mid - 1 # search left
            else:
                start = mid + 1 # search right
    return ans

if __name__ == "__main__":
    main()

