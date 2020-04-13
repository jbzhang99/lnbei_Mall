package com.lnbei.framework.aspectj;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import com.lnbei.common.annotation.DataScope;
import com.lnbei.common.core.domain.BaseEntity;
import com.lnbei.common.utils.StringUtils;
import com.lnbei.framework.util.ShiroUtils;
import com.lnbei.system.domain.SysDept;

import com.lnbei.system.domain.SysUser;

/**
 * 数据过滤处理
 * 
 * @author lnbei
 */
@Aspect
@Component
public class DataScopeAspect {
	/**
	 * 全部数据权限
	 */
	public static final String DATA_SCOPE_ALL = "1";

	/**
	 * 自定数据权限
	 */
	public static final String DATA_SCOPE_CUSTOM = "2";

	/**
	 * 数据权限过滤关键字
	 */
	public static final String DATA_SCOPE = "dataScope";

	// 配置织入点
	@Pointcut("@annotation(com.lnbei.common.annotation.DataScope)")
	public void dataScopePointCut() {
	}

	@Before("dataScopePointCut()")
	public void doBefore(JoinPoint point) throws Throwable {
		handleDataScope(point);
	}

	protected void handleDataScope(final JoinPoint joinPoint) {
		// 获得注解
		DataScope controllerDataScope = getAnnotationLog(joinPoint);
		if (controllerDataScope == null) {
			return;
		}
		// 获取当前的用户
		SysUser currentUser = ShiroUtils.getSysUser();
		if (currentUser != null) {
			// 如果是超级管理员，则不过滤数据
			if (!currentUser.isAdmin()) {
				dataScopeFilter(joinPoint, currentUser, controllerDataScope.tableAlias());
			}
		}
	}

	/**
	 * 数据范围过滤
	 * 
	 * @param joinPoint 切点
	 * @param user      用户
	 * @param alias     别名
	 */
	public static void dataScopeFilter(JoinPoint joinPoint, SysUser user, String alias) {
		StringBuilder sqlString = new StringBuilder();
		if (!alias.equals("d")) {
			SysUser mSysUser = ShiroUtils.getSysUser();
			SysDept mDept = mSysUser.getDept();
			if (mSysUser.isRole("quanxian_all") || mSysUser.isRole("admin")) {// 查看全部
				
			} else if (mSysUser.isRole("quanxuan_benbumen")
					) {
				sqlString.append(StringUtils.format(" OR {}.dept_id = '{}'  ", alias, mSysUser.getDeptId()));
			} else if (mSysUser.isRole("quanxian_xiaji")
					) {
				sqlString.append(StringUtils.format(
						" OR {}.dept_id IN ( SELECT id FROM sys_dept WHERE del_flag='0' and parent_id = '{}' or id= '{}' ) ",
						alias, mDept.getId(), mDept.getId()));
			} else if (mSysUser.isRole("quanxian_one")
					) {
				sqlString.append(StringUtils.format(
						"and {}.create_by  = '{}' ",
						alias, mSysUser.getId()));
			}
		}
		if (StringUtils.isNotBlank(sqlString.toString())) {
			BaseEntity baseEntity = (BaseEntity) joinPoint.getArgs()[0];
			baseEntity.getParams().put(DATA_SCOPE, " AND (" + sqlString.substring(4) + ")");
		}
	}

	/**
	 * 是否存在注解，如果存在就获取
	 */
	private DataScope getAnnotationLog(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		MethodSignature methodSignature = (MethodSignature) signature;
		Method method = methodSignature.getMethod();

		if (method != null) {
			return method.getAnnotation(DataScope.class);
		}
		return null;
	}
}
