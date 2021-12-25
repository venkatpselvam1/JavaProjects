package App;

import org.springframework.stereotype.Service;

@Service("dependency")
public class DependencyImpl implements Dependency {
    public void Print(String str, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(str);
        }
    }
}
