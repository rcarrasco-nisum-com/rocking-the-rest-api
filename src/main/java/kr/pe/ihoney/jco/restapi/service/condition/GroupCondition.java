package kr.pe.ihoney.jco.restapi.service.condition;

import kr.pe.ihoney.jco.restapi.domain.type.GroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.util.StringUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = { "name", "type" })
public class GroupCondition {
    private String name;
    private GroupType type;

    public boolean hasName() {
        return StringUtils.hasText(name);
    }
    
    public boolean hasType() {
        return null != type;
    }
}