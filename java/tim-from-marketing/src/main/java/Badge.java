public class Badge {

    // Badges? We don't need no stinkin badges!

    public String print(Integer id, String name, String department) {

        var sb = new StringBuilder();

        // add the ID if supplied
        if (id != null) {
            sb.append("[%d] - ".formatted(id));
        }

        sb.append(name);

        // if department not supplied, then its an 'owner'
        if (department == null) {
            sb.append(" - OWNER");
        } else {
            sb.append(" - %s".formatted(department.toUpperCase()));
        }

        return sb.toString();
    }
}
