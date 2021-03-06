package com.dq.easy.cloud.module.common.log.proxy.impl;

import com.dq.easy.cloud.module.common.log.constant.DqLogConstant.DqLogAnalysisContainer;
import com.dq.easy.cloud.module.common.log.pojo.bo.DqLogAnalysisBO;

/**
 * 
 * <p>
 * 	Controller层日志处理委托者
 * </p>
 *
 * @author daiqi
 * 创建时间    2018年2月8日 上午9:59:01
 */
public class DqLogControllerProxy extends DqLogBaseProxy{

	@Override
	protected void logDataExtraPre() {
		super.log("这是控制层的日志哦", "啦啦啦啦这是控制层的日志哦之前啦");
	}

	@Override
	protected void logDataExtraAfter() {
		super.log("请求路径", dqLogDTO.getRequestPath());
		super.log("这是控制层的日志哦", "啦啦啦啦这是控制层的日志哦之后啦");
	}

	@Override
	protected void initDqLogAnalysisBOData() {
		dqLogAnalysisBO = DqLogAnalysisBO.newInstanceFromContainer(DqLogAnalysisContainer.getLogAnalysisContainerController(), dqLogDTO);
		super.logWrap("这是controller的日志分析", "controller日志分析数据初始化");
	}

	@Override
	protected void doLogAnalysis() {
		dqLogAnalysisBO.setDqLogAnalysisDTOToContainer(DqLogAnalysisContainer.getLogAnalysisContainerController());
		super.logWrap("这是controller的日志分析", dqLogAnalysisBO.getDqLogAnalysisDTO());
	}
	
	
}
