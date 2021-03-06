package com.dq.easy.cloud.module.common.generator.code.java.pojo.bo.example.javaclass;

import com.dq.easy.cloud.module.basic.pojo.vo.DqBaseVO;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqClassCommentEndWith;
import com.dq.easy.cloud.module.common.generator.code.base.constant.DqCodeGenerateConstant.DqClassNameEndWith;
import com.dq.easy.cloud.module.common.generator.code.base.pojo.desc.DqTemplateDesc;
import com.dq.easy.cloud.module.common.generator.code.base.pojo.rule.DqGenerateRule;
import com.dq.easy.cloud.module.common.generator.code.java.desc.DqJavaClassContentDesc;
import com.dq.easy.cloud.module.common.generator.code.java.pojo.dto.DqGenerateJavaBaseDTO;

/**
 * 
 * <p>
 * 生成vo对象
 * </p>
 *
 * @author daiqi 创建时间 2018年3月27日 上午9:49:06
 */
public class DqGenerateJavaVOBO extends DqGenerateJavaDOBO {

	public DqGenerateJavaVOBO(DqGenerateJavaBaseDTO generateJavaBaseDTO, 
			DqTemplateDesc templateDesc, DqGenerateRule generateRule) {
		super(generateJavaBaseDTO, templateDesc, generateRule);
	}

	@Override
	protected DqJavaClassContentDesc getExtendsParentClass() {
		DqJavaClassContentDesc extendsParentClass = new DqJavaClassContentDesc();
		extendsParentClass.setName(DqBaseVO.class.getSimpleName());
		extendsParentClass.setSimpleClassType(DqBaseVO.class.getSimpleName());
		extendsParentClass.setFullClassType(DqBaseVO.class.getName());
		return extendsParentClass;
	}

	@Override
	protected String getClassCommentEndWith() {
		return DqClassCommentEndWith.POJO_VO;
	}

	@Override
	protected String getClassNameEndWith() {
		return DqClassNameEndWith.POJO_VO;
	}

}
