# Lombok

* lombokとはコンストラクタやセッター、ゲッターを自動生成するライブラリ
    
        Javaのクラスにフィールドが追加されるなど変更が加わる度に、コンストラクタやセッター、ゲッターを追加するなど
        決まったルールだが、手動でやるには手間が多く、管理が大変にかる箇所


[lombokのアノテーションを確認](https://projectlombok.org/features/all)

```
@AllArgsConstructor のアノテーションを追加するだけで全てのフィールドのコンストラクターが自動生成されている

AllArgsConstructor は、クラス内の各フィールドに 1 つのパラメータを持つコンストラクタを生成します。NonNull とマークされたフィールドは、これらのパラメータで NULL チェックを行います。
```

```
@Data のアノテーションを利用すると、ゲッターとセッターが全て自動生成される

Dataは、@ToString、@EqualsAndHashCode、@Getter / @Setter、@RequiredArgsConstructorの機能を束ねた便利なショートカットアノテーションです。言い換えれば、@Dataは、単純なPOJO（Plain Old Java Objects）やBeanに通常関連するすべての定型文を生成します。すべてのフィールドに対するゲッター、すべての非最終フィールドに対するセッター、クラスのフィールドに関わる適切なtoString、equals、hashCode実装、すべての最終フィールド、およびフィールドが決してNULLにならないように@NonNullでマークされている初期化子のないすべての非終了フィールドを初期化するコンストラクターがあります。
```

これらを利用することで、メンテナンス性が高まる。

利用例
```
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TodoEntity {
    private long id;
    private String summary;
    private String description;
}
```
