# Spring-learning-MilestoneApp
MilestoneAppの開発工程を元にSpringの使い方を学びます。

## 開発環境のセットアップ 
1. [Visual Studio Code インストール](https://azure.microsoft.com/ja-jp/products/visual-studio-code/)
2. [拡張機能の追加](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)
    ![Spring Extension-pack](/README-assets/spring-extension-pack.png)

    ![concourse](/README-assets/ConcourseCIPipelineEditor.png)

    ![Cloudfoundry](/README-assets/CloudfoundryManifestYMLSupport.png)

    ![日本語化パック](/README-assets/日本語化.png)

## Spring Boot App 作成手順
1. [Ctrl + Shift + P]ショートカットキー または、[表示 -> Command palete]を選択
2. [Spring Initializr: Create a Maven Project]を選択
3. [Spring Boot version -> 2.6.3]を選択
4. [Specify project language -> Java]を選択
5. [Group id -> com.example.mils]に設定する
6. [Spring Initializr: Input Artifact Id ->  demo]に設定する
7. [Specify packaging type. -> Jar]に設定する
8. [Specify Java version. -> 11]に設定する
9. Serach for dependencies. 
    * 初回セットアップ（1日目）
        * thymeleaf
        * spring-boot-devtools
        * lombok
        * spring Web
    * 簡易DBセットアップ（2日目）
        * H2 Database
        * validation
        * Spring Data JPA
    * ログイン認証セットアップ（3日目）
        * security
        * spring session

## トップページの作成
### index.htmlの作成

* src/main/resources/templates/index.html

### indexControllerの作成

* src/main/java/com/example/mils/demo/IndexController.java

### Web開発 リクエストとレスポンス
[WEBの仕組み:MDN](https://developer.mozilla.org/ja/docs/Learn/Getting_started_with_the_web/How_the_Web_works)
* 必読:クライアントとサーバーの仕組み

### Web開発 テンプレートエンジン
* [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html)
* [TopPageの作成](/TOPPAGEの作成.md)

### ModelとControllerとViewの作成
1. src/main/java/com/example/mils/demo/domain/milestone/MilestoneEntity.java を作成
2. src/main/java/com/example/mils/demo/web/milestone/MilestoneController.java を作成
3. src/main/java/com/example/mils/demo/web/IndexController.java に移動

* [Debugとwatchのやり方](/Debugとwatchのやり方.md)
