# **코리아 IT 아카데미 국비과정** 
## Spring 😺
<a name="readme-top"></a> 

#### Framework(다양한 API가 모여있는 작업 공간)

	라이브러리란, 개발자가 작성해 놓은 코드 파일을 의미하며,
	API란, 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.
	프레임워크란, API가 굉장히 많이 모여져서 덩치가 커져있는 것을 의미한다.

  
#### Framework의 장점

	개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 하더라도
	반쯤 완성된 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.
	회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고,
	개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기 때문에
	개발 시간을 단축할 수 있다.


#### Spring Framework(여러 프레임워크 중 경량화의 목적을 가진 프레임워크)

	경량 프레임워크, 
	예전 프레임워크는 다양한 경우를 처리하기 위해 여러 기능들을 넣다보니,
	하나의 기능을 위해서 아주 많은 구조가 필요했다. 기술이 너무나 복잡하고 방대했기 때문에,
	전체를 이해하고 개발하기에는 어려움이 많았다. 그래서 Spring Framework가 등장했고,
	특정 기능을 위주로 간단한 JAR파일 등을 선택하여 모든 개발이 가능하도록 구성되어 있다.


#### Spring Framework의 특징

	- POJO 기반의 구성
	- AOP 지원
	- Transaction 관리
	- 편리한 MVC 구조
	- WAS에 종속적이지 않은 개발 환경
	- DI를 통한 객체 간의 관계 구성


#### Spring Boot

	Spring Framework를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며,
	시간이 너무 오래 걸리 때문에 자동 설정(AutoConfiguration)과 개발에 필요한 모든 것을 관리해주는
	스프링 부트를 선호한다. 각 코어 및 라이브러리의 버전들도 맞추어야 하지만 스프링 부트를 사용하면
	이러한 복잡성을 해결하기에도 좋다.

#### Spring Framework의 특징

	- POJO 기반의 구성
	- DI를 통한 객체간의 관계 구성
	- AOP 지원
	- Transaction 관리
	- 편리한 MVC 구조
	- WAS에 종속적이지 않은 개발 환경

	▶ POJO 기반의 구성(JAVA를 쓸 수 있다)
		Plain Old Java Object.
		오래된 방식의 간단한 자바 객체라는 의미이며, JAVA 코드에서 일반적으로 객체를 구성하는 방식을
		Spring Framework에서 그대로 사용할 수 있다는 의미이다.
	
	▶ AOP 지원
		관점 지향 프로그래밍.
		좋은 개발 환경에서는 개발자나 비지니스 로직에만 집중할 수 있게 한다.
		Spring Framework는 반복적인 코드를 분리해줌으로써 핵심 비지니스 로직에만 집중할 수 있는 방법을 제공한다.
		보안이나 로그, 트랜잭션, 예외처리와 같이 비지니스 로직은 아니지만,
		반드시 처리가 필요한 부분을 주변 로직(횡단 관심사)라고 하고, 개발해야 할 서비스는 메인 로직(종단 관심사)라고 한다.
		Spring Framework는 이러한 횡단 관심사를 분리해서 설계하는 것이 가능하고, 횡단 관심사를 모듈로 분리하는 프로그래밍을 AOP 라고 한다.
		핵심 비지니스 로직에만 집중하여 코드 개발이 가능해지고, 각 프로젝트마다 다른 관심사 적용 시 코드 수정을
     		최소화 할 수 있으며, 원하는 관심사의 유지보수가 수월한 코드로 구성이 가능해진다.

	▶ Transaction 관리
		DB 작업 시, 트랜잭션을 매번 상황에 맞게 관리하지 않고 어노테이션을 사용하여 트랜잭션 영역을 구성한 뒤
		특정 예외 발생 시 자동으로 롤백을 처리하거나 커밋을 처리한다.
		
	▶ WAS에 종속적이지 않은 개발 환경
		전체 Application을 실행하지 않아도 기능별 단위 테스트가 용이하기 때문에 버그를 줄이고
		개발 시간을 단축할 수 있다.

	▶ DI를 통한 객체 간의 관계 구성
		의존성(Dependency)이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것을 의미한다.
		예를 들어 A 객체가 B 객체 없이 동작이 불가능한 상황을 "A가 B에 의존적이다" 라고 표현한다.
		하지만 직접 A 필드에 객체 B 객체를 선언하면 결합성이 단단해지기 때문에 유연성이 떨어진다.
		
		ex) 선생 -> 학생
		    (학생)

		     DAO -> mapper.xml		Controller -> DAO
	 	(mapper.xml)				   (DAO)

		주입(Injection)은 외부에서 내부로 밀어 넣는 것을 의미한다.
		필요한 객체를 외부에서 밀어 넣어 유연성을 높이고 결합성을 느슨하게 해준다.
		주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고
		어떤 객체에 의존하든 자신의 역할은 변하지 않는다.

 		***의존성
      		A →→→→→→→→→→→→→→→ B
      		A 필드에 B 객체를 직접 생성

      		***의존성 주입
      		A ↔↔↔↔↔↔↔ ? ↔↔↔↔↔↔↔↔ B
      		A는 B가 필요하다고 신호를 보내고, ?가 B객체를 외부에서 생성하여 주입하게 된다.
      		Spring Framework에서는 ApplicationContext가 ?이며, 필요한 객체들을 생성 및 주입해주는 역할을 한다.
      		따라서 개발자들은 기존의 프로그래밍과는 달리 객체와 객체를 분리해서 생성하고, 
      		이러한 객체를 엮는 wiring 작업의 형태로 개발하게 된다.

      		ApplicationContext가 관리하는 객체들을 빈(Bean)이라 부르고,
      		이는 Spring Container(Bean Container)에 저장된다.


#### Spring Boot 

	Spring Framework를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며,
   	시간이 너무 오래 걸린다. 따라서 자동 설정과 개발에 필요한 모든 것을 관리해주는 Spring Boot를 선호한다.
   	각 코어 및 라이브러리의 버전들도 맞추어야 하지만 Spring Boot를 사용하면 이러한 복잡성을 해결하기에도 좋다.


#### 프로젝트 기본 경로

	1) src/main/java		: 서버단 JAVA 파일
	2) src/test/java		: 단위 테스트 JAVA 파일
	3) src/main/resources		: 설정 파일 및 뷰단 (/만 쳐도 알아서 resources까지)
	4) src/main/resources/static	: css, js, image 등 정적 파일 경로
	5) src/main/resources/templates : html 파일 경로
	6) build.gradel			: 라이브러리 관리
	7) application.yml		: Spring의 모든 설정 야멜


#### Qualifier

	@Autowired를 통해 객체를 주입할 때, 같은 타입의 객체가 여러 개 있다면 구분할 수 없다.
   	이 때, @Qualifier를 통해 식별자를 설정하면 원하는 객체를 주입받을 수 있다.


#### Spring MVC(Front-Controller Pattern)

				HandlerMaping
	REQUEST		  ①	      ②↕	            ③		 ④
		]	  ↔	DispatcherServlet   ↔  HandlerAdapter   ↔  Controller
	RESPONSE	  ⑦	⑥↕	     ⑤↕
				View	ViewResolver
				   ↕
				HTML 및 기타

		req(요청) -> Dispatcher Servlet <-> Handler Mapping(컨트롤러 경로 찾기) 후 보고
		Dispatcher Servlet <-> Handler Adapter(리턴 값 보내줌 "/ex/ex01" ..) 후
		Dispatcher Servlet <-> View Resolver(이동할 수 있는 경로 완성) 후 보고 
		Dispatcher Servlet -> req (응답)


#### Spring MVC 패턴의 특징

	- HttpServletRequest, HttpServletResponse를 직접 사용한 것을 지양한다.
	- 다양한 타입의 파라미터(매개변수) 처리, 다양한 타입의 리턴 타입 사용 가능
	- GET 방식, POST 방식 등 전송 방식에 대한 처리를 어노테이션(@)으로 처리
	- 상속/인터페이스 방식 대신 어노테이션(@)으로만 설정 가능


#### REST

	Representational State Transfer(데이터를 전송할 때 대표하는 상태)
	
	언제 어디서든 누구든 서버에 요청을 보낼 때
	URI만으로도 데이터 또는 행위(CRUD) 상태를 이해할 수 있도록 설계하는 규칙

	1. 소문자로 작성한다.
		대문자로 작성 시 문제가 발생할 수 있기 때문에 소문자로 작성한다.

	2. 언더바 대신 하이픈을 사용한다.
		가독성을 높이기 위해서 하이픈으로 구분하는 것이 좋다.
		
	3. URI 마지막에 슬래시를 작성하지 않는다.
		마지막에 작성하는 슬래시는 의미가 없다.

	4. 계층 관계 표현 시 슬래시 구분자로 사용한다.
		계층 관계(포함 관계)에서는 슬래시로 구분해준다.

	5. 파일 확장자는 포함시키지 않는다.
		파일 확장자는 URI로 표현하지 않고 Header의 Content-Type을 사용하여
		body의 내용을 처리하도록 설계한다.

	6. 데이터를 대표할 때에는 명사를 사용하고, 상태를 대표할 때에는 동사를 사용한다.
		http://www.app.com/members/get/1 (X)
		http://www.app.com/members/delete/1 (O)

	7. URI에 사용되는 영어 단어는 복수로 작성한다.


#### 3-tier(층)

	스프링 프로젝트는 3-tier 방식으로 설계된다.

   	▶ Presentation Tier - 화면 계층
      		화면에 보여주는 기술을 사용하는 영역(Controller)

   	▶ Business Tier - 비지니스 계층
      		순수한 비지니스 로직을 담고 있는 영역(Service)

   	▶ Persistence Tier - 영속 계층
      		데이터를 어떤 방식으로 보관하고, 사용하는가에 대한 설계가 들어가는 영역(Mapper)

	※ Controller -> Service -> DAO -> Mapper


#### 3-tier의 목적

	각 영역은 독립적으로 설계되어 나중에 특정 기술이 변하더라도 필요한 부분을
   	부품처럼 쉽게 교환(모듈화)할 수 있게 하자는 방식이다.

#### 3-tier의 구조

	Presentation ↔ Business ↔ Persistence ↔ DBMS
        	↑                ↑       	     ↑             ↑
   	 Controller          Service      Repository    Mapper


#### @Controller(페이지 이동용)	

	- 반환값이 문자열 -> 뷰 이름으로 인식
	- 브라우저가 HTML 페이지로 이동
	- 주로 웹 화면을 보여줄 때 사용


#### @REST Controller(데이터 제공용)

	- 반환값을 뷰가 아니라 그대로 데이터(JSON 등)로 응답
	- 클라이언트 프로그램이 데이터를 받음
	- 페이지 이동 x, 데이터만 주고 받는 API 방식


#### @GetMapping

	- 데이터를 조회할 때 사용
	- ex) 웹페이지 열기, 데이터 가져오기
	- 브라우저에서 URL에 직접 입력하거나 링크 클릭 시 호출
	- URL에 데이터를 붙여서 보낼 수 있음


#### @PostMapping

	- 데이터를 서버로 전송할 때 사용
	- ex) 회원가입, 게시글 작성
	- URL에 데이터를 안보여주고 서버로 보낼 수 있음


#### @RequestParam

	(1) 	@GetMapping("/greet")
		public String greet(@RequestParam String name) {
    		return name + "님, 안녕하세요!";
		}

		브라우저 요청: GET /greet?name=희준
		스프링이 name=희준을 읽어서 메서드의 name 변수에 넣음
		결과: "희준님, 안녕하세요!"

	(2)	@GetMapping("/greet")
		public String greet(@RequestParam("name") String username) {
    		return username + "님, 안녕하세요!";
		}

		?name=희준 → username 변수에 들어감

	(3) 	@GetMapping("/greet")
		public String greet(
    		@RequestParam(value="name", required=false, defaultValue="손님") String username{
    		return username + "님, 안녕하세요!";
		}

		required=false → 값 없어도 오류 안 남
		defaultValue="손님" → 값 없으면 "손님"으로 처리


#### @PathVariable

	- URL 경로 안에 있는 값을 가져올 때 사용
	- ex) /users/3 → 3이라는 사용자 id 가져오기
	@GetMapping("/users/{id}")
	public String getUser(@PathVariable Long id) {
    	return id + "번 사용자 조회";
	}
	URL의 {} 안 이름과 변수명을 맞춰야 함


#### @RequestBody

	- body 전체를 읽어 객체로 변환, 주로 JSON 데이터를 받을 때 사용
	- ex) {"name":"희준","age":28}
	@PostMapping("/users")
	public String createUser(@RequestBody UserDTO user) {
    	return user.getName() + "님 등록 완료";
	}

	클라이언트가 {"name":"희준","age":28} 보내면
	→ UserDTO 객체로 매핑


#### HttpServletRequest request

	- 클라이언트가 보낸 요청 정보 가져올 때 사용
	- ex) URL, 쿼리 파라미터 확인, 세션 가져오기, 클라이언트 IP 확인	
	@PostMapping("/login")
	public String login(HttpServletRequest request) {
    		String clientIp = request.getRemoteAddr(); // 클라이언트 IP
    		String path = request.getRequestURI();     // 요청 URL
    		return "IP: " + clientIp + ", 요청 URL: " + path;
	}

	request.getParameter("name") → GET/POST 파라미터 가져오기
	request.getSession() → 세션 가져오기/저장


#### HttpServletResponse response

	- 서버가 클라이언트에게 응답을 보낼 때 조작
	- ex) 쿠키 추가/삭제, 직접 데이터 출력
	@PostMapping("/login")
	public String login(HttpServletResponse response) {
    		// 쿠키 생성
    		Cookie cookie = new Cookie("user", "희준");
    		cookie.setMaxAge(60*60); // 1시간
    		response.addCookie(cookie);

    		// 상태 코드 설정
    		response.setStatus(HttpServletResponse.SC_OK);

    		return "쿠키 생성 완료!";
	}

	
#### Spring Security

	Spring 기반 애플리케이션의 보안을 담당하는 프레임워크로서
	인증(Authentication)과 인가(Authorization)를 쉽게 처리할 수 있게 해준다.
	-> 인증이 되어야 인가(권한 관리)가 가능하다
	

#### JWT(JSON Web Token)

	-> 정보에 보안을 입히자
	JSON 형태의 토큰으로, 서버와 클라이언트 간에 인증 정보를 안전하게 주고받을 때 사용한다.
	: 세션에 저장하지 않기 위해, 세션은 보안에 취약하기 때문
	

#### JWT 특징

	1. 자체적으로 인증 정보를 포함한다.
	2. 토큰 자체가 인증 수단이기 때문에 세션이 불필요하다(stateless, 무상태).
	3. 서명(signature)으로 위변조를 방지한다.


#### JWT 서명

	JWT = Header + Payload + Signature
	
	Header: 토큰 타입과 암호화 알고리즘 정보
	Payload: 사용자 정보, 만료시간 등
	Signature: Header + Payload를 시크릿키로 암호화해서 변조 방지

	Signature는 Header와 Payload가 변조되지 않았다는 걸 증명하는 코드이다.
	Header와 Payload를 특정 알고리즘(HMAC, RSA 등)과 시크릿 키(Secret key)를 사용해서 암호화 또는 해시 처리된다.
	서버는 클라이언트가 보낸 JWT를 받을 때, 같은 방식으로 Header와 Payload를 사용해 다시 서명을 만들고
	JWT에 붙어온 서명(Signature)과 새로 만든 서명이 같으면 조작된 게 없다고 판단한다.
	만약 다르다면 위변조된 것으로 간주하고, 토큰이 거절된다.


#### Spring Security + JWT

	Provider: JWT 생성, 서명, 검증 기능을 구현한다, JWT 관련 메소드가 모여져 있는 클래스
	Filter: 인증에 성공하면 JWT 생성 후 클라이언트에 전달
	UserDetailService: 사용자 정보 조회 및 인증 처리를 담당하며, 실제 사용자 정보가 담기는 객체이다.
	SecurityConfig: 보안 설정(필터 체인, 인증 방식, 접근 제한(인가), 권한 설정 등)

	1. 인증 요청: 사용자가 ID/PW로 로그인 요청
	2. JWT 생성: 인증에 성공하면 JWT 생성 후 클라이언트에 전달
	3. 요청 시 JWT 포함: 클라이언트는 이후 요청 헤더에 JWT를 포함시켜 전송
	4. JWT 검증: 서버가 JWT 유효성 검증 후 인증 처리
	5. 정보 접근: 인증된 사용자만 정보 접근 허용


#### JWT Provider

	- 생성, 삭제, 검사 등 기능이 모아져 있는 클래스

	
#### JWT AuthenticationHandler

	- 인증에 실패했을 때

	
#### JWT AuthorizationHandler

	- 인가에 실패했을 때

	
#### JWT Filter

	- 모든 요청을 관리하는 곳

	
#### SecurityConfig

	- 모든 인증과 인가 흐름 설정

	
<p align="right">(<a href="#readme-top">back to top</a>)</p>
