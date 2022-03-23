package liang.springcloudproviderdepthystrix8001.service.impl;

import liang.springcloudapi.pojo.Dept;
import liang.springcloudproviderdepthystrix8001.mapper.DeptMapper;
import liang.springcloudproviderdepthystrix8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public int addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return deptMapper.queryDeptById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }

    @Override
    public int deleteId(Long id) {
        return deptMapper.deleteId(id);
    }

    @Override
    public int addIDs(List<String> dnames) {
        return deptMapper.addIDs(dnames);
    }
}
