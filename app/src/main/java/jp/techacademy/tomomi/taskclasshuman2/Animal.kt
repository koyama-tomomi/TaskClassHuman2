package jp.techacademy.tomomi.taskclasshuman2

abstract class Animal {


    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age

// 試2 constructor(name: String, age: Int){}
// 試1 constructor(name: String, age: Int, hobby: String) {
//　　　　　this.name = ""
//        this.age = 0
//        this.hobby = ""
    }

    abstract fun say()
}