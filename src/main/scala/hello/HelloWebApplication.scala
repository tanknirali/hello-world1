package hello

import org.springframework.boot.SpringApplication

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author saung
 * @since 1.0
 */

object HelloWebApplication {
    @RequestMapping(method=RequestMethod.GET)
	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}