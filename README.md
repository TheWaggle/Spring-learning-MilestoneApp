# Spring-learning-MilestoneApp
MilestoneAppの開発工程を元にSpringの使い方を学びます。

## 開発環境のセットアップ v0.1
1. [Visual Studio Code インストール](https://azure.microsoft.com/ja-jp/products/visual-studio-code/)
2. [拡張機能の追加](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)
    ![Spring Extension-pack](/README-assets/spring-extension-pack.png)

    ![concourse](/README-assets/ConcourseCIPipelineEditor.png)

    ![Cloudfoundry](/README-assets/CloudfoundryManifestYMLSupport.png)

    ![日本語化パック](/README-assets/日本語化.png)

    ![lombok拡張機能](/README-assets/lombok-拡張.png)

    ![java Extensions-pack](/README-assets/java-extensions-pack.png)

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
* [TopPageの作成](/DESCRIPTION/TOPPAGEの作成.md)

### ModelとControllerとViewの作成
1. src/main/java/com/example/mils/demo/domain/milestone/MilestoneEntity.java を作成
2. src/main/java/com/example/mils/demo/web/milestone/MilestoneController.java を作成
3. src/main/java/com/example/mils/demo/web/IndexController.java に移動
    * [Debugとwatchのやり方](/DESCRIPTION/Debugとwatchのやり方.md)
4. /Users/yosuke-nk/Documents/LangJava/Spring-learning-MilestoneApp/demo/src/main/resources/templates/milestones/list.html を作成
    * [xmlnsの追加の書き方](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html#%E8%A4%87%E6%95%B0%E8%A8%80%E8%AA%9E%E3%81%A7%E3%82%A6%E3%82%A7%E3%83%AB%E3%82%AB%E3%83%A0)
5. Viewにリンクを貼る
    * [ページ間のリンク作成](/DESCRIPTION/ページ間のリンク作成.md) 

### Lombokを使ったリファクタリング v0.2

* [lombok](https://projectlombok.org/)
* [lombok使い方tips](/DESCRIPTION/Lombok.md)

### ３層アーキテクチャによるリファクタリング v0.2.1

* [3層アーキテクチャ](/DESCRIPTION/3層アーキテクチャ.md)とは
* /Users/yosuke-nk/Documents/LangJava/Spring-learning-MilestoneApp/demo/src/main/java/com/example/mils/demo/domain/milestone/MilestoneService.java にクラスを追加


### D I:Dependency Injection v0.2.2
* [Dependency Injection](/DESCRIPTION/DependencyInjection.md)

### 依存関係の追加 v0.2.3
* h2インメモリデータベースの設定とDBの準備
* [依存関係の追加の方法](/DESCRIPTION/依存関係の追加.md)



