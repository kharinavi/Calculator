package ru.kharina.study.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kharina.study.calculator.models.Calculator;

@Controller
@RequestMapping()
public class CalculatorController {


    private final Calculator calc;

    @Autowired
    public CalculatorController(Calculator calculator) {
        this.calc = calculator;
    }

    @GetMapping("/calculate")
    public String calculate(@ModelAttribute("calculator") Calculator calculator,
                            Model model) {
        System.out.println(calculator.getHistory());
        model.addAttribute("calculator",calc);
        return "calculate";
    }

    @PostMapping("/calculate")
    public String setResult(@ModelAttribute("calculator") Calculator calculator,
                            Model model) {
        calculator.calculate();
        System.out.println(calculator.getHistory());
        return "calculate";
    }
}
