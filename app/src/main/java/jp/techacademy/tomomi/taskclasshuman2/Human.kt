package jp.techacademy.tomomi.taskclasshuman2


import android.util.Log

open class Human : Animal, Thinkable {
//試1   open class Human(name: String, age: Int, hobby: String) : Animal, Thinkable {


    var name: String
    var age: Int
    var hobby: String


    // コンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }
//試2     this.name = ""
//        this.age = 0
//        this.hobby = ""
//試1     init {
//        this.name = ""
//        this.age = 0
//        this.hobby = "" }


    // メソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + this.age + "歳です。")
    }


    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}