# TopPageの作成
## IndexController.javaの作成

```java
@Controller
public class IndexController {
    //GET /@GetMapping("/")の場合、"/"は省略可能 -> @GetMapping のみでも動く
    @GetMapping
    @ResponseBody
    public String index(){
        return "<h1>Hello World!</h1>"; //この状態は、UI側と表示するコードが分離されてない為、役割の責務の境界が曖昧。UIとロジックを分離するように変更
        //この問題を解決する為に、templateエンジンを利用して開発に切り替える。
        //テンプレートエンジンは、テンプレート部分の記述にデータを入れて動的にページを生成する為の仕組み
        //今回利用するテンプレートエンジンはThymeleaf （URL:https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html）
    }
```

## index.htmlの作成 と IndexContorller.javaの生成

* src/main/resources/templates/index.html を作成
* src/main/java/com/example/mils/demo/IndexController.java の内容を書き換え

```java
    public String index(){
        return "index"; 
        //Spring MVCの機能として、Viewの拡張子を書かないでも良いように作られている
        //これは、テンプレートエンジンを他のものに切り替えた場合、例えば、JSPを利用すると、
        //index.jspとしなければならない。thymleafではindex.htmlの為、テンプレートエンジン
        //を切り替えた場合など、変更が大変にならないようになっている
    }
```