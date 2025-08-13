package comparator;

//Natural sorting using Comparable

class StudentComparable implements Comparable<StudentComparable > {

  private int id;

  private String name;

  StudentComparable (int id, String name) {

      this.id = id;

      this.name = name;

  }


  // Natural ordering by id

  public int compareTo(StudentComparable  s) {

	return this.id - s.id;   

  }

  public String toString() {

      return this.id + " " + this.name;

  }

}




