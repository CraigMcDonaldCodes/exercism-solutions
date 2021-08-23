export class GradeSchool {

  #grades = {
  }

  roster() {
    return this.#grades;
  }

  add(student, grade) {

    if (grade in this.#grades) {
      this.#grades[grade].push(student);
      this.#grades[grade].sort();
    } else {
      this.#grades[grade] = [student];
    }
  }

  grade(grade) {

    let result = [];

    if (grade in this.#grades && this.#grades[grade].length > 0) {
      result = this.#grades[grade];
    }

    return result;
  }
}
