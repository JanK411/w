
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

main() {
	f1 = 5 + 0;
	f2 = 3 + 0;
	multiply(f1, f2)
	assert(16, f1)
	assert(15, f2)
}

multiply(f1, f2) {
	copy(f1, f11);
	copy(0, f1);
	copy(f2, f21);
	while f21 !=0 do
		f1 = f1 + f11;
		f21 = f21 - 1
	endwhile
}

programmAusSkriptSeite23() {
	x1 = x0 + 5;
	while x1 !=0 do
		x2 = x2 + 8;
		x1 = x1 - 1
	endwhile
}

divide(f1, f2) {
	copy(f1, f11);
	copy(f2, f21)
}