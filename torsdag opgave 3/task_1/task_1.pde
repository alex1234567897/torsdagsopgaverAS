int[] arr = {28, 230, 9, 310, 72};

// 1.b Method to return a random element
int getRandom() {
  int index = int(random(arr.length)); // pick random index
  return arr[index];
}

// 1.c Setup method
void setup() {
  int randomValue = getRandom();
  println("Random value from array: " + randomValue);
}
