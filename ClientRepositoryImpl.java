package templatetest;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClientRepositoryImpl implements ClientRepository {

    @Setter(onMethod_ = {@Autowired})
    private JdbcTemplate jdbcTemplate;
    private Map<Integer, Client> identityMap = new ConcurrentHashMap<>();

    @Override
    public int save(Client client) {
        identityMap.putIfAbsent(client.getId(), client);
        return jdbcTemplate.update("insert into customers(name, lastname, email) values(?, ?, ?)",
                client.getName(),
                client.getLastname(),
                client.getEmail());
    }

    @Override
    public int update(Client client) {
        identityMap.replace(client.getId(),client);
        return jdbcTemplate.update("update customers set name = ?, lastname = ?,  email = ? where id = ?",
                client.getName(),
                client.getLastname(),
                client.getEmail(),
               client.getId());

    }

    @Override
    public int deleteById(Integer id) {
        identityMap.remove(id);
        return jdbcTemplate.update("delete customers where id = ?", id);
    }

    @Override
    public List<Client> findAll() {
        return jdbcTemplate.query("select * from customers",
                (resultSet, rowNum) -> new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastname"),
                        resultSet.getString("email")));
    }
}




