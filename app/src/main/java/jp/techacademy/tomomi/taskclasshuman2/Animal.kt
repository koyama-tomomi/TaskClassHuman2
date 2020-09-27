package jp.techacademy.tomomi.taskclasshuman2

abstract class Animal {

    var name: String
    var age: Int
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) {
        // プロパティ
        this.name = name
        this.age = age
        this.hobby = hobby

// 試1       this.name = ""
//        this.age = 0
//        this.hobby = ""
    }

    abstract fun say()
}