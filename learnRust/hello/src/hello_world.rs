fn main() {
	println!("The sum of 5 and 3 is: {}", sum(5,3));

	let (x, y, z) = (1, 2, 3);
	println!("The sum of {} and {} is: {}", x, y, sum(x,y));
	println!("The sum of {} and {} is: {}", y, z, sum(y,z));
}

fn sum (x: i32, y: i32) -> i32 {
	x + y
}
