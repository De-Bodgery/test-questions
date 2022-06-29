  public void testNthSmallest() {
    final NthSmallestElement smallestElement = new NthSmallestElement();
    int returnValue = smallestElement
        .findTheNthSmallestElement(TestData.smallArrayUnsorted, 5, 0,
            TestData.smallArrayUnsorted.length - 1);
    Assert.assertEquals(returnValue, 5);
    returnValue = smallestElement.findTheNthSmallestElement(new int[]{7,10,4,3,20,15}, 3, 0, 5);
    Assert.assertEquals(returnValue, 7);
  }