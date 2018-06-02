
testAdd1() {
	x = x + x
	assert(0, x)
}
testAdd2() {
	x = 5 + x
	assert(5, x)
}
testAdd3() {
	x = x + 5
	assert(5, x)
}
testAdd4() {
	y = 5 + 0;
	x = y + y
	assert(10, x)
	assert(5, y)
}

testDivide() {
	x = 15 + 0;
	y = 3 + 0;
	divide(x, y, result)
	assert(5, result)
}

testDivide2() {
	a = 15 + 0;
	divide(a, a, a)
	assert(1, a)
}

testDivideNotEven() {
	a = 3 + 0;
	b = 2 + 0;
	divide(a, b,c)
	assert(3, a)
	assert(2, b)
	assert(1, c)
}

testMultiply() {
	x = 5 + 0;
	y = 3 + 0;
	multiply(x, y, result)
	assert(15, result)
}

testMultiply2() {
	x = 5 + 0;
	multiply(x, x,x)
	assert(25, x)
}

testSubZero() {
	a = 0 - 1
	assert(0, a)
}

testMod0() {
	mod(165, 5,r0)
	assert(0, r0)
}
testMod1() {
	mod(7, 2,r1)
	assert(1, r1)
}
testMod2() {
	mod(6, 4,r2)
	assert(2, r2)
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

multiply(f1, f2, result) {
	f1i = 0 + 0;
	f2i = f2 + 0;
	while f2i !=0 do
		f1i = f1i + f1;
		f2i = f2i - 1
	endwhile;
	result = f1i + 0
}

divide(f1, f2, result) {
	f11 = f1 + 0;
	while f11 !=0 do
		f11 = f11 - f2;
		newRes = newRes + 1
	endwhile;
	result = newRes + 0
}

mod(a, n, r) {
	divide(a, n,parkplatz1);
	multiply(parkplatz1, n,parkplatz2);
	r = a - parkplatz2
}

euclid(a, b,r) {
	ai = a + 0;
	bi = b + 0;
	while a ==0 do
		r = b + 0;
		ai = ai + 1
	endwhile;
	while bi !=0 do
		isGreaterThan(ai, bi, aGroesserB);
		aGroesserB2 = aGroesserB + 0;
		while aGroesserB !=0 do
			ai = ai - bi;
			aGroesserB = 0 + 0
		endwhile;
		while aGroesserB2 ==0 do
			bi = bi - ai;
			aGroesserB2 = 1 + 0
		endwhile
	endwhile;
	r = ai + 0

}

isGreaterThan(a, b,r) {
	ai = a + 0;
	bi = b + 0;
	parkplatz = a - b;
	r = 0 + 0;
	while parkplatz !=0 do
		r = 0 + 1;
		parkplatz = 0 + 0
	endwhile
}



