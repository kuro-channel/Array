
public class Array1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	//	Given an array of ints, return true if 6 appears as either the first or
	//	last element in the array. The array will be length 1 or more.
	//
	//	firstLast6([1, 2, 6]) → true
	//	firstLast6([6, 1, 2, 3]) → true
	//	firstLast6([13, 6, 1, 2, 3]) → false
	public boolean firstLast6(int[] nums) {
		// numsの要素数が0の場合
		if(nums.length <1){return false;};
		// numsの要素数が1以上の場合
		if(nums.length >=1){
			// 配列の先頭要素が6だった場合、trueを返す
			if(nums[0] == 6){
				return true;
			}else if(nums[nums.length-1]==6){
				return true;
			}
		}
		return false;
	}

	//	Given an array of ints, return true if the array is length 1 or more,
	//	and the first element and the last element are equal.
	//
	//	sameFirstLast([1, 2, 3]) → false
	//	sameFirstLast([1, 2, 3, 1]) → true
	//	sameFirstLast([1, 2, 1]) → true
	public boolean sameFirstLast(int[] nums) {
		// numsの要素数が0と1の場合
		switch (nums.length) {
		case 0:
			return false;
		case 1:
			return true;
		}
		// numsの要素先頭と同じ値の要素があった場合、trueを返す
		int first = nums[0];
		for(int i =1; i < nums.length; i++){
			if(nums[i] == first){
				return true;
			}
		}
		return false;
	}

	//	Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	//
	//	makePi() → [3, 1, 4]
	public int[] makePi() {
		int [] pi = {3,1,4};
		return pi;
	}

	//	Given 2 arrays of ints, a and b, return true if they have the same first element or
	//	they have the same last element. Both arrays will be length 1 or more.
	//
	//	commonEnd([1, 2, 3], [7, 3]) → true
	//	commonEnd([1, 2, 3], [7, 3, 2]) → false
	//	commonEnd([1, 2, 3], [1, 3]) → true
	public boolean commonEnd(int[] a, int[] b) {
		// aとbいずれかの配列が空の場合、falseとする
		if(a.length == 0 || b.length ==0){
			return false;
		}
		// aとbの先頭または最後方の値が同じだった場合、trueとする
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
			return true;
		}
		return false;
	}

	//	Given an array of ints length 3, return the sum of all the elements.
	//
	//	sum3([1, 2, 3]) → 6
	//	sum3([5, 11, 2]) → 18
	//	sum3([7, 0, 0]) → 7
	public int sum3(int[] nums) {
		int sum = 0;
		// 配列の要素分加算する
		for(int num: nums){
			sum = sum + num;
		}
		return sum;
	}

	//	Given an array of ints length 3, return an array with the elements
	//	"rotated left" so {1, 2, 3} yields {2, 3, 1}.
	//
	//	rotateLeft3([1, 2, 3]) → [2, 3, 1]
	//	rotateLeft3([5, 11, 9]) → [11, 9, 5]
	//	rotateLeft3([7, 0, 0]) → [0, 0, 7]
	public int[] rotateLeft3(int[] nums) {
		// 要素を左にずらす
		int[] result = {nums[1],nums[2],nums[0]};
		return result;
	}

	//	Given an array of ints length 3, return a new array with the elements
	//	in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	//
	//	reverse3([1, 2, 3]) → [3, 2, 1]
	//	reverse3([5, 11, 9]) → [9, 11, 5]
	//	reverse3([7, 0, 0]) → [0, 0, 7]
	public int[] reverse3(int[] nums) {
		// 配列の要素を逆さまにして返す
		int[] result = {nums[2],nums[1],nums[0]};
		return result;
	}

	// Given an array of ints length 3, figure out which is larger,
	// the first or last element in the array, and set all the other elements
	// to be that value. Return the changed array.
	//
	// maxEnd3([1, 2, 3]) → [3, 3, 3]
	// maxEnd3([11, 5, 9]) → [11, 11, 11]
	// maxEnd3([2, 11, 3]) → [3, 3, 3]
	public int[] maxEnd3(int[] nums) {
		// 配列の先頭と最後尾の要素を比べる
		if(nums[0] >= nums[2]){
			nums[0] = nums[0];
			nums[1] = nums[0];
			nums[2] = nums[0];
		}else if(nums[2] >= nums[0]){
			nums[0] = nums[2];
			nums[1] = nums[2];
			nums[2] = nums[2];
		}
		return new int[] { nums[0],nums[1],nums[2]};
	}

	// Given an array of ints, return the sum of the first 2 elements in the array.
	// If the array length is less than 2, just sum up the elements that exist,
	// returning 0 if the array is length 0.
	//
	// sum2([1, 2, 3]) → 3
	// sum2([1, 1]) → 2
	// sum2([1, 1, 1, 1]) → 2
	public int sum2(int[] nums) {
		int sum = 0;
		// 要素数が2個より少ない場合
		if(nums.length <2){
			for(int num: nums){
				sum = sum + num;
			}
			return sum;
		}
		// 要素の1番目と2番目を足す
		return nums[0] + nums[1];
	}
}
