package liang.springcloudproviderdept8001.service;

import liang.springcloudapi.pojo.Dept;
import liang.springcloudproviderdept8001.mapper.DeptMapper;
import liang.springcloudproviderdept8001.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptService implements DeptServiceImpl {
    @Autowired
    private DeptMapper mapper;
    @Override
    public int addDept(Dept dept) {
        return mapper.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return mapper.queryDeptById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int deleteId(Long id) {
        return mapper.deleteId(id);
    }

    @Override
    public int addIDs(List<String> dnames) {
        return mapper.addIDs(dnames);
    }
}
