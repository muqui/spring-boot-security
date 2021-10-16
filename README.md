# spring-boot-security
<p>In this tutorial, We will create a spring boot security example.</p>
<h1>Steps for creating project.</h1>
<p> Go to File -> Spring starter project</p>
<p>the project will be see below screen</p>

![security_01](Pictures/security_01.png)
<h3>dependencies</h3>
<ul>
 <li>Spring web.</li>
 <li>Spring Security.</li>
 <li>Thymeleaf.<li>
</ul>
<h3>Create controllers</h3>
<p>Create a package named "com.boot.alberto.controllers"</p>
<p>Create next java class inside controller package.</p>
<ul>
    <li>AdminController</li>
    <li>HomeController</li>
    <li>UserController</li>
    <li>VisitorController</li>
</ul>
<h3>AdminController.java</h3>



<pre>
    <code>
package com.boot.alberto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
	 @GetMapping("index")
	 		public String index(){return "admin/index";
	    }
}
    </code>
</pre>

<h3>HomeController.java</h3>

<pre>
    <code>
package com.boot.alberto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("index")
	public  String index() {
		return "index";
	}	
}
    </code>
</pre>

<h3>UserController.java</h3>

<pre>
    <code>
package com.boot.alberto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	@GetMapping("index")
    public String index(){
        return "user/index";
    }
}
    </code>
</pre>

<h3>VisitorController.java</h3>


<pre>
    <code>
package com.boot.alberto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("visitor")
public class VisitorController {	
	@GetMapping("index")
    public String index(){
        return "visitor/index";
    }
}
    </code>
</pre>

<h2>create files html</h2>

![security_02](Pictures/security_02.png)

<h3>/template/index.html</h3>

![security_03](Pictures/security_03.png)
<h3>/template/admin/index.html</h3>

![security_03](Pictures/security_04.png)
<h3>/template/user/index.html</h3>

![security_03](Pictures/security_05.png)
<h3>/template/visitor/index.html</h3>

![security_03](Pictures/security_06.png)


