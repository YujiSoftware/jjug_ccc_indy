# InvokeDynamic Under the Hood

InvokeDynamic、略して “Indy” をご存じですか。  
ラムダ式や、最近では Record の解説で目にしたことがあるかもしれません。InvokeDynamic はバイトコードの1つで、どのメソッドを呼び出すかを実行時に動的に決定できるというのが特徴の命令です。Java のバイトコードはいろいろありますが、あとから追加されたのは現時点ではこの InvokeDynamic だけです。

もともと、InvokeDynamicはJRubyなどのJVM言語のために導入されました。それが今ではJavaでも欠かせないバイトコードになっています。  
そこで、本セッションではInvokeDynamicの導入背景から、その動作、そしてなぜ他の用途で使用されるようになったのかを解説します。またInvokeDynamicの Java での適用例についても紹介していきます。

## Author

- YujiSoftware
- Yuichi Sakuraba
