package it.develhope.Swagger02.entities;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArithmeticOperation {
    @ApiParam(value = "the name of the operation", example = "addiction")
    private String name;
    @ApiParam(value = "the description of the operation", example = "addiction consist in adding two or more numbers")
    private String description;
    @ApiParam(value = "the min number of the operand", example = "2")
    private int minNumberOfOperands;
    @ApiParam(value = "the properties of the operation")
    private String[] properties;

}
