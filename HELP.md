IDEA-365346 Spring: AutowireBean action shouldn't invoke ChangeSignature refactoring for Kotlin classes
https://youtrack.jetbrains.com/issue/IDEA-365346

open `com.mytests.spring.springktautoinject.components.FirstUsedCompo`
put cursor somewhere inside the class name
Alt-Insert - select Autowire Bean... action
select any component

as a result, the ChangeSignature dialog is shown