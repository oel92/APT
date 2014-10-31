import unittest
import Experiment

class MyTestCase(unittest.TestCase):

  def test_t1(self):
    r1 = Experiment.largest([1,1,1]) 
    self.assertEqual(r1, 1)

  def test_t2(self):
    r1 = Experiment.largest([3,2,1]) 
    self.assertEqual(r1, 3)

  def test_t3(self):
    r1 = Experiment.largest([3,2,3]) 
    self.assertEqual(r1, 3)

  def test_t4(self):
    r1 = Experiment.largest([3,2,3,4]) 
    self.assertEqual(r1, 4)

  def test_t5(self):
    r1 = Experiment.largest([3,-2,3,-1,4]) 
    self.assertEqual(r1, 4)

  def test_t6(self):
    r1 = Experiment.largest([-3,-2,-3,-1,-4]) 
    self.assertEqual(r1, -1)

  def test_t7(self):
    self.assertRaises(ValueError, Experiment.largest, [])
  
  def test_t8(self):
    r1 = Experiment.largest([0,1])
    self.assertEqual(r1, 1)

  def test_t9(self):
    r1 = Experiment.largest([-2,-1])
    self.assertEqual(r1, -1)

  def test_t10(self):
    r1 = Experiment.largest([-1000, 1000, 1001])
    self.assertEqual(r1, 1001)

  def test_t11(self):
    r1 = Experiment.largest([-1,-1])
    self.assertEqual(r1, -1)


if __name__ == '__main__':
  unittest.main()
