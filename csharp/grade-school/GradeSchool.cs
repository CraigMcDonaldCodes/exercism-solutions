using System.Linq;
using System.Collections.Generic;

public class GradeSchool
{
    private readonly Dictionary<int, List<string>> _grades;

    public GradeSchool()
    {
        _grades = new Dictionary<int, List<string>>();
    }

    public void Add(string student, int grade)
    {
        if (!_grades.ContainsKey(grade))
        {
            _grades.Add(grade, new List<string>());
        }

        _grades[grade].Add(student);
        _grades[grade].Sort();
    }

    public IEnumerable<string> Roster()
    {
        var students = new List<string>();

        foreach (var key in _grades.Keys.OrderBy(k => k))
        {
            students.AddRange(_grades[key]);
        }

        return students.ToArray();
    }

    public IEnumerable<string> Grade(int grade)
    {
        string[] result = {};

        if (_grades.ContainsKey(grade))
        {
            result = _grades[grade].ToArray();
        }

        return result;
    }
}