package ${package}.dto;

import lombok.Data;
<#if queryHasTimestamp>
    import java.sql.Timestamp;
</#if>
<#if queryHasBigDecimal>
    import java.math.BigDecimal;
</#if>
<#if queryColumns??>
    import com.perye.dokit.annotation.Query;
</#if>

@Data
public class ${className}QueryCriteria{
<#if queryColumns??>
    <#list queryColumns as column>

        <#if column.columnQuery = '1'>
    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
        </#if>
        <#if column.columnQuery = '2'>
    // 精确
    @Query
        </#if>
    private ${column.columnType} ${column.changeColumnName};
    </#list>
</#if>
}
