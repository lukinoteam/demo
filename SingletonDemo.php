<?php


class Human
{
    private $name;

    private static $man = null;

    private function __construct($name)
    {
        $this->name = $name;
    }

    public static function getName($name)
    {
        
        if (static::$man == null) {
            static::$man = new Human($name);
        }
        return static::$man;
    }

    public function showName(){
        return $this->name;
    }
}


$son = Human::getName("Aladin");   
$son = Human::getName("Alibaba");

echo $son->showName(); //in ra aladin 

?>