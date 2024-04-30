This is a dummy repo for handling all the stuffs related to the Java Backend Technology


NOTES:-
Maven
templates which are present in the world which are created or are pre-build with respective frameworks and we can get those byu default . Those pre-build templates are called archetype.

Getting Started with Spring 6
spring is responsible for object creation and these objects are known as beans

Exploring Spring Framework
there are multiple was ways of talking to spring:- 1. XML 2. Java Based Config 3.Annotations

Exploring Spring Framework
beans are objects managed by the spring framework

Exploring Spring Framework
there is a file spring.xml go there and create the object for all the bean tags
NUMBER OF OBJECT CREATION WILL BE DEPENDENT ON THE NUMBER OF BEAN TAGS PRESENT
any bean in spring has different scope.
there are different scope options like singleton, prototype, request,session.
But in spring core we have two type of scopes singleton and prototype. Whereas the other scopes works for web or web sockets.
By default it follows singleton
for getting multiple objects we have to add a attribute namely scope. the scope singleton refers to the same object whereas the scope prototype creates a new object.
when the scope is singleton it will create the object by default as soon as the application is loaded which means singleton object will be created as soon as the container is loading and can be used any number of times.
in prototype the object is created when we have getBean()
crreate the object call the setter methord and the assign the value
if we want to use values which are compulsory the use constructor injection else use setter injection for optional values
autowire works only when property is not mentioned
byType property in the autowire looks for the type of interface
primary will be preferred when there is a confusion with byType property and spring gets confuse here the bean which has the primary attribute will be called.
lazy-init="true" object is not created by default only when we will need it then it will be created but type is singleton
when we have a not lazy bean dependent on a lazy bean still it will create the object of the lazy bean because the non lazy bean wants the object. this process speeds up the application.
inner bean limits the object to a particular class

Working with Java-Based Config
there are 3 ways to do configurations in java :-
1. XML configurations
2. Java Based Configurations
3. Annotation Based Configurations
in java based configuration we have to manually create the object yes we are creating he object but the calling of methord , injecting the object and management of the object all are internally managed by our spring framework.
default name of bean is actually the method name returning the objects
@Component is a stereotype annotation where the class knows that spring is responsible for management of the objects
annotation @Autowired injects the object . The injection can be of three type :- Field  Injection, Constructor Injection, Setter Injection. always prefer setter injection.

Moving to Spring Boot
@SpringBootApplication named annotation in spring boot projects provides all the configuration which occurs behind the scene, which in spring core projects needs to manage manually.
