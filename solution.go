func moveZeroes(nums []int)  {
    i := 0
    for _, num := range nums {
        if (num != 0) {
            nums[i] = num
            i += 1
        }
    }
    for ; i < len(nums); i++ {
        nums[i] = 0
    }
}