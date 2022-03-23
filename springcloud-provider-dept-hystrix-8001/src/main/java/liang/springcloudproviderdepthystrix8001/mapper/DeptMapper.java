package liang.springcloudproviderdepthystrix8001.mapper;

import liang.springcloudapi.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {
    /*增加一条信息*/
    int addDept(Dept dept);

    /*按照id查询信息*/
    public Dept queryDeptById(Long id);

    /*查找所有的信息*/
    public List<Dept> queryAll();

    /*刪除信息*/
    int deleteId(Long id);

    /*利用forEarch批量添加*/
    public int addIDs(List<String> dnames);
}
