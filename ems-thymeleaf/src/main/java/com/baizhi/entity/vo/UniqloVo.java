package com.baizhi.entity.vo;

import java.util.ArrayList;
import java.util.List;

import com.baizhi.entity.original.Uniqlo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UniqloVo {

    private Integer priceBegin;
    private Integer priceEnd;
    private List<String> sizeLst;
    private Uniqlo uniqlo = new Uniqlo();
    private List<Uniqlo> uniqloLst = new ArrayList<>();
    
}
