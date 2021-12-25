package app;

import org.springframework.stereotype.Service;

@Service("printer")
public class DependencyImpl implements Dependency {
    @Override
    public void print(String str, int count)
    {
        for(int i =0; i < count; i++)
        {
            System.out.println(str);
        }
    }
}
