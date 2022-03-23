package liang.springcloudproviderdept8002.service.impl;

import liang.springcloudapi.pojo.Dept;

import java.util.List;

public interface DeptServiceImpl {
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
