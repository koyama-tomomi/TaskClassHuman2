package jp.techacademy.tomomi.taskclasshuman2

abstract class Animal {


    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) {
        // プロパティ

// 試2 constructor(name: String, age: Int){}
// 試1 constructor(name: String, age: Int, hobby: String) {
//　　　　　this.name = ""
//        this.age = 0
//        this.hobby = ""
    }

    abstract fun say()
}