package templatetest;

import java.util.List;

public interface ClientRepository {

    int save(Client client);

    boolean isPresent(Integer id);

    int update(Client client);

    int deleteById(Integer id);
    List<Client > findAll();
}
