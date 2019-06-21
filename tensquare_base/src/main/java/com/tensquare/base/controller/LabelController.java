package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/12 0012 16:41
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;
    @RequestMapping(method= RequestMethod.GET)
    public Result findall(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());

    }
    @RequestMapping(method = RequestMethod.GET,value = "/{labelId}")
    public Result findById(@PathVariable("labelId") String labelId){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findById(labelId));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK,"添加成功");
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/{labelId}")
    public Result update(@PathVariable("labelId") String labelId,@RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true, StatusCode.OK,"更新成功");
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{labelId}")
    public Result deleteById(@PathVariable("labelId") String labelId){
        labelService.delete(labelId);
        return new Result(true, StatusCode.OK,"删除成功");
    }

    /**
     * 根据条件查询
     * @param searchMap
     * @return
     */
    @RequestMapping(value="/search",method = RequestMethod.POST)
    public Result findSearch(@RequestBody Map searchMap){
        return new Result(true,StatusCode.OK,"查询成功",labelService.findSearch(searchMap));
    }

    /**
     * 条件+分页查询
     * @param searchMap
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value="/search/{page}/{size}",method =
            RequestMethod.POST)
    public Result findSearch( @RequestBody Map searchMap
            ,@PathVariable int page,@PathVariable int size ){
        Page<Label> pageList= labelService.findSearch(searchMap,page,size);
        return new Result(true,StatusCode.OK,"查询成功",new PageResult<Label>
                (pageList.getTotalElements(),pageList.getContent() ));
    }


}
