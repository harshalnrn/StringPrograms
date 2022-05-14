//understanding default and param constructers, super() calls across the construcuter chain, and their impact during multi-level inheritence.

class Interview1 {
    private String name;
    public Interview1(){

    }
    public Interview1(String name) {
        this.name = name;
    }
}



class Interview2 extends Interview1{
    private String phoneNo;

    public Interview2(){

    }
    public Interview2(String name, String phoneNo) {
        super(name);
        this.phoneNo = phoneNo;
    }
}



class Interview3 extends Interview2 {
    private String email;
    //rule: super becomes mandatory in child constructer, if parent has only parameterised construcuter and no explicitly defined default constructer.
    //super is optional, if parent has no constructers or explicit default construcer, since super() happens internaly then.
    //so deeper the inheritence hierarchy, the stack of super() calls from constructers adds to stack memory
    public Interview3(String name) {
        this.email = email;
    }
}

class Main{

    public static void main(String[] args){
        //rule: default constructers exists internally only and only if, no explicit constructer is created inside class
        Interview1 in=new Interview1();
    }
}
