
testDivide() {
	x = 15 + 0;
	y = 3 + 0;
	divide(x, y, result)
	assert(5, result)
}

testMultiply() {
	x = 5 + 0;
	y = 3 + 0;
	multiply(x, y, result) 
	assert(15, result)
}

multiply(f1, f2, result) {
	copy(f2, f21);
	while f21 !=0 do
		result = result + f1;
		f21 = f21 - 1
	endwhile
}

divide(f1, f2, result) {
	copy(f1, f11);
	while f11 !=0 do
		f11 = f11 - f2;
		result = result + 1
	endwhile
}