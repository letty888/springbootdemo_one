package com.iking.springbootdemo_one.model;

/**
 * @author Smart
 */
public class ErrCodeConsts {
    /**
     * 新增
     */
    public static final String INSERT_SUCCESS = "新增成功!";
    public static final String INSERT_FAILED = "新增失败!";
    public static final String INSERT_EXCEPTION = "新增异常!";
    /**
     * 修改
     */
    public static final String UPDATE_SUCCESS = "修改成功!";
    public static final String UPDATE_FAILED = "修改失败!";
    public static final String UPDATE_EXCEPTION = "修改异常!";
    /**
     * 查询
     */
    public static final String SELECT_SUCCESS = "查询成功!";
    public static final String SELECT_FAILED = "查询失败!";
    public static final String SELECT_EXCEPTION = "查询异常!";
    /**
     * 删除
     */
    public static final String DELETE_SUCCESS = "15000";
    public static final String DELETE_FAILED = "15001";

    /**
     * 用户状态已失效，请重新登录！
     */
    public static final String LOGIN_DISABLED = "用户状态已失效，请重新登录！";

    /**
     * 传入参数有误
     */
    public static final String INTO_PARAM_DISABLED = "传入参数有误！";

    public static final String EMPTY_RESULT = "查询结果为空!";

    public static final String EXECUTE_SECCESS = "执行成功!";
    public static final String EXECUTE_FAILED = "执行失败!";
    public static final String EXECUTE_EXCEPTION = "执行异常!";
}
