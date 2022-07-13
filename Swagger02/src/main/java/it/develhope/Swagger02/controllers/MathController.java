package it.develhope.Swagger02.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.develhope.Swagger02.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @ApiOperation(value = "Say hi to visitors")
    public String welcomeMathMsh() {
        return "Welcome to the math page";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Return all the info of the division operation")
    public ArithmeticOperation operation() {
        return new ArithmeticOperation("Division",
                "take two or more int in input and give the result of the division in output",
                2, new String[]{"this operation has no properties"});
    }


    @GetMapping("/multiplication/{first}/{second}")
    @ApiOperation(value = "Multiplicate the number put in the path as variable")
    public int multiplicationFromPath(@ApiParam(value = "First number of the operation") @PathVariable(required = true) int first, @ApiParam(value = "Second number of the operation") @PathVariable(required = true) int second) {
        return first * second;
    }

    @PostMapping("/multiplication")
    @ApiOperation(value = "Multiplicate the number put in the body as variable")
    public int multiplicationFromBody(@ApiParam(value = "an array with the number to multiplicate") @RequestBody int[] params) {
        return params[0] * params[1];

    }


    @GetMapping("/square/{n}")
    @ApiOperation(value = "Return the square of the number in PathVariable")
    public int squareOfNumber(@ApiParam(value = "The number to we have to calculate the square") @PathVariable(required = true) int n) {
        return n * n;
    }


}
