package

[package].service;
        [package].dao.[Table2]Mapper;
        [package].pojo.[Table2];

@Service
public class [Table2]Service{

@Autowired
private [Table2]Mapper[table2]Mapper;

/**
 * 全部数据
 *
 * @return
 */
public List<[Table2]>findAll(){
        return[table2]Mapper.selectAll();
        }

/**
 * 根据ID查询
 * @param id
 * @return
 */
public [Table2]findById([keyType][key2]){
        return[table2]Mapper.selectByPrimaryKey(id);
        }

/**
 * 增加
 * @param [table2]
 */
public void add([Table2][table2]){
        [table2]Mapper.insert([table2]);
        }

/**
 * 修改
 * @param [table2]
 */
public void update([Table2][table2]){
        [table2]Mapper.updateByPrimaryKey([table2]);
        }

/**
 * 删除
 * @param id
 */
public void delete([keyType][key2]){
        [table2]Mapper.deleteByPrimaryKey(id);
        }


/**
 * 分页查询
 * @param page
 * @param size
 * @return
 */
public Page<[Table2]>findPage(int page,int size){
        PageHelper.startPage(page,size);
        return(Page<[Table2]>)[table2]Mapper.selectAll();
        }

/**
 * 条件查询
 * @param searchMap
 * @return
 */
public List<[Table2]>findList(Map<String, Object> searchMap){
        Example example=createExample(searchMap);
        return[table2]Mapper.selectByExample(example);
        }

/**
 * 构建查询对象
 * @param searchMap
 * @return
 */
private Example createExample(Map<String, Object> searchMap){
        Example example=new Example([Table2].class);
        Example.Criteria criteria=example.createCriteria();
        if(searchMap!=null){
<条件查询.String.txt>
<条件查询.Integer.txt>
        }
        return example;
        }

/**
 * 条件+分页查询
 * @param searchMap 查询条件
 * @param page 页码
 * @param size 页大小
 * @return 分页结果
 */
public Page<[Table2]>findPage(Map<String, Object> searchMap,int page,int size){
        PageHelper.startPage(page,size);
        Example example=createExample(searchMap);
        return(Page<[Table2]>)[table2]Mapper.selectByExample(example);
        }

        }
