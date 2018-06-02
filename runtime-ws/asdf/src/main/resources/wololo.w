

testAdd1() {
	x = x + x
	print(x)
}
testAdd2() {
	x = 5 + x
	assert(5, x)
	print(x)
}
testAdd3() {
	x = x + 5
	assert(5, x)
}

testDivide() {
	x = 15 + 0;
	y = 3 + 0;
	divide(x, y, result)
	assert(5, result)
}

testDivide2() {
	a = 15 + 0;
	divide(a, a,a)
	assert(1, a)
	print(a)
}

testMultiply() {
	x = 5 + 0;
	y = 3 + 0;
	multiply(x, y, result)
	assert(15, result)
}

tetsMultiply2() {
	x = 5 + 0;
	multiply(x, x,x)
	assert(25, x)
}

multiply(f1, f2, result) {
	copy(0, f1i);
	copy(f2, f2i);
	while f2i !=0 do
		f1i = f1i + f1;
		f2i = f2i - 1
	endwhile;
	copy(f1i, result)
}

programmAusSkriptSeite23() {
	x1 = x0 + 5;
	while x1 !=0 do
		x2 = x2 + 8;
		x1 = x1 - 1
	endwhile
	assert(0, x1)
	assert(40, x2)
}

divide(f1, f2, result) {
	copy(f1, f11);
	while f11 !=0 do
		f11 = f11 - f2;
		result = result + 1
	endwhile
}