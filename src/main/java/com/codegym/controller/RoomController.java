package com.codegym.controller;

import com.codegym.model.Ethnicity;
import com.codegym.model.Miss;
import com.codegym.model.Room;
import com.codegym.model.RoomCategory;
import com.codegym.repository.RoomCategoryRepository;
import com.codegym.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/room/")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private RoomCategoryRepository roomCategoryRepository;

    @GetMapping("list")
    public String getViewList(Model model){
        model.addAttribute("listRoom",roomRepository.findAll());
        return "room/list";
    }

    @GetMapping("create")
    public String getViewCreate(Model model){
        model.addAttribute("Room" ,new Room());
        Iterable<Room> rooms = roomRepository.findAll();
        model.addAttribute("RoomCategory",roomCategoryRepository.findAll());
        return "room/create";
    }

    @PostMapping("create")
    public String Create(Room Room){
        RoomCategory roomCategory = roomCategoryRepository.findById(Room.getRoomCategoryid()).orElse(null);
        Room.setRoomCategory(roomCategory);
        roomRepository.save(Room);
        return "redirect:/room/list";
    }

    @GetMapping("edit/{id}")
    public String Getviewedit(Model model, @PathVariable("id")Long id){
        model.addAttribute("Room" , roomRepository.findById(id).orElse(null));
        model.addAttribute("Roomcategory",roomCategoryRepository.findAll());
        return "room/edit";
    }
    @PostMapping("edit")
    public String edit(Model model,Room room){
        RoomCategory roomCategory = roomCategoryRepository.findById(room.getRoomCategoryid()).orElse(null);
        room.setRoomCategory(roomCategory);
        roomRepository.save(room);
        return "redirect:/room/list";
    }
    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable("id")Long id){
        roomRepository.deleteById(id);
        return "redirect:/room/list";
    }

    @GetMapping("view/{id}")
    public String Getview(Model model, @PathVariable("id")Long id){

        model.addAttribute("Room" , roomRepository.findById(id).orElse(null));
        model.addAttribute("Roomcateogry",roomCategoryRepository.findAll());
        return "room/view";
    }

    @PostMapping("search")
    public String search(@RequestParam String search, Model model){
        model.addAttribute("listRoom", roomRepository.findAllByNameContains(search));
        return "room/list";
    }
}
