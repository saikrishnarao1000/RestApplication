package com.cis.batch33.library.controller;

import com.cis.batch33.library.model.Member;
import com.cis.batch33.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public Member getMember(long memberId){
        return memberService.getMember((long) memberId);
    }

    // create a member
    @PostMapping
    public Member createMember(@RequestBody  Member member){
        return memberService.createMember(member);
    }
    @PutMapping
    public Member updateMember(Member member){
       return memberService.updateMember(member);
    }
    @DeleteMapping
    public void deleteMember(int memberId)
    {
        memberService.deleteMember(memberId);
    }
}
