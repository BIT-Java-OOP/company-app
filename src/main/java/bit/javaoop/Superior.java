package bit.javaoop;

import java.util.List;

public interface Superior {
    List<Inferior> getInferiors();

    void shouldAddEmployee(Inferior employee);

    default void mergeInferiorList(Superior other)
    {
        if(other != null && other.getInferiors().size() != 0)
        {
            other.getInferiors().stream()
                    .filter(x -> !getInferiors().contains(x))
                    .forEach(y -> getInferiors().add(y));
        }
    }

    default String printInferiors(int level)
    {
        StringBuilder sb = new StringBuilder("");
        for (Inferior e: getInferiors())
        {
            for (int i = level; i>0; i--)
            {
                sb.append("\t");
            }
            sb.append(e.getName())
            .append(" - ")
            .append(e.getClass().getSimpleName())
            .append("\n");

            if (e instanceof Superior)
            {
                sb.append(((Superior) e).printInferiors(level+1));
            }
        }
        return sb.toString();
    }
}
