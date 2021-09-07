package com.bongsus.www.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bongsus.www.dto.member.MemberDto;
import com.bongsus.www.service.member.MemberService;

import lombok.AllArgsConstructor;

/**
 * Description : 회원 컨트롤러<br>
 * Date : 2021. 9. 6.<br>
 * History :<br>
 * - 2021. 9. 6.	작성자 : Bongstar, 설명 : 최초작성<br>
 *
 * @author Bongstar
 * @version 1.0
 */

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class MemberController {

	private MemberService memberService;
	
	/**
	 * 회원가입
	 * 
	 * @return	회원가입 화면
	 */
	@GetMapping("/signup")
	public void signup() {}
	
	/**
	 * 회원가입 처리
	 *  
	 * @param memberDto		회원가입 정보
	 * @return				로그인 화면 이동
	 */
	@PostMapping("/signup")
	public String execSignup(MemberDto memberDto) {
		
		memberService.joinUser(memberDto);
		
		return "redirect:/user/login";
		
	}
	
	/**
	 * 로그인
	 *  
	 * @return	로그인 화면
	 */
	@GetMapping("/login")
	public void login() {
		
	}
	
	/**
	 * 로그인 결과
	 * 
	 * @return	로그인 결과 화면
	 */
	@GetMapping("/loginResult")
	public void loginResult() {}
	
	/**
	 * 로그아웃 결과
	 *  
	 * @return	로그아웃 결과 화면
	 */
	@GetMapping("/logoutResult")
	public void logoutResult() {}
	
	/**
	 * 접근 거부
	 *  
	 * @return	접근 거부 화면
	 */
	@GetMapping("/denied")
	public void denied() {}
	
	/**
	 * 내정보
	 *  
	 * @return	내정보 화면
	 */
	@GetMapping("/myInfo")
	public void myInfo() {}
	
}
