/"Das Programm, welches im Skript auf Seite 23 steht."/
programmAusSkriptSeite23() {
	x1 = x0 + 5;
	while x1 !=0 do
		x2 = x2 + 8;
		x1 = x1 - 1
	endwhile
	assert(0, x1)
	assert(40, x2)
}

testAdd() {
	a = a + a;
	b = 5 + b;
	c = c + 5;
	e = 5 + 0;
	d = e + e
	assert(10, d)
	assert(5, e)
	assert(5, c)
	assert(0, a)
	assert(5, b)
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
	divide(a, b, c)
	assert(3, a)
	assert(2, b)
	assert(1, c)
}

testMultiply() {
	a = 5 + 0;
	b = 3 + 0;
	multiply(a, b, result);

	c = 5 + 0;
	multiply(c, c, c)
	assert(25, c)
	assert(15, result)
}

testSubZero() {
	a = 0 - 1
	assert(0, a)
}

testMod0() {
	mod(165, 5, r0)
	assert(0, r0)
}
testMod1() {
	mod(7, 2, r1)
	assert(1, r1)
}
testMod2() {
	mod(6, 4, r2)
	assert(2, r2)
}

testEuclid() {
	euclid(6, 3, r)
	assert(3, r)
}
testEuclid1() {
	euclid(21, 14, r)
	assert(7, r)
}
testEuclid2() {
	euclid(199, 68, r)
	assert(1, r)
}
testEuclid3() {
	euclid(54, 24, r)
	assert(6, r)
}

testGreaterThan() {
	isGreaterThan(5, 3, a);
	isGreaterThan(0, 0, b);
	isGreaterThan(0, 1, c);
	isGreaterThan(1, 0, d);
	isGreaterThan(50, 50, e)
	assert(1, a)
	assert(0, b)
	assert(0, c)
	assert(1, d)
	assert(0, e)
}

testGreaterThanOrEqual() {
	isGreaterThanOrEqual(5, 3, t1);
	isGreaterThanOrEqual(0, 0, t2);
	isGreaterThanOrEqual(1, 0, t3);
	isGreaterThanOrEqual(50, 50, t4);
	isGreaterThanOrEqual(0, 1, f1);
	isGreaterThanOrEqual(3, 4, f2)
	assert(1, t1)
	assert(1, t2)
	assert(1, t3)
	assert(1, t4)
	assert(0, f1)
	assert(0, f2)
}

testSmallerThanOrEqual() {
	isSmallerThanOrEqual(0, 0, t1);
	isSmallerThanOrEqual(50, 50, t2);
	isSmallerThanOrEqual(0, 1, t3);
	isSmallerThanOrEqual(3, 4, t4);
	isSmallerThanOrEqual(5, 3, f1);
	isSmallerThanOrEqual(1, 0, f2)
	assert(1, t1)
	assert(1, t2)
	assert(1, t3)
	assert(1, t4)
	assert(0, f1)
	assert(0, f2)
}

testSmallerThan() {
	isSmallerThan(5, 3, a);
	isSmallerThan(0, 0, b);
	isSmallerThan(0, 1, c);
	isSmallerThan(1, 0, d);
	isSmallerThan(50, 50, e)
	assert(0, a)
	assert(0, b)
	assert(1, c)
	assert(0, d)
	assert(0, e)
}

testEquals() {
	equals(5, 5, t1);
	equals(0, 0, t2);
	equals(1, 1, t3);
	equals(1, 0, f1);
	equals(0, 1, f2);
	equals(1, 2, f3);
	equals(2, 1, f4)
	assert(1, t1)
	assert(1, t2)
	assert(1, t3)
	assert(0, f1)
	assert(0, f2)
	assert(0, f3)
	assert(0, f4)
}

/"schreibt das Ergebnis der Multiplikation von f1 * f2 in das result."/
multiply(f1, f2, result) {
	f1i = 0 + 0;
	f2i = f2 + 0;
	while f2i !=0 do
		f1i = f1i + f1;
		f2i = f2i - 1
	endwhile;
	result = f1i + 0
}

/"schreibt das Ergebnis der Division von f1 / f2 in das result.
Falls das Ergebnis keine natürliche Zahl ist, wird abgerundet."/
divide(f1, f2, result) {
	f11 = f1 + 0;
	while f11 !=0 do
		isGreaterThanOrEqual(f11, f2, b);
		while b !=0 do
			newRes = newRes + 1;
			b = 0 + 0
		endwhile;
		f11 = f11 - f2
	endwhile;
	result = newRes + 0
}

/"schreibt den Rest der Division von a / n in r"/
mod(a, n, r) {
	divide(a, n, parkplatz1);
	multiply(parkplatz1, n, parkplatz2);
	r = a - parkplatz2
}

/"schreibt den größten gemeinsamen Teiler von a und b in r."/
euclid(a, b, r) {
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

/"prüft, ob a größer als b ist.
Schreibt in r eine 1, wenn dem so ist, sonst eine 0."/
isGreaterThan(a, b, r) {
	parkplatz = a - b;
	r = 0 + 0;
	while parkplatz !=0 do
		r = 0 + 1;
		parkplatz = 0 + 0
	endwhile
}

/"prüft, ob a größer oder gleich b ist.
Schreibt in r eine 1, wenn dem so ist, sonst eine 0."/
isGreaterThanOrEqual(a, b, r) {
	isGreaterThan(a, b, r);
	ri = r + 0;
	while ri ==0 do
		isGreaterThan(b, a, rii);
		while rii ==0 do
			r = 1 + 0;
			rii = 1 + 0
		endwhile;
		ri = 1 + 0
	endwhile
}

/"prüft, ob a kleiner oder gleich b ist.
Schreibt in r eine 1, wenn dem so ist, sonst eine 0."/
isSmallerThanOrEqual(a, b, r) {
	isSmallerThan(a, b, r);
	ri = r + 0;
	while ri ==0 do
		isSmallerThan(b, a, rii);
		while rii ==0 do
			r = 1 + 0;
			rii = 1 + 0
		endwhile;
		ri = 1 + 0
	endwhile
}

/" prüft, ob a kleiner ist als b.
Schreibt in r eine 1, wenn dem so ist, sonst eine 0."/
isSmallerThan(a, b, r) {
	parkplatz = b - a;
	r = 0 + 0;
	while parkplatz !=0 do
		r = 0 + 1;
		parkplatz = 0 + 0
	endwhile
}

/"prüft, ob in a derselbe Wert steht, wie in b.
Schreibt in r eine 1, wenn dem so ist, sonst eine 0."/
equals(a, b, r) {
	isGreaterThan(a, b, r1);
	isGreaterThan(b, a, r2);
	zeroWhenEqual = r1 + r2;
	r = 1 + 0;
	while zeroWhenEqual !=0 do
		r = 0 + 0;
		zeroWhenEqual = 0 + 0
	endwhile
}
